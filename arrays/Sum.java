import java.util.*;
class Sum
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int sum = 0;
System.out.print("Enter array size = ");
int n = obj.nextInt();

int []a=new int[n];
System.out.println("Enter array elements");
for (int i=0;i<n;i++){
System.out.print("Enter element "+i +" = ");
a[i]=obj.nextInt();
}
for(int i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println("sum = "+sum);
}
}
