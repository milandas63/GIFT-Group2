package com.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	//	read from data.txt and write to tata.txt
	public static void main(String[] args) {
		try {
			File f = new File("help.pdf");
			long size = f.length();
			int fivePC = (int)(size*0.05);
			int count = 0;

			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream("pleh.pdf");
			
			int n;
			while( (n=fis.read())!=-1 ) {
				fos.write(n);
				count++;
				if(count>=fivePC) {
					System.out.print(".");
					count = 0;
				}
			}
			
			fos.close();
			fis.close();
			
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
			
		}
	}

}
