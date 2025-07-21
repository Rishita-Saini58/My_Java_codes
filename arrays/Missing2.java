class Missing2
{
public static void main(String[] args)
{

int missing=0;
int [] a={1,3,4,5,6};
for(int i=0;i<a.length-1;i++){
int current = a[i];
int next= a[i]+1;
if (next-current!=1){
missing=current+1;
break;

}

}
System.out.println("missing = "+missing);
}
}