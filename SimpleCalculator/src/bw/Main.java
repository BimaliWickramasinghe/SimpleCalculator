package bw;
import java.util.*;

public class Main{

	public static void main(String[] args) {
		readFile myfile = new readFile();            //create object of class readFile
		Scanner myInput = new Scanner(System.in);    //create object to get the output
		
		if (myfile.readMyFile()==true) {             //check whether file exists and its validity
			System.out.println("Type the arithmetic operator to perform a calculation : ");
			String op = myInput.nextLine();          //takes the user input
			myfile.oper(op);                         //do the operations
			myInput.close();
		}else {
			System.out.println("Fix the above error");    //ny error is informed
		}
	}
}
