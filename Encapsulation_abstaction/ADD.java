class ADD
{
private int a;
private int b;

public void setA(int a) {this.a=a ; }
public void setB(int b) {this.b = b; }

public void Sum() {System.out.println("Sum = " +Add()); }

public int Add() { return (a+b); }
public static void main(String[] args)
{
ADD obj = new ADD();
obj.setA(12);
obj.setB(14);
obj.Sum();
}
}
