package demoPack;

public class DemoIF {

	public static void main(String[] args) {
		String actual="ABCD";
		String expected="abcd";
		
		boolean status=actual.equals(expected);
		
		if (!status) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
