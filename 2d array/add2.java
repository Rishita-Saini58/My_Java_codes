class add2
{
public static void main(String[] args)
{
int a [][] = {{1,2,3},{4,5,6},{1,2,3}};
int b [][]={{7,8,9},{1,2,3},{1,2,3}};
for(int i = 0; i<a.length;i++){
for(int j = 0; j<a.length;j++){
System.out.print(a[i][j]+" ");
}
System.out.print("\n");

}

for(int i = 0; i<a.length;i++){
for(int j = 0; j<a.length;j++){
System.out.print(b[i][j]+" ");
}
System.out.print("\n");

}


for(int i = 0; i<a.length;i++){
for(int j = 0; j<a.length;j++){
System.out.print(a[i][j]+b[i][j]+" ");
}
System.out.print("\n");

}


//int [][] sum = a+b;
}
}