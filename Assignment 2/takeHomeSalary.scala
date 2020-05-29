object takeHomeSalary extends App{
    def wageCal(hours:Int)=hours*150;

    def otCal(hours:Int)=hours*75;

    def takeHome(nohours:Int,othours:Int)=(wageCal(nohours)+otCal(othours))*0.9;

    printf("wage : %d\not: %d\nIncome of the given employee is: %f",wageCal(40),otCal(20),takeHome(40,20));



}