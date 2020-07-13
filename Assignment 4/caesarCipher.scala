object caesarCipher extends App{
    val a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val enc=(x:Char,key:Int,a:String)=>if(a.indexOf(x.toUpper)== -1) x else a((a.indexOf(x.toUpper)+key)%a.size)

    val dec=(x:Char,key:Int,a:String)=>if(a.indexOf(x.toUpper)== -1) x else a(((a.indexOf(x.toUpper)-key).abs)%a.size)

    val ceasarC=(fun:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(fun(_,key,a))



    val s="Harshana Hasanka";

    println(ceasarC(enc,s,5,a));
    val o="Mfwxmfsf Mfxfspf";
    println(ceasarC(dec,o,5,a));
   


    
}