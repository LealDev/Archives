package fileWriterAndBuffeterWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ProgramWR {

		public static void main(String[] args) {
			
			String[] lines = new String[] {"good morning","good afternoon","good night"};
			
			String path = "c:\\temp\\out.txt";
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
		}
	}


