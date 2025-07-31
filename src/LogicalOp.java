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
}
