

class Testss{
	final static int x;
	static {
		x = 20;
		System.out.println("st");
	}	
	
}
public class TESTT extends Thread {
	public void run(){
		System.out.println("RUN");
	}
	static {
		System.out.println("dh");
		System.exit(0);
	}
	 static public void main(String[] args) {
		 TESTT t=new TESTT();
		 TESTT t1=new TESTT();
		 t.start();
		 t1.start();
//		System.out.println(Testss.x);
	}
	
}
