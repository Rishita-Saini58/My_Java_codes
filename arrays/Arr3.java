class Arr3
{
public static void main(String[] args)
{
int [][]a = {{3,4,5},{4,5,7},{6,8,9}};

for (int i=0 ; i<a.length ; i++){
for (int j=0 ; j<a.length ; j++){
if(a[i][j]%2!=0){
System.out.print(a[i][j]+" ");
}
else 
System.out.print("  ");
}
System.out.print("\n");
}
}
}