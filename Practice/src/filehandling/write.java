package filehandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class write {

	public static void main(String[] args) throws IOException {
		//File Handling
		/*
		 * File f=new File();
		 * FileWriter fw=new FileWriter();
		 * BufferedWriter bw=new BufferedWriter();
		 * */

		
		File f=new File("/Users/resh/eclipse-workspace/Practice/src/filehandling//reshu.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi");
		bw.newLine();
		bw.write("Hello");
		bw.close();
	}

}
