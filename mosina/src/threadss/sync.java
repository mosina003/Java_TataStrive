package threadss;

class SharedResource{
	synchronized void number(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
}
class Mythread extends Thread{
	SharedResource res;
	int num;
	Mythread(SharedResource res,int num){
		this.res=res;
		this.num=num;
	}
	public void run() {
		res.number(num);
	}
}
public class sync {
	public static void main(String[] args) {
		SharedResource res=new SharedResource();
		Mythread T1=new Mythread(res,2);
		Mythread T2=new Mythread(res,5);
		T1.start();
		T2.start();
	}

}
