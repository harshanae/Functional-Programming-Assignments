object rationalOp extends App{
    val x=new Rational(3,4);
    val y=new Rational(5,8);
    val z=new Rational(2,7);
     
    println(x-y-z);



}

class Rational(n:Int,d:Int){
    private def gcd(a:Int,b:Int):Int={
        if(b==0) a else gcd(b,a%b);
    }
    def numerator=n/gcd(n,d);
    def denominator=d/gcd(n,d);

    def neg=new Rational(-(this.numerator),this.denominator);
    def +(r:Rational)=new Rational(this.numerator*r.denominator+r.numerator*this.denominator,this.denominator*r.denominator);
    def-(r:Rational)=this+r.neg;
    override def toString=this.numerator+"/"+this.denominator;


}