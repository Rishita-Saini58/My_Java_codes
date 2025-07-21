class Revk
{
public static void main(String[] args)
{
int k = 3;
int a [] ={1,2,3,4,5,6};
for(int i = k; i<a.length ; i++)
{
for(int j = o;j<=((a.length-1)-k) ; j++)
{
int temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
for(int k = a)
System.out.print(k + " ");
}
}