import java.util.*;
class Sortarr
{
public static void main(String[] args)
{
int d=0,c=0,c1=0;
int [] a={1,2,3,4,5};
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
d=1;
c+=1;
}
else if(a[i]>a[j]){
d=2;
c1 +=1;
}
}
}
if(c1>=1 && c>=1)
System.out.println("not");
else if(d==2)
System.out.println("sorted in descending order");
else if(d==1)
System.out.println("sorted in ascending order");
}
}