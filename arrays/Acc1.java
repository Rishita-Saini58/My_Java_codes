import java.util.*;
class Acc1
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a [] = new int [10];
a[0]=35;
System.out.print("Enter array elements = ");
for(int i = 1;i<10;i++)
{
a[i] = obj.nextInt();
}
for (int j = 0 ; j < 10 ; j++)
{
System.out.print(a[j] + " ");
}
}
}
