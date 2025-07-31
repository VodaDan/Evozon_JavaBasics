public class LogicalOp {

    public int checkBiggerNumber(int a, int b) {
        if(a>b){
            return a;
        } else {
            return b;
        }
    } // Assignment if-else - ex 3

    public String compareText(String text) {
        if(text.toLowerCase().equals("evozon")) {
            text = "Learning text comparison!";
        } else {
            text = "Got to try some more";
        }
        return text;
    } // Assignment if-else - ex 4

    public String compareTextAndNumber(String text, int number) {
        if(text.toLowerCase().equals("evozon") && number >= 4) {
            return String.valueOf(number) + text;
        } else {
            return  text + String.valueOf(number);
        }
    } // Assignment if-else - ex 5

    public String snowHeight(int cm) {
        if(cm > 8 || cm == 6){
            return "The amount of snow this winter was(cm):  " + String.valueOf(cm);
        } else {
            return "The forecast snow is(cm):" + String.valueOf(cm);
        }
    } // Assignment if-else - 6

    public String numbersComparation(int number) {
        if(number == 4){
            return "The number is equal to 4";
        } else if(number > 3) {
            return "The number is greater than 3 and not equal to 4";
        } else {
            return "The number is lower than 3";
        }
    } // Assignment if-else - ex 7

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
    } // Assignment if-else - ex 8

    public boolean isNumberEven (int number) {
        if(number%2==0) {
            return true;
        } else {
            return false;
        }
    } // Assignment if-else - ex 9

    public boolean isEligibleToVote(int age) {
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    } // Assignment if-else - ex 10

    public int maxNumber(int a, int b, int c){
        if(a > b) {
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else if(b > c){
            return b;
        } else {
            return c;
        }
    } // Assignment if-else - ex 11

    public void countToOneHundredFrom(int number) {
        System.out.println("\n---- Starting the counting to 100 from "+number+" ----");
        for (int i = number; i<=100; i++){
            if(i==100){
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }

        }
        System.out.println("\n---- Finished the counting to 100 ----");
    } // Assignment For Loops - ex 1

    public void countToMinusOneHundredFrom(int number) {
        System.out.println("\n---- Starting the counting to -100 from "+number+" ----");
        for (int i = number; i>=-100; i--){
            if(i==-100){
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }

        }
        System.out.println("\n---- Finished the counting to -100 ----\n");
    } // Assignment For Loops - ex 2

    public void countFromStartToEnd(int start, int end) {
        System.out.println("\n---- Starting the counting to "+end+" from "+start+" ----");
        if(start < end){
            for (int i = start; i<=end; i++){
                if(i==end){
                    System.out.print(i);
                } else {
                    System.out.print(i+",");
                }
            }
        } else {
            for (int i = start; i>=end; i--){
                if(i==end){
                    System.out.print(i);
                } else {
                    System.out.print(i+",");
                }
            }
        }

        System.out.println("\n---- Finished the counting to "+end+" ----\n");
    } // Assignment For Loops - ex 3

    public void countToBiggestOfInputs(int a, int b) {
        int start;
        int end;
        if(a>=b){
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }
        System.out.println("\n---- Starting the counting to "+end+" from "+start+" ----");
            for (int i = start; i<=end; i++){
                if(i==end){
                    System.out.print(i);
                } else {
                    System.out.print(i+",");
                }
            }
        System.out.println("\n---- Finished the counting to "+end+" ----\n");
    } // Assignment For Loops - ex 4

    public void printEvenToOneHundred(){
        for(int i = 2; i<=100; i=i+2) {
            if(i==100){
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }
        }
        System.out.println();
    }

    public void printOddToOneHundred(){
        for(int i = 0; i<=100; i++) {
            if(i%2==1){
                if(i==99){
                    System.out.print(i);
                } else {
                    System.out.print(i+",");
                }
            }
        }
        System.out.println();
    }

    public int sumToOneHundred() {
        int sum=0;
        for(int i = 0 ;i<=100 ;i++ ){
            sum = sum+i;
        }
        return sum;
    }

    public float averageOfNumberFrom(int start) {
        int totalNumbers=101-start;
        float sum=0;
        for(int i = start; i<=100 ;i++ ){
            sum = sum+i;

        }
        return sum/totalNumbers;
    }

    public void printStars(){
        for(int i = 0; i<7;i++){
            for(int j =0; j<7-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void whileCountOneHundred(int i) {
        while(i <= 100) {
            if(i==100){
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }
            i++;
        }
        System.out.println("\n");
    } // While - Ex 1

    public void whileCountToMinusOneHundred(int i) {
        while(i >= -100) {
            if(i==-100){
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }
            i--;
        }
        System.out.println("\n");
    } // While - Ex 2

    public void whileCountStartToEnd(int start, int end) {
        while(start <= end) {
            if(start==end){
                System.out.print(start);
            } else {
                System.out.print(start+",");
            }
            start++;
        }
        System.out.println("\n");
    } // While - Ex 3

    public void whileCountFromSmallest(int a, int b) {
        int start;
        int end;
        if(a>b){
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }

        while(start <= end) {
            if(start==end){
                System.out.print(start);
            } else {
                System.out.print(start+",");
            }
            start++;
        }
        System.out.println("\n");
    } // While - Ex 4

    public void whileEvenCount(){
        int i = 1;
        while(i<=100){
            if(i%2==0) {
                System.out.print(i+",");
            }
            i++;
        }
        System.out.println();
    } // While - Ex 5

    public void whileOddCount(){
        int i = 1;
        while(i<=100){
            if(i==99){
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }
            i=i+2;
        }
    } // While - Ex 6









}
