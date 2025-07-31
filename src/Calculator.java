public class Calculator {


    // Adunare --------------
    public int adunare(int a, int b){
        return a+b;
    }
    public float adunare(float a, float b){
        return a+b;
    }
    public int adunare(int a, int b, int c,int d){
        return a+b+c+d;
    }

    // Scadere --------------
    public int scadere(int a, int b){
        return a-b;
    }
    public double scadere(double a, double b){
        return a-b;
    }
    public int scadere(int a, int b, int c){
        return a-b-c;
    }

    // Inmultire --------------
    public int inmultire(int a, int b){
        return a*b;
    }

    public float inmultire(float a, float b, float c){
        return a*b*c;
    }

    public int inmultire(int a, int b, int c, int d){
        return a*b*c*d;
    }

    // Impartire --------------
    public float impartire(float a, float b){
        return a/b;
    }

    public int impartire(int a, int b){
        return a/b;
    }

    public double impartire(double a, double b){
        return a/b;
    }
}
