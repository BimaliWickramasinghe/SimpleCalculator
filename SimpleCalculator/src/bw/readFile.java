package bw;
import java.util.*;
import java.io.*;

public class readFile{
	//constructor of superclass readFile
	readFile(){
		try {
			File myFile = new File("src\\bw\\myFile.txt");
			Scanner sc = new Scanner (myFile);
			while(sc.hasNext()) {
				check(sc.next());
			}
			sc.close();
		}
		catch (FileNotFoundException e){
			System.out.println("File doesnot exist");
		}	
		
	}

	
	//Checks the validity of the content
	public void check(String sc) {
		System.out.println(sc);
	}
}
