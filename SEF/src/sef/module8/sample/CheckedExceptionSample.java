package sef.module8.sample;
// Needs to be completed
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionSample {

	public static void main(String arg[]){
		
		String fileName = "SomeFileThatDoesNotExist.txt";
		
		//The following class is used to open a file for reading
		FileReader reader ;
		try{
		//The following line must be written in a try catch block
			//else it would not compile since
			//FileNotFoundException is a checked exception.
			//1 - Instantiate reader and pass fileName as a parameter
		   reader = new FileReader(fileName);
		}
		//2 - catch FileNotFoundException
		catch(FileNotFoundException e)
		{
			System.out.println("The file is not found: " + e.getMessage());
		}



    }
}
