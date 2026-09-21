import java.util.Scanner;
class A4q1{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);

System.out.println("enter the three coeffciant:");
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
double d=b*b-4*a*c;
if(d>0){
double r1=(-b+Math.sqrt(d))/2*a;
double r2=(-b-Math.sqrt(d))/2*a;
 System.out.println("root is:"+r1);
 System.out.println("root is:"+r2);
}
else if(d==0){
double r=-b/2*a;
System.out.println("root is:"+r);
}
else{
System.out.println("root is imaginary");
}
}
}
