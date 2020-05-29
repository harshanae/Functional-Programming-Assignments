object evenOdd extends App{
    def isEven(x:Int):Boolean= x match{
        case 0 => true
        case _ => isOdd(x-1);
    }

    def isOdd(x:Int):Boolean = !(isEven(x))

    println(isEven(5));
    println(isEven(2));
    println(isOdd(3));
    println(isOdd(6));

}