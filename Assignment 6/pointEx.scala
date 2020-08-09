object pointEx extends App{
    println("Assignment 6 Case Class\n");

    //point intialization p1 and p2
    val p1=Point(4,5);
    println("p1= "+p1);
    val p2=Point(3.2,5);
    println("p2= "+p2);
    println();
    
    //Question 1: addition of two given points (p1 and p2)
    val p3=p1+p2;
    println("p1+p2 = "+p3+"\n");

    //Question 2: moving of a point by given distances through x and y axis
    val p4=p1.move(2,6);

    println("Moved p1, after moving 2 points to the x axis and 6 points to the y axis: "+p4+"\n");

    //Question 3: Distance between a point and a given point(distance between p1 and p2)
    println("Distance between p1 and p2 is: "+p1.distance(p2)+"\n");

    //Question 4: Inversion of a given point
    val p5=p1.invert();
    println("p1 before inversion: "+p1);
    
    println("inverted p1: "+p5+"\n");


}

case class Point(a:Double,b:Double){
    def x = a;
    def y = b;


    def +(p:Point)=Point(p.x+this.x,p.y+this.y);

    def move(dx:Double,dy:Double)=Point(this.x+dx,this.y+dy);
       

    def distance(p:Point):Double=scala.math.sqrt(scala.math.pow((this.x-p.x),2)+scala.math.pow((this.y-p.y),2));


    def invert()=Point(this.y,this.x);

}
