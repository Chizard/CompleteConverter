import java.util.Scanner;

public class Temperature {


    public static void temperatureCalculator() {
        Scanner choice = new Scanner(System.in);
        float value;
        float value2;
        float convertedValue;


        System.out.println("What value do you want to convert?");

        value = choice.nextFloat();

        value2 = (float) (value-32);
        convertedValue = (float) (value2*(5)/9);
        System.out.println("-------------------------------------");
        System.out.println(value + " Fahrenheit is " + convertedValue + " Celsius");

        convertedValue = (float) ((value*(1.8))+32);
        System.out.println(value + " Celsius is " + convertedValue + " Fahrenheit");
        System.out.println("-------------------------------------\n");


    }



}
