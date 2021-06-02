package calc;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;


public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1+num2;
	}

	public static float subtract(float num1, float num2) {
		return num1-num2;
	}

	public static float multiply(float num1, float num2) {
		return num1*num2;
	}

	public static float divide(float num1, float num2) {
		return num1/num2;
	}

	public static float square(float num1) {
		return num1*num1;
	}

	public static float cube(float num1) {
		return num1*num1*num1;
	}

	public static float power(float num1, float num2) {
		return (int) Math.pow(num1, num2);
	}

	public static float mod(float num1, float num2) {
		return num1%num2;
	}
	public static float cubs(float num1, float num2) {
		return num1*num1*num1 * num2*num2*num2; //I was using () around, no! is not like that
	}
	public static float rand(float num1, float num2){
		return (float)(Math.random()*(num2-num1+1)+num1); //on this method (int)Math.floor(Math.random()*(max-min+1)+min), we got rid of Math.floor
	}
}