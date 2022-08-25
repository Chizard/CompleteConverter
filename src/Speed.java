import java.util.Scanner;

public class Speed {

    public static void speedCalculator() {
        Scanner choice = new Scanner(System.in);
        float value;
        float convertedValue;


        System.out.println("What value do you want to convert?");


        value = choice.nextFloat();

        convertedValue = (float) (value*1.609344);
        System.out.println("-------------------------");
        System.out.println(value + " MPH is " + convertedValue + " KMPH");

        convertedValue = (float) (value*0.6213711922);
        System.out.println(value + " KMPH is " + convertedValue + " MPH");
        System.out.println("-------------------------\n");


    }

}
