object fibonacci extends App{
    def fib(x:Int):Int= x match{
        case y if(x==0) => 0
        case y if(x==1) => 1
        case y => fib(x-1)+fib(x-2)
     }
   // println(fib(5))

    def fibseq(x:Int):Any= x match{
        case x if(x>0) => println(fib(x));fibseq(x-1)
        case x => println(x);
    }
    
    fibseq(5);

}