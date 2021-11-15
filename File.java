package com.technoelevate.java.exception;

import java.io.IOException;

public class File {

	public static void main(String[] args) {
   java.io.File file=new java.io.File("C:\\New folderFile.txt");
   
   try {
	file.createNewFile();
	System.out.println("File created");
} catch (IOException e) {
	System.out.println("Unable to create file");
//	e.printStackTrace();
}
   }

}
