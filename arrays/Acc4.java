import java.util.*;
class Acc4
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a [] = new int [10];
a[0]=25;
a[1]=45;
System.out.print("Enter array elements = ");
for(int i = 2;i<10;i++)
{
a[i] = obj.nextInt();
}
for (int j = 0 ; j < 10 ; j++)
{
System.out.print(a[j] + " ");
}
}
}
