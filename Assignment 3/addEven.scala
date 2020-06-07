object addEven extends App{
    def isEven(x:Int):Boolean= x match{
        case 0 => true
        case _ => isOdd(x-1);
    }

    def isOdd(x:Int):Boolean = !(isEven(x))

    def addEvenseq(x:Int):Int= x match{
        case y if(x==0) => x
        case y if(isEven(x)) => addEvenseq(x-1)+x
        case _ => addEvenseq(x-1)
    }
    // println(isEven(5));
    // println(isEven(2));
    // println(isOdd(3));
    // println(isOdd(6));

    println(addEvenseq(10));

}
