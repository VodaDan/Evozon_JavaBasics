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
}
