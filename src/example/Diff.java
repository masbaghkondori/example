package example;
public class Diff {
public static void main(String [] args){
	int n=9;

	diff21(7);
	System.out.println("kdkjd");
}
	public static int diff21(int n) {
		  if (n <= 21) {
		    return 21 - n;
		  } else {
		    return (n - 21) * 2;
		  }
		}

}