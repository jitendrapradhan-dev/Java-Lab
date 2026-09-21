class Rectangle{
      double width;
      double height;
 Rectangle(double w, double h){
      width=w;
      height=h;
}
double area(){
    return width*height;
}
double perimeter(){
  return 2*(width+height);
}
public static voidmain(String args[]){
      Rectangle r1= new rectangle(10,5);
 System.out.println("Area="+r1.area());
System.out.println("perimeter="+r1.peremeter());
}
}