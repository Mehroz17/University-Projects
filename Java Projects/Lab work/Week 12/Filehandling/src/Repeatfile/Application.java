package Repeatfile;


import java.io.*;

public class Application {

	public static void main(String[] args) throws IOException {

		File file = new File("D:/sports.txt");
		if (file.exists()) {
			System.out.println("File already exists.");
		}else {
			file.createNewFile();
			System.out.println("File successfully created.");
		}
		
		FileOutputStream fo = new FileOutputStream(file, true);
		FileInputStream fin = new FileInputStream(file);
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		String sports = "cricket";
		
		byte v[] = sports.getBytes();
		fo.write(v);
		
		int n;
		
		//System.out.println("writing using character array");
		char c[] = sports.toCharArray();
		for (n=0;n<sports.length();n++) {
			fo.write(c[n]);
		}
		
		
		//reading using FileInputStream
		//negative index will prompt you the end of file
		System.out.println("Reading using FileInputStream.");
		do {
			n=fin.read(); //.read method returns the numeric representation of a character
			System.out.print((char)n);
		}while(n!=-1);
		

		System.out.print("Reading using BufferedReader.");
		while ((n=br.read())!=-1) {
			System.out.print((char)n);
		}


	}

}
