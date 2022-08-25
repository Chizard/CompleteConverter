import java.util.Scanner;

public class Distance {

    public static void distanceCalculator() {
        Scanner choice = new Scanner(System.in);
        float value;
        float inchesToCentimeters;
        float inchesToMeters;
        float inchesToKilometers;
        float feetToCentimeters;
        float feetToMeters;
        float feetToKilometers;


        System.out.println("What value do you want to convert?");

        value = choice.nextFloat();

        inchesToCentimeters = (float) (value*2.54);
        inchesToMeters = (float) (value*0.0254);
        inchesToKilometers = (float) (value / 39370.1);

        System.out.println("----------------------------------");
        System.out.println(value + " inches is " + inchesToCentimeters + " CM");
        System.out.println(value + " inches is " + inchesToMeters + " M");
        System.out.println(value + " inches is " + inchesToKilometers + " KM");

        System.out.println("----------------------------------");

        feetToCentimeters = (float) (value*30.48);
        feetToMeters = (float) (value*0.3048);
        feetToKilometers = (float) (value / 3280.84);

        System.out.println(value + " feet is " + feetToCentimeters + " CM");
        System.out.println(value + " feet is " + feetToMeters + " M");
        System.out.println(value + " feet is " + feetToKilometers + " KM");
        System.out.println("----------------------------------\n");


    }


}
