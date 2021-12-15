
public class Fis implements t,t1 {

	public static void main(String[] args) {
		t1 t=new Fis();
//		t.show();
		
		for(int i=0;i<3;i++){
			switch(i){
			case 0 : break;
			case 1 : System.out.println("1");
			case 2 : System.out.println("12");
			case 3 : System.out.println("13");
			
			}
		}
		System.out.println("DONE");
		new Fis().get(10);
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Fis.show()L");
	}
	public void get(long a) {
		// TODO Auto-generated method stub
		System.out.println("Fis.show()D");
	}
	public void get(double d) {
		// TODO Auto-generated method stub
		System.out.println("Fis.show()");
	}


}
interface t{
	public void show();
}
interface t1{
//	public static void show();
}
