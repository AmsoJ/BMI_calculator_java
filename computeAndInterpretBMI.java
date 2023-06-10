import java.util.Scanner;

public class computeAndInterpretBMI {
    static void print(String x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("Please enter your weight in pounds and your height in inches... eg: 50.0, 6.6");
        double weight = input.nextDouble(), height = input.nextDouble(), BMI;
        String result = "";
        // change the weight to kilogram
        weight *= 0.45359237;
        // change the height to meters
        height *=  0.0254;
        // body mass index calculation
        BMI = weight / Math.pow(height, 2);
        // conditions or alternative path for execution
        if(BMI < 18.5)
            result = "Underweight";
        else if(BMI >= 18.5 && BMI < 25.0) 
            result = "Normal";
        else if (BMI >= 25.0 && BMI < 30.0) 
            result = "Overweight";
        else if (BMI >= 30.0) 
            result = "Obese";

        print("Your BMI is: " + BMI);
        print(result);
    }
}