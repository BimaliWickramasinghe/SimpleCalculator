package bw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile myfile = new readFile();
		if (myfile.readMyFile()==true) {
			System.out.println("What operation do you want to perform? :");
			operate newOp = new operate();
		}else {
			System.out.println("Fix the above error");
		}
	}

}
