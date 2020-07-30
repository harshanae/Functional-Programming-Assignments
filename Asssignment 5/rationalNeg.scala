object rationalNeg extends App{
    val r1=new Rational(3,2);
    println(r1);
    println(r1.neg);

}

class Rational(n:Int,d:Int){
    def numerator=n;
    def denominator=d;

    def neg=new Rational(-(this.numerator),this.denominator);
    override def toString=this.numerator+"/"+this.denominator


}