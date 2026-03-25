package src.studio7;

public class Fraction {

private int num;
private int den;

public Fraction(int num, int den){
    this.num = num;
    this.den = den;
}

public int getNum(){
    return this.num;
}

public int getDen(){
    return this.den;
}

public Fraction add(Fraction other){
    int newn = this.num * other.den + this.den * other.num;
    int newd = other.den * this.den;
    Fraction a = new Fraction(newn, newd);
    return a;
}

public Fraction multiply(Fraction other){
    int newd = other.den * this.den;
    int newn = other.num * this.num;
    return new Fraction(newn, newd);
}

public Fraction reciprocal(){
    return new Fraction(this.den, this.num);
}

public static void main(String[] args){

Fraction a = new Fraction(1,3);
Fraction b = new Fraction(1,3);
Fraction c = a.reciprocal();
System.out.println(c.getNum());
System.out.println(c.getDen());

}


}
