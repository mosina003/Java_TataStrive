package threadss;

public class StringBB {
	public static void main(String[] args) {
		long StartTime, EndTime;
		//STRING BUILDER
		StringBuilder stringbuilder=new StringBuilder("hello");
		StartTime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			stringbuilder.append("mosina");
		}
		EndTime=System.nanoTime();
		System.out.println("stringbuilder time : "+(EndTime-StartTime)+"ns");
		//STRINGBUFFER
		StringBuffer stringbuffer=new StringBuffer("Hello");
		StartTime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			stringbuffer.append("thendral");
		}
		EndTime=System.nanoTime();
		System.out.println("strinbuffer time : "+(EndTime-StartTime)+"ns");
	}
}
