package methodReference;

public class Test1 {

	public static void main(String[] args) {
		
		Isum isum=Test1::addition;
		System.out.println(isum.sum(1, 8));
	}
	
	static int addition(int a, int b) {
		return a+b ;
	}
}
