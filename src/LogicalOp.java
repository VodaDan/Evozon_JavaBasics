import java.util.List;

public class LogicalOp {

    public int checkBiggerNumber(int a, int b) {
        if(a>b){
            return a;
        } else {
            return b;
        }
    }

    public String compareText(String text) {
        if(text.toLowerCase().equals("evozon")) {
            text = "Learning text comparison!";
        } else {
            text = "Got to try some more";
        }
        return text;
    }

    public String compareTextAndNumber(String text, int number) {
        if(text.toLowerCase().equals("evozon") && number >= 4) {
            return String.valueOf(number) + text;
        } else {
            return  text + String.valueOf(number);
        }
    }

    public String snowHeight(int cm) {
        if(cm > 8 || cm == 6){
            return "The amount of snow this winter was(cm):  " + String.valueOf(cm);
        } else {
            return "The forecast snow is(cm):" + String.valueOf(cm);
        }
    }

    public String numbersComparation(int number) {
        if(number == 4){
            return "The number is equal to 4";
        } else if(number > 3) {
            return "The number is greater than 3 and not equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    public void printNumberSwitch(int number){
        switch (number) {
            case 1:
                System.out.println("The number is: 1");
                break;
            case 2:
                System.out.println("The number is: 2");
                break;
            case 3:
                System.out.println("The number is: 3");
                break;
            case 4:
                System.out.println("The number is: 4");
                break;
            case 5:
                System.out.println("The number is: 5");
                break;
            default:
                System.out.println("I kindly ask you to use lower numbers(1-5)..");

        }
    }

    public boolean isNumberEven (int number) {
        if(number%2==0) {
            return true;
        } else {
            return false;
        }
    }

    


}
