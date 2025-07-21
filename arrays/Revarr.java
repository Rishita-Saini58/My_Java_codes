import java.util.*;
class Revarr
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);

System.out.print("Enter array size = ");
int n = obj.nextInt();

int []a=new int[n];
System.out.println("Enter array elements");
for (int i=0;i<n;i++){
System.out.print("Enter element "+i +" = ");
a[i]=obj.nextInt();
}
for(int i=n-1;i>=0;i--){
System.out.print(a[i]+" ");
}
}
}
