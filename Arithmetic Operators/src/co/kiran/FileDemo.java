package co.kiran;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) throws IOException {
	char[] arr = new char[100];
	//File file =new File("C:\\Users\\Dell\\Desktop\\18A31A0282_python\\test.txt");
	FileReader input = null;
	try {
		input = new FileReader("C:\\Users\\Dell\\Desktop\\18A31A0282_python\\test.txt");
		input.read(arr);
	}catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		input.close();
	}
	System.out.println("Reading the file :::");
	System.out.println(arr);
	/*boolean val = false;
	try {
		val = file.createNewFile();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}if(val) {
		System.out.println("File created successfully ");
	}else {
		System.out.println("File creation failed...");
	}*/
}
}
//Sorted method in stream
//reduce method and optional type(ifPresent method)
//StringBuilder and StringBuffer methods
//Threads -> how to crate threads,sleep(),<<join(),wait(),notify(),notifyAll()>>
//Thread lifecycle -- different thread stages (New->Runnable->Running->wait->dead)
//Deadlock
//synchronization
//File handling in JAVA (creation of file,read a file,write into a file,delete a file)
// 


//Design and jUnit
