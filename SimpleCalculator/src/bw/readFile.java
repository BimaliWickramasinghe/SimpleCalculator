package bw;
import java.util.*;
import java.io.*;

public class readFile{
	//file content
	int[] num = new int[2];
	int count=0;
	
	//checks whether file exists
	public boolean readMyFile(){
		boolean validity = false;
		try {
			File myFile = new File("src\\bw\\myFile.txt");
			Scanner sc = new Scanner (myFile);
			while(sc.hasNext()) {
				if(check(sc.next())==true) {
					validity = true;
					continue;
				}else {
					validity = false;
					break;
				}
			}
			sc.close();
			return (validity);
		}
		catch (FileNotFoundException e){
			System.out.println("File doesnot exist");
			return false;
		}	
	}

	//Checks the validity of the content
	public boolean check(String sc) {
		try {
			num[count] = Integer.parseInt(sc);
			count +=1;
			return true;
		}catch(NumberFormatException e) {
			System.out.println("Invalid format");
			return false;
		}
	}
}
