class Missing
{
public static void main(String[] args)
{
int missing=0;
int [] a={1,3,4,5,6};
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[j]-a[i]!=1){
missing=a[j]-1;
i=j-i;
break;
}
}
}
System.out.println("missing = "+missing);
}
}