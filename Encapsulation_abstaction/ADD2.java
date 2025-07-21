class SUM
{
 int a;
 int b;

public void setA(int a) {this.a=a ; }
public void setB(int b) {this.b = b; }

}
class  Main extends SUM {
public void Sum() {System.out.println("Sum = " +Add()); }

public int Add() { return (a+b); }

}
public class ADD2 extends Main  {
public static void main(String[] args)
{
ADD2 obj = new ADD2();
obj.setA(12);
obj.setB(14);
obj.Sum();
}
}
