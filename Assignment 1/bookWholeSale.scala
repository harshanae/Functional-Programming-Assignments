object bookWholeSale extends App{
    def bookPrice(x:Double):Double=x*24.95;

    def discountedPrice(x:Double):Double=0.60*x;

    def shippingCost(x:Double)=if(x<50) x*3 else x*3 +(x-50)*0.75;

    def totalWholeSale(x:Double)=discountedPrice(bookPrice(x))+shippingCost(x); 

    println(totalWholeSale(60)); 

}