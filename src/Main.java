import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printMyName("Dan"); //ex1
//        printSum(5,2); //ex2
//        printDivision(9,4);  //ex3
//        printCalculations(); //ex4

//        Calculator calculator = new Calculator();
//
//
//        afisareModel();
//        System.out.println(averageOfThreeNumbers(4,3,3));
//        System.out.println(restImpartire(8,3));
//        System.out.println(fahrenheitToCelsius(98));
//        System.out.println(inchToMeter(40));
//        distAndTimeToSpeed(90000,1,0,0);
//        circleCalculation(4);

        /** ------------- Assignment If-Else ------------- */
//        System.out.println(calculator.adunare(1,1));
//        System.out.println(calculator.scadere(5,2));
//        System.out.println(calculator.inmultire(3,3));
//        System.out.println(calculator.impartire(12,8));

        LogicalOp comparer = new LogicalOp();
        int biggestNumber = comparer.checkBiggerNumber(44,51);
        System.out.println("The biggest number is: " + biggestNumber);
        System.out.println(comparer.compareText(""));
        System.out.println(comparer.compareTextAndNumber("Evozon", 7));
        System.out.println(comparer.snowHeight(2));
        System.out.println(comparer.numbersComparation(5));
        comparer.printNumberSwitch(2);
        System.out.println("Is the number even? " + comparer.isNumberEven(0));

        //Exercise 10 - is eligible to vote
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age? \n");
        int age = scanner.nextInt();
        if(comparer.isEligibleToVote(age)){
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }

        //Exercise 11 -  max number between 3 inputs
        System.out.println("Introduceti 3 numere");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Biggest number is: " + comparer.maxNumber(a,b,c));

    }

    public static void printMyName(String name) {
        System.out.println("Hello");
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        System.out.println(a+b);
    }

    public static void printDivision(float a, float b) {
        System.out.println(a/b);
    }

    public static void printCalculations(){
        System.out.println(-5+8*6);  //a
        System.out.println((55+9)%9);  //b
        System.out.println(20+ (-3)*5/8);  //c
        System.out.println(5+15/3*2-8%3);  //d
    }

    public static void afisareModel(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |] ");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+");
    } // ex 3

    public static float averageOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return (float)(firstNumber+secondNumber+thirdNumber)/3;
    } // ex 4

    public static int restImpartire(int firstNumber, int secondNumber) {
        return firstNumber%secondNumber;
    } // ex 5

    public static float fahrenheitToCelsius(int tempF) {
        float celsius =  (float)5/9 * (tempF-32);
        return celsius;
    } // ex 6

    public static double inchToMeter(double inch) {
        return (inch * 0.0254);
    } // ex 7

    public static void distAndTimeToSpeed (float dist, int hours, int minutes, int seconds) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds; // 3600 seconds in 1 hour , 60 seconds in 1 minute
        float metersPerSecond= dist / totalSeconds;
        float meterPerHour = metersPerSecond * 60 * 60;
        float speedPerHour = meterPerHour/1000; // transforming to km/h
        double speedPerHourInMiles = speedPerHour * 0.62137; // transforming to miles/hour
        System.out.println("Total Seconds: " + totalSeconds);
        System.out.println("Speed per seconds: " + metersPerSecond + " m/s");
        System.out.println("Speed per hour: " + speedPerHour + " km/h");
        System.out.println("Speed per hour in miles: " + speedPerHourInMiles + " mi/h");
    } // ex 8

    public static void circleCalculation(int radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;
        System.out.printf("Perimeter : %.2f \n",perimeter);
        System.out.printf("Area : %.2f \n",area);
    } // ex 9

}