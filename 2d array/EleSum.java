import java.util.*;
class EleSum
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a [] = new int[10];
System.out.print("enter array elements");
for (int i = 0 ; i < 10 ; i++)
{
a[i] = obj.nextInt();
}
for (int i = 0 ; i < 10 ; i++)
{
int sum = 0;
for(int j = a[i]; j>0 ; j/=10){
sum = sum + j%10;
a[i] = sum;
}
}
for (int i = 0 ; i < 10 ; i++)
{
System.out.print(a[i] + " ");
}
}
}
