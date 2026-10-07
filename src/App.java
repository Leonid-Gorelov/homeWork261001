import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int lastDigit = number % 10;

        System.out.println(lastDigit);*/
        /*Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int lastDigit = number % 10;
        int mediumDigit = number % 100 / 10;
        int firstDigit = number % 1000 / 100;
        int sum = lastDigit + mediumDigit + firstDigit;

        System.out.println(sum);*/

        /*Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int nextNumber = number / 2 * 2 + 2;

        System.out.println(nextNumber);*/

        /*Scanner in = new Scanner(System.in);
        int rublesCost = in.nextInt();
        int copeeksCost = in.nextInt();
        int count = in.nextInt();

        double costDouble = rublesCost + (double)copeeksCost / 100;

        int rublesResultCost = (int)(costDouble * count);

        int copeeksResultCost = (int)((costDouble * count - rublesResultCost) * 100 + .1);

        rublesResultCost += copeeksResultCost / 100;

        if (copeeksResultCost % 100 == 0) {
            copeeksResultCost = 0;
        }

        while (copeeksResultCost > 100)
        {
            copeeksResultCost /= 10;
        }

        System.out.println(rublesResultCost + " " + copeeksResultCost);*/

        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();

        int minutes = seconds / 60;
        int hours = minutes / 60;

        while (hours > 24)
        {
            hours -= 24;
        }

        while (minutes > 60)
        {
            minutes -= 60;
        }

        if (hours == 0 && seconds > 3600) {
            hours = 12;
        } else if (seconds < 3600) {
            hours = 0;
        } else if (hours % 36 == 0) {
            hours = 12;
        } else if (hours % 24 == 0) {
            hours = 0;
        }

        minutes %= 60;
        seconds %= 60;

        String hoursString, minutesString, secondsString;


        hoursString = "" + hours;

        if (minutes < 10) {
            minutesString = "0" + minutes;
        } else {
            minutesString = "" + minutes;
        }

        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + seconds;
        }

        System.out.println(hoursString + ":" + minutesString + ":" + secondsString);
    }
}
