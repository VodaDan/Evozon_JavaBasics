//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        printMyName("Dan"); //ex1
//        printSum(5,2); //ex2
//        printDivision(9,4);  //ex3
//        printCalculations(); //ex4

        System.out.println(adunare(1,1));
        System.out.println(scadere(5,2));
        System.out.println(inmultire(3,3));
        System.out.println(impartire(12,8));

        afisareModel();
        System.out.println(averageOfThreeNumbers(4,3,3));
        System.out.println(restImpartire(8,3));
        System.out.println(fahrenheitToCelsius(98));
        System.out.println(inchToMeter(40));

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

    public static int adunare(int a, int b){
        return a+b;
    }

    public static int scadere(int a, int b){
        return a-b;
    }

    public static int inmultire(int a, int b){
        return a*b;
    }

    public static float impartire(float a, float b){
        return a/b;
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
    }



}