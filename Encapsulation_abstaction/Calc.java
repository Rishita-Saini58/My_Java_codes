import java.util.*;
class Cal
{
private int a;
private int b;

Cal(int a,int b)
{
this.a=a;
this.b=b;
}

public void SUM(String sum)
{
System.out.println(sum);
System.out.println(addition());
}
public int addition() { return (a+b);}

public void SUB(String sub){
System.out.println(sub);
System.out.println(subtraction());
}
public int subtraction() { return (a-b);}


public void MUL(String mul){
System.out.println(mul);
System.out.println(multiplication());
}
public int multiplication() { return (a*b);}


public void DIV(String div){
System.out.println(div);
System.out.println(division());
}
public int division() { return (a/b);}
}



class Calc
{
public static void main(String[] args)
{
Scanner o = new Scanner(System.in);
while(true)
{
System.out.println("^_^  WELCOME TO MY CALC  ^_^");
System.out.println("MENU \n PRESS 1 = ADD \n PRESS 2 = SUB \n PRESS 3 MULTIPLY \n PRESS 4 = DIV \n PRESS 5 = EXIT \n");

System.out.print("Enter menu no. = ");
int num = o.nextInt();
Cal obj = new Cal(20,25);

if(num == 1)
obj.SUM("Sum : ");

else if(num==2)
obj.SUB("Sub : ");

else if(num==3)
obj.MUL("Mul : ");

else if(num==4)
obj.DIV("Div : ");

else {
System.out.println("Calc closed");
break;
}

}
}
}