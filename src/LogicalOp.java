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

    public void addNumbersAndPrintAverage(int i, int end) {
        int count = 0;
        int totalSum = 0;
        while(i<=end){
            count ++;
            totalSum = totalSum + i;
            i++;
        }
        System.out.println("Total Sum of numbers between 111 and 8899 is: " + totalSum);
        System.out.println("Average of the sum is: "+ totalSum/count);

    } // While - Ex 7

    public float whileAverageOfDivisibleWithSeven(int start, int end){
        int totalSum = 0;
        int count = 0;
        while(start<=end){
            if(start%7==0) {
                totalSum = totalSum + start;
                count++;
            }
            start++;
        }
        System.out.println();
        return (float) totalSum/count;
    } // While - Ex 8

    public void fibbonaciSequence(){
        int count = 0;
        int lastNumber = 0;
        int secondLastNumber = 1;
        int sum = 0;
        while(count<20) {
            System.out.print(sum+",");
            sum = lastNumber + secondLastNumber;
            secondLastNumber = lastNumber;
            lastNumber = sum;
            count++;
        }
        System.out.println("\n");
    } // While - Ex 9

    public void CozaLozaWoza() {
        int i = 1;
        while (i<=110) {
            if(i%11==1) {
                System.out.println();
            }
            if(i%3==0){
                if(i%5==0){
                    if(i%7==0){
                        System.out.print("CozaLozaWoza ");
                    } else {
                        System.out.print("CozaLoza ");
                    }
                } else if(i%7==0) {
                    System.out.print("CozaWoza ");
                } else {
                    System.out.print("Coza ");
                }
            } else if(i%5==0) {
                if(i%7==0){
                    System.out.print("WozaLoza ");
                } else {
                    System.out.print("Loza ");
                }
            } else if(i%7==0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i+" ");
            }
            i++;
        }
    } // While - Ex 10

    public void fillArrayTillHundred(){
        int x[] = new int[100];
        for(int i = 0; i < x.length; i++){
            x[i] = i+1;
            System.out.println("At index " + i + " number " + (i+1) + " has been saved.");
        }
    } // Array - Ex 2

    public void fillArrayWithEvenTillHundred(int[] array){
        int count = 2;
        for(int i = 0; i < array.length; i++){
            array[i] = count;
            System.out.println("At index " + i + " number " + count + " has been saved.");
            count = count+2;
        }
    } // Array - Ex 3

    public void arrayCalculateAverageOfArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum+array[i];
        }
        System.out.println("Average of the array is : " + sum/array.length);
    } // Array - Ex 4

    public boolean arrayVerifyContent(String[] array, String verify){
        for(String word: array) {
           if(word.equals(verify)){
               return true;
           }
        }
        return false;
    } // Array - Ex 5

    public int arrayVerifyIndex(int[] array, int toCheck) {
        for(int i = 0; i< array.length; i++) {
            if(array[i] == toCheck) {
                return i;
            }
        }
        return -1;
    } // Array - Ex 6

    public void printGrill() {
        for(int i = 0; i<10; i++){
            System.out.println("- - - - - - - - - - ");
        }
    } // Array - Ex 7

    public int[] arrayVerifyIndexAndDelete(int[] array, int toCheck) {
        int[] newArray = new int[array.length-1];
        int j = 0;
        for(int i = 0; i< array.length; i++) {
            if(array[i] == toCheck) {
                continue;
            }
            newArray[j]=array[i];
            j++;
        }
        return newArray;
    } // Array - Ex 8

    public int arraySecondSmallesElement(int[] array) {
        int min = array[0];
        int secondMin = array[1];
        for(int x: array){
            if(x < min) {
                min = x;
            } else if (x < secondMin && x > min) {
                secondMin = x;
            }
        }
        return secondMin;
    } // Array - Ex 9

    public int[] arrayPopulateNewArray(int[] array, int[] toPopulate) {
        for(int i = 0; i< array.length; i++) {
            toPopulate[i] = array[i];
        }
        return toPopulate;
    } // Array - Ex 10













}
