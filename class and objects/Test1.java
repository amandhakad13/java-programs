class Calculator {
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	int mul(int num1, int num2) {
		return num1*num2;
	}
	
	int sub(int num1, int num2) {
		return num1-num2;
	}
	
	int div(int num1, int num2) {
		return num1/num2;
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println("Addition is : "+c1.add(10, 6));
		System.out.println("Multiplication is : "+c1.mul(10, 6));
		System.out.println("Division is : "+c1.div(10, 6));
		System.out.println("Subtraction is : "+c1.sub(10, 6));
		
	}
}