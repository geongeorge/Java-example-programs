import java.io.*;
public class Readfile {
	public static void main(String args[]) throws IOException{
		FileInputStream fis;
		try {
			fis = new FileInputStream(args[0]);

			int ch;
			ch = fis.read();
			while(ch != -1) {
				System.out.print((char) ch);
				ch = fis.read();
			}	
			fis.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not found");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter Filename!");
		}
	}
}