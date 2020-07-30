object Bank extends App{
    
    val a1= new Account("97255487v",4,7000.00);
    val a2= new Account("97254785v",5,5000.00);
    val a3= new Account("97254786v",6,11000.00);
    val a4= new Account("97548112v",7,-890.00);
    a1.transfer(a2,1000);
    println(a1);
    println(a2);
    var bank:List[Account]=List(a1,a2,a3,a4);


    //val checkNeg(a:Account)=>a.accountBal<0
    val overdraft=(b:List[Account])=>b.filter(x=>x.accountBal<0);

    println("Bank overdrafted accounts\n");
    println(overdraft(bank))

    val balance=(b:List[Account])=>b.reduce((x,y)=>new Account("SumofallAccounts",0,x.accountBal+y.accountBal))
    
    println("Bank sum of all accounts\n");
    print(balance(bank).accountBal)

    val interest=(b:List[Account])=>b.map(x=>{
        if(x.accountBal>=0) new Account(x.nic,x.accountNo,x.accountBal*(1.1)) else new Account(x.nic,x.accountNo,x.accountBal*(1.05));
    })
    
    println("Bank interested bank accounts\n");
    print(interest(bank));


    

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