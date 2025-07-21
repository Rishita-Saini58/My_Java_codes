import java.util.*;
class LS
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
int max=0;
int min=a[0];
for(int i=0;i<a.length;i++){
if(max<a[i]){
max=a[i];
}
}
for(int i=0;i<a.length;i++){
if(min>a[i]){
min=a[i];
}
}

System.out.println("max = "+max);
System.out.println("min = "+min);

}
}
