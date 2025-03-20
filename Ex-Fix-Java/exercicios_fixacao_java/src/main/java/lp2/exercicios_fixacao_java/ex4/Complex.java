package lp2.exercicios_fixacao_java.ex4;

public class Complex {

    private int a;
    private int b;

    public int Complex(){
        return 0;
    }

    public Complex(int a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getReal(){
        return a;
    }

    public int getImag(){
        return b;
    }

    public double getMod(){
        return Math.sqrt(a * a + b * b);
    }

    public double getAng(){
        return Math.atan2(this.b, this.a);
    }

    public Complex inv(){
        return new Complex(-this.a, -this.b);
    }

    public Complex soma(Complex outro) {
        int parteReal = this.a + outro.a;
        int parteImaginaria = this.b + outro.b;
        return new Complex(parteReal, parteImaginaria);
    }

    public Complex sub(Complex outro){
        int parteReal = this.a - outro.a;
        int parteImaginaria = this.b - outro.b;
        return new Complex(parteReal, parteImaginaria);
    }

    public Complex mult(Complex outro){
        int parteReal = this.a * outro.a - this.b * outro.b;
        int parteImaginaria = this.a * outro.b + this.b * outro.a;
        return new Complex(parteReal, parteImaginaria);
    }

    public Complex div(Complex outro) {
        int divisor = outro.a * outro.a + outro.b * outro.b;
        int parteReal = (this.a * outro.a + this.b * outro.b) / divisor;
        int parteImaginaria = (this.b * outro.a - this.a * outro.b) / divisor;
        return new Complex(parteReal, parteImaginaria);
    }


    public String toString(int a, int b){
        Complex Val = new Complex(this.a, this.b);
        return Val.toString();
    }
}
