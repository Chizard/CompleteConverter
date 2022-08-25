import java.text.ParseException;
import java.util.Scanner;

public class Main {

    static Scanner choice = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {

        run();

    }

    public static void run() {
        boolean running = true;
        while (running) {
            running = menuSwitch(choiceMenu());
        }
    }

    public static int choiceMenu() {
            int ans = 0;
            boolean run = true;
            while (run) {
                System.out.println(
                        "Welcome to the converter!\n" +
                                "Please choose what you want to convert: ");
                System.out.println(
                        "1. Speed\n" +
                                "2. Weight\n" +
                                "3. Distance\n" +
                                "4. Temperature\n" +
                                "5. Quit");

                System.out.print("Choice: ");
                if (choice.hasNextInt()) {
                    ans = choice.nextInt();
                    run = false;
                } else {
                    choice.next();
                }
            }
            return ans;
    }

    public static boolean menuSwitch(int ans) {
        boolean run = true;

    switch (ans) {

        case 1:
            Speed.speedCalculator();
            break;

        case 2:
            Weight.weightCalculator();
            break;

        case 3:
            Distance.distanceCalculator();
            break;

        case 4:
            Temperature.temperatureCalculator();
            break;

        case 5:
            run = false;
            break;
}

        return run;
    }

}
