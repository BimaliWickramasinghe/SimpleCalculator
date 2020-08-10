package bw;
import java.util.*;
import java.io.*;

public class readFile extends operate{             //handles file handling
	int[] num = new int[2];
	int count=0;
	
	public boolean readMyFile(){                   //check whether file exists and its validity
		boolean validity = false;                  //initialize validity to false
		
		try {
			File myFile = new File("src\\bw\\myFile.txt"); //open file
			Scanner sc = new Scanner (myFile);      //read line
			while(sc.hasNext()) {                   //check validity
				if(check(sc.next())==true) {        //if the content is an integer validity is true
					validity = true;
					continue;
				}else {                             // if the content is not an integer validity is false
					validity = false;
					break;
				}
			}
			sc.close();
			
			System.out.println("Your file contains;");
			show();                                //calls show() to show the file content
			
			this.setNum1(num[0]);                  //pass number 1 to operate class
			this.setNum2(num[1]);                  //pass number 2 to operate class 
			
			return (validity);
		}
		catch (FileNotFoundException e){           //handles FileNotFoundException
			System.out.println("File doesnot exist");
			return false;
		}	
	}

	                                               //Checks the validity of the content
	public boolean check(String sc) {
		try {
			num[count] = Integer.parseInt(sc);     //stores the value in an array
			count +=1;                             //increment the counter by one
			if(count>2) {                          //warn the user if there are more than two lines
				System.out.println("There are more than two lines in the file");
				return false;
			}
			return true;
		}catch(NumberFormatException e) {          //errors cause to invalid formats are handled 
			System.out.println("Invalid format");
			return false;
		}
	}
	
	public void show() {                          //Shows the file content
		System.out.println(num[0]);
		System.out.println(num[1]);
	}
}
