import java.util.*;
class A5q4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a ellemnt:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter"+n+"element");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("enter ther search element:");
int key=sc.nextInt();
int low=0;
int high=n-1;
int found=0;
while(low<high){
int mid=(low+high)/2;
if(a[mid]==key){
System.out.println("element found");
 found=1;
break;
}
else if(a[mid]<key){
low=mid+1;
}
else{
high=mid-1;
}
}
if(found==0){
System.out.println("element not found");
}
}
}


