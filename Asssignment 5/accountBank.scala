object accountBank extends App{
    val a1= new Account("97255487v",4,7000.00);
    val a2= new Account("97254785v",5,5000.00);

    a1.transfer(a2,1000);
    println(a1);
    println(a2);
}


class Account(id:String,no:Int,a:Double){
    val nic=id;
    val accountNo=no;
    var accountBal=a;

    def withdraw(a:Double)={
        this.accountBal-=a;
    }
    def deposit(a:Double)={
        this.accountBal+=a;
    }
    def transfer(a:Account,v:Double)={
        this.withdraw(v);a.deposit(v);
    }
    override def toString="["+this.nic+","+this.accountNo+","+this.accountBal+"]";

}