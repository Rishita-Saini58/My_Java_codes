import java.util.*;
class EleSumFun
{
static int a [] = new int[10];
static int[] sum(int arr[])
{
for (int i = 0 ; i < 10 ; i++)
{
int sum = 0;
for(int j = arr[i]; j>0 ; j/=10){
sum = sum + j%10;
arr[i] = sum;
}
}
return arr;
}
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
//a= new int[10];
System.out.print("enter array elements");
for (int i = 0 ; i < 10 ; i++)
{
a[i] = obj.nextInt();
}
sum(a);
for (int i = 0 ; i < 10 ; i++)
{
System.out.print(a[i]+" ");
}
}
}
