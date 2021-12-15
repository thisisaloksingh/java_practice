
public class ArrayPractice {
	
	public static void main(String[] args) {
		int arrr[]={3,0,7,0,5,0};
		int count=0;
		for (int i = 0; i < arrr.length; i++) {
			if (arrr[i]!=0) {
				arrr[count++]=arrr[i];
			}
		}
		while(count<arrr.length){
			
			arrr[count++]=0;
		}
		for (int i = 0; i < arrr.length; i++) {
			System.out.println(arrr[i]);
		}
		
	}
	

}
