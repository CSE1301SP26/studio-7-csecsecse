package src.studio7;

public class Complex {

private int r;
private int i;

public Complex(int r, int i){
    this.r = r;
    this.i = i;
}

public int getReal(){
    return this.r;
}

public int getImaginary(){
    return this.i;
}

public void print(){
    System.out.println(this.r + " + " + this.i + "i");
}

public Complex add(Complex other){
    int newr = this.r + other.r;
    int newi = this.i + other.i;
    return new Complex(newr, newi);
}

public Complex multiply(Complex other){
    int newr = this.r * other.r - this.i * other.i;
    int newi = this.r * other.i + this.i * other.r;
    return new Complex(newr, newi);
}

public static void main(String[] args){
    Complex a = new Complex (1,2);
    Complex b = new Complex(3,4);
    a.print();
    b.print();
    Complex c = a.add(b);
    c.print();
    Complex d = a.multiply(b);
    d.print();
}
}
