class Func
{
public static void add()
{
System.out.println("add function begin");
int a = 12, b = 90;
System.out.println("sum : " + (a+b));
System.out.println("add function end");
}
public static void sub()
{
System.out.println("sub function begin");
int a = 12, b = 90;
System.out.println("sub : " + (a-b));
System.out.println("sub function end");
}
public static void main(String[] args)
{
System.out.println("main function begin");
add();
sub();
System.out.println("main function end");
}
}