package _16_Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _9_FileHandling {
	public static void main(String[] args) {
//		File file = new File("vivek.txt");
//		try {
//			file.createNewFile();
//			System.out.println("file created successfully");
//		}
//		catch(IOException e) {
//			System.out.println("cant able to create file" +e);
//		}
//		try {
//			FileWriter fileWriter = new FileWriter("vivek.txt");
//			fileWriter.write("this is filehandling topic. \n we took several hour to locate this file in pc.");
//			fileWriter.close();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		File file = new File("vivek.txt");
//		try {
//			Scanner sc = new Scanner(file);
//			while(sc.hasNextLine()) {
//				String line = sc.nextLine();
//				System.out.println(line);
//				}
//			sc.close();
//		}
//			catch(FileNotFoundException e) {
//				e.printStackTrace();
//			}
		
		File file = new File("vivek.txt");
		if(file.delete()) {
			System.out.println("i have deleted my file" + file.getName());
		}
		else {
			System.out.println("i got some erro");
		}
		
		
		
		
		
		
 }
	
}


