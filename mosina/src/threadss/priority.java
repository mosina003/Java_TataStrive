 
package threadss;
class AB extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("\t From thread A: i="+i);
		}
		System.out.println("Exit from A");
	}
}
class BC extends Thread{
	public void run() {
		for(int j=0;j<=5;j++) {
			System.out.println("\t From thread B: j="+j);
		}
		System.out.println("Exit from B");
	}
}
class CD extends Thread{
	public void run() {
		for(int k=0;k<=5;k++) {
			System.out.println("\t From thread C: k="+k);
		}
		System.out.println("Exit from C");
		}
	}
class priority {
	public static void main(String[] args) {
		AB threadA =new AB();
		BC threadB =new BC();
		CD threadC =new CD();
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority()-1);
		threadA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("started thread A");
		threadA.start();
		System.out.println("started thread B");
		threadB.start();
		System.out.println("started thread C");
		threadC.start();
		System.out.println("end of main thread");
	}

}
