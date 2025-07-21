import java.util.*;
class Acc2
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a [] = new int [10];

System.out.print("Enter array elements = ");
for(int i = 0;i<10;i++)
{ 
if(i == 1)
{
a[i]=25;
System.out.print("set  : a[" + i +"] = " + a[i] + "\n");
}
else
{
System.out.print("enter value : a[" + i + "] = ");
a[i] = obj.nextInt();
}
}
for (int j : a)
System.out.print(j + " ");
}
}
