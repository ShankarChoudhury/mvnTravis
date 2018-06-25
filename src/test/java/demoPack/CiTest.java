package demoPack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CiTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("This is a demo test to validate Travis Integration");
		
		System.out.println("This is a demo test to validate Travis Integration");
		
		String loc ="C:\\java-workspace\\applications\\demo.txt";
		
		FileWriter file = new FileWriter(loc,true);
		
		BufferedWriter print = new BufferedWriter(file);
	//	print.newLine();
		print.write("Hi! this is a test mesage"+"\n");
		print.newLine();
	//	print.append("1");
		
		print.close();
		file.close();
	}

}
