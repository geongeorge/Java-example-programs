/** This is a Simple Addition program.
Input is taken as command line arguements*/
public class Add {
	public static void main(String args[]) {
		/** Usage Java Add num1 num2*/
		int a,b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}