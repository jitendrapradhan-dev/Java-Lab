import java.lang.*;
class A5q5{
public static void main(String args[]){
int count=0;
System.out.println("enter the three digit number:");
for(int i=1;i<=3;i++){
for(int j=1;j<=3;j++){
for(int k=1;k<=3;k++){
if(i!=j && j!=k && k!=i){
int num=i*100+j*10+k;
System.out.println(num);
count++;
}
}
}
}
System.out.println("total three digit number is :"+count);
}
}
