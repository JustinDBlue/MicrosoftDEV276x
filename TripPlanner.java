import java.text.SimpleDateFormat;
import java.util.Scanner;

public class demo1{
//Calling all methods
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        newUser(input);
        travelBudget(input);
        timeDifference(input);
        countryArea(input);

    }

//Greeting the customer
    public static void newUser(Scanner input) {

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?" );
        System.out.print("Nice to meet you " + input.nextLine() + ", where are you travelling to?");
        System.out.println("Great! " + input.nextLine() + " sounds like a great trip!");

    }

//Calculating the spending limits
    public static void travelBudget(Scanner input) {

        System.out.print("How many days are you going to spend travelling?");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD?");
        double conversion = input.nextDouble();
        int hours = days * 24;
        int minutes = hours * 60;
        double dailyLimit1 = money / days;
        double totalBudget = conversion * money;
        double dailyLimit2 = totalBudget / days;

        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes.");
        System.out.println("If you are going to spend " + money + " USD that means per day you can spend up to " + dailyLimit1 + " USD.");
        System.out.println("Your total budget in " + symbol + " is " + totalBudget + " " + symbol + ", which per day is " + dailyLimit2 + " " + symbol);
    }

//Calculating the time difference from home to destination
    public static void  timeDifference(Scanner input) {

        System.out.print("what is the time difference, in hours, between your home and your destination?");
        int timeDiff = input.nextInt();

        System.out.println("That means that when it is midnight at home it will be " + (24 + timeDiff) % 24 +
                ":00 in  your travel destination and when it is noon at home it will be " + (12 + timeDiff) % 24 + ":00");
    }

//Reporting the size of the country: miles = km * 0.62137
    public static void countryArea(Scanner input) {

        System.out.print("What is the square area of your destination country in km squared?");
        double inKilometers = input.nextDouble();
        double miles = inKilometers * 0.62137;

        System.out.println("In miles squared that is " + miles);
    }
}

