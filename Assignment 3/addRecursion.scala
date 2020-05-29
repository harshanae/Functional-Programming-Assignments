object addRecursion extends App{
    def getSumtill(x:Int):Int= x match{
        case y if(x==1)=>1
        case _ => x+getSumtill(x-1)

    }

    println(getSumtill(5));



}