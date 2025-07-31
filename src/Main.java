//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printMyName("Dan"); //ex1

        printSum(5,2); //ex2

        printDivision(9,4);  //ex3

        printCalculations(); //ex4

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
}