import java.util.*;
class Second
{
public static void main(String[] args)
{



Scanner obj = new Scanner(System.in);

System.out.print("Enter array size = ");
int n = obj.nextInt();

int []a=new int[n];
System.out.println("Enter array elements");
for (int k=0;k<n;k++){
System.out.print("Enter element "+k +" = ");
a[k]=obj.nextInt();
}

for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("second largest = "+a[1]);

}
}
