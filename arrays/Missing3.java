class Missing3
{
public static void main(String[] args)
{

int missing=0;
int [] a={1,2,3,4,5};
for(int i=0;i<a.length-1;i++){
if (a[i+1]-a[i]!=1){
missing=a[i]+1;
break;

}

}
System.out.println("missing = "+missing);
}
}