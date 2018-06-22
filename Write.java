class Writer {
	Writer() {
		this.write("Writer Initialized!");
	}
	void write(String text) {
		System.out.println(text);
	}
}
public class Write {
	public static void main(String args[]) {
		Writer wr = new Writer();
		wr.write("hello bruh!");
	}
}

