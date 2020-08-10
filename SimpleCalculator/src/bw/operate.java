package bw;

public class operate{
	int a;
	int b;
	int ans;

	public void setNum1(int num1) {            //stores number 1
		this.a= num1;
	}
	public void setNum2(int num1) {            //stores number 2
		this.b= num1;
	}

	public void oper(String op) {              //do arithmetic operations
		try {
			switch (op) {
			case "add":
				ans= a+b;
				break;
			case "sub":
				ans= a-b;
				break;
			case "div":
				ans= a/b;
				break;
			case "mul":
				ans= a*b;
				break;
			case "mod":
				ans= a%b;
			default:                          //handles invalid operators
				System.out.println("Invalid operator");
			}
			System.out.println("Your answer is : "+ ans);  //shows the answer
		}catch(ArithmeticException e) {        //handles any arithmetic exceptions
			System.out.println(e);
		}
	}
}
