package bw;
import java.util.*;

public class Main{

	public static void main(String[] args) {
		readFile myfile = new readFile();            //create object of class readFile
		Scanner myInput = new Scanner(System.in);    //create object to get the output

		System.out.println("Type file location : "); //get the file location
		String path = myInput.nextLine(); 
		myfile.myPath(path);                         //calls myPath to set the file path
		
		if (myfile.readMyFile()==true) {             //check whether file exists and its validity
			System.out.println("\nadd - for addition\nsub - for substraction\nmul - for Multiplication\ndiv - for divsiion\nmod - for moduls");
			System.out.println("Type the operation you want to perform :");
			
			String op = myInput.nextLine();          //takes the user input
			myfile.oper(op);                         //do the operations
			myInput.close();
		}else{
			System.out.println("Fix the above error");    //any error is informed
		}
	}
}
