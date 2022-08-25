import java.util.Scanner;

public class Weight {


    public static void weightCalculator() {
        Scanner choice = new Scanner(System.in);
        float value;
        float convertedValue;


        System.out.println("What value do you want to convert?");

        value = choice.nextFloat();

        convertedValue = (float) (value*0.45359237);
        System.out.println("-------------------------");
        System.out.println( value + " lbs is " + convertedValue + " kgs");

        convertedValue = (float) (value*2.2046226218);
        System.out.println(value + " kgs is " + convertedValue + " lbs");
        System.out.println("-------------------------\n");


    }


}
