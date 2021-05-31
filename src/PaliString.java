
public class PaliString {
	final Integer in=new Integer(10);
	final String s=new String("TEST");
public static void main(String[] args) {
	String originalString="abccba";
	
	char ch1 = '\u0069';
	char ch2 = '\u0130';
	System.out.println(ch2);
	System.out.println(originalString.intern());
	
	
	paliStringCheck(originalString);
	String replaced=originalString.replaceAll("c", "O") ;
	System.out.println(replaced);
	 StringBuilder strBuilder = new StringBuilder(originalString);
     String reverseString = strBuilder.reverse().toString();

      
    boolean isPalindrame = originalString.equals(reverseString);
     
    System.out.println(isPalindrame);    //true
	
}

private static void paliStringCheck(String palis) {
	// TODO Auto-generated method stub
	char ch;
	String reverse="";
	for (int i = palis.length()-1; i >=0 ; i--) {
		ch =palis.charAt(i);
		reverse =reverse+ch;
	}
		if (reverse.equals(palis)) {
			System.out.println("True");
			
		}else{
			System.out.println("Flase");
			
		}
	
	
}

private void testStrring(final int i) {
	// TODO Auto-generated method stub
i=i+10;

in=in+10;
s=s+"T";
}
}

