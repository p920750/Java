package projects;
import java.util.Random;
class NumberManager {
	private int randNumber;
	private boolean randCheck=false;
	public synchronized void generateNumber() {
		randNumber=new Random().nextInt(99)+2;
		System.out.println("Generated Random Number is:"+randNumber);
		randCheck=true;
		notifyAll();
	}
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!randCheck||randNumber%2!=0) {
			wait();
		}
		 for(int i=2;i<=randNumber;i+=2) {
			 System.out.print(i+"\t");
		 }
		 randCheck=false;
		 System.out.println();
	}
    public synchronized void printOddNumbers() throws InterruptedException {
	while(!randCheck||randNumber%2==0) {
		wait();
	}
	 for(int i=1;i<=randNumber;i+=2) {
		 System.out.print(i+"\t");
	 }
	 randCheck=false;
	 System.out.println();
   }
}





class NumberGenerator extends Thread {
	NumberManager obj;
	public NumberGenerator(NumberManager obj) {
		this.obj=obj;
	}
	public void run() {
		while(true) {
		obj.generateNumber();
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
   }
}




class EvenPrinterThread extends Thread {
	NumberManager obj;
	public EvenPrinterThread(NumberManager obj) {
		this.obj=obj;
	}
	public void run() {
		while(true) {
			try {
			obj.printEvenNumbers();
		   }
			catch(InterruptedException e) {
				e.printStackTrace();
		   }
		}
	}
}





class OddPrinterThread extends Thread {
	NumberManager obj;
	public OddPrinterThread(NumberManager obj) {
		this.obj=obj;
	}
	public void run() {
		while(true) {
			try {
			obj.printOddNumbers();
		   }
			catch(InterruptedException e) {
				e.printStackTrace();
		   }
		}
	}
}






public class EvenOddd_Thread {
	public static void main(String []args) {
		NumberManager obj=new NumberManager();
		NumberGenerator ob2=new NumberGenerator(obj);
		EvenPrinterThread obj3=new EvenPrinterThread(obj);
		OddPrinterThread obj4=new OddPrinterThread(obj);
		ob2.start();
		obj3.start();
		obj4.start();
	}
}
