import java.util.*;
class SemE
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("enter row length");
int n = obj.nextInt();
System.out.print("enter coloumn length");
int m = obj.nextInt();

int a [][]= new int[n][m];
System.out.print("enter array elements");
for(int i = 0; i<n ; i++)
{
for(int j = 0; j<n ; j++)
a[i][j] = obj.nextInt();
}
int sum = 0;
for(int i = 0 ; i<n ; i++)
{
for(int j = 0; j<n ; j++)
sum = sum + a[i][j];
}
System.out.print("Sum : " + sum);
}
}
