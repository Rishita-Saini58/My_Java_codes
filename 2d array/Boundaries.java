class Boundaries
{
public static void main(String[] args)
{
int [][] a = {{1,2,3,5},{4,5,6,7},{7,8,9,9},{4,5,6,7}};
for (int i = 0 ; i<a.length ; i++)
{
for (int j = 0 ; j<a.length ; j++)
{
if(i==0 || i==a.length-1)
System.out.print(a[i][j]+" ");
else if (j==0 || j==a.length-1)
System.out.print(a[i][j]+" ");
else
System.out.print("  ");
}
System.out.print("\n");

}

}
}