object movieTheatreProfit extends App{
    def atendeeRevenue(ticketPrice:Int)=Attendees(ticketPrice)*ticketPrice;

    def Attendees(ticketPrice:Int)=120+((15-ticketPrice)/5)*20;

    def profit(ticketPrice:Int)=atendeeRevenue(ticketPrice)-(500+Attendees(ticketPrice)*3);

    print(profit(5),profit(10),profit(15),profit(20));


}