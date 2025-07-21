class Sum
{
private int a;
private int b;

Sum(int a,int b){
this.a=a;
this.b=b;
}
public void SUM(String sum){
System.out.println(sum);
System.out.println(addition());
}
public int addition() { return (a+b);}
}
class ADD3
{
public static void main(String[] args)
{
Sum obj = new Sum(20,25);
obj.SUM("Sum : ");
}
}