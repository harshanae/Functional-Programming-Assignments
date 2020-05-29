object printPrimeSeq extends App{
    def gcd(x:Int,y:Int):Int= y match{
        case 0 => x
        case y if(y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def isPrimeNum(x:Int,n:Int=2):Boolean= n match{
        case y if(x==y) => true
        case y if(gcd(x,y)>1) => false
        case y => isPrimeNum(x,y+1)
    }

    def primeSeq(x:Int):Int= x match{
        case y if(y==2) => y
        case y if(isPrimeNum(y)) => println(x);primeSeq(x-1)
        case _ => primeSeq(x-1)
    }

    println(primeSeq(100));


}