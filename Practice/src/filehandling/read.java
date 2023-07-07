package filehandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class read {

	public static void main(String[] args) throws IOException {
		/*
		 * File
		 * FileReader
		 * Buffered Reader
		 * 
		 * */

		File f=new File("/Users/resh/eclipse-workspace/Practice/src/filehandling/reshu.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	}

}
