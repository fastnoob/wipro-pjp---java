import java.lang.Math;
class Calculator {
	static double powerInt(int num1,int num2) {
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2) {
		return Math.pow(num1,num2);
	}
	public static void main(String args[]) {
		System.out.println(Calculator.powerInt(2,2));
		System.out.println(Calculator.powerDouble(22.3,2));
	}
}