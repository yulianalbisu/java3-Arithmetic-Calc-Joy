import calc.Arithmetic;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Float;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true){
			System.out.println("Enter your equation > ");
			String userInput = input.nextLine();

			String[] tokens = userInput.split(" ");
			// System.out.println(Arrays.toString(tokens));


			if (tokens[0].equals("q")){
				System.out.println("You will exit.");
				break;
			}
			else if (tokens.length < 2){
				System.out.println("Not enough inputs.");
				continue;
			}

			String operator = tokens[0];
			String num1 = tokens[1];
			String num2;
			// System.out.println(operator + num1);

			if (tokens.length < 3){
				num2 = "0";
			} else {
				num2 = tokens[2];
			}

			float result=0;

			float num1Float;
			float num2Float;

			try {
				num1Float = Float.parseFloat(num1);
				num2Float = Float.parseFloat(num2);
			} catch (NumberFormatException e){
				System.out.println("Those aren't numbers!");
				continue;
			}

			if (operator.equals("+")){
				result = Arithmetic.add(num1Float, num2Float);
			} else if (operator.equals("-")){
				result = Arithmetic.subtract(num1Float, num2Float);
			} else if (operator.equals("*")){
				result = Arithmetic.multiply(num1Float, num2Float);
			} else if (operator.equals("/")){
				result = Arithmetic.divide(num1Float, num2Float);
			} else if (operator.equals("square")){
				result = Arithmetic.square(num1Float);
			} else if (operator.equals("cube")){
				result = Arithmetic.cube(num1Float);
			} else if (operator.equals("pow")){
				result = Arithmetic.power(num1Float, num2Float);
			} else if (operator.equals("mod")){
				result = Arithmetic.mod(num1Float, num2Float);
			} else {
				System.out.println("Please provide an operator and two numbers.");
				continue;
			}

			System.out.println(result);
			
		}
	}
}




