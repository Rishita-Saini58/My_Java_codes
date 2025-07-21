import java.util.*;
class Moneyy
{
static int n;
static int c500;
static int c200;
static int c100;
static int c50;
static int c20;
static int c10;
static int c5;
static int c2;
static int c1;

static void cc500()
{
c500=n/500;
System.out.println("notes of 500 = "+c500);
}

static void cc200()
{
c200=n/200;
System.out.println("notes of 200 = "+c200);
}

static void cc100()
{
c100=n/100;
System.out.println("notes of 100 = "+c100);
}


static void cc50()
{
c50=n/50;
System.out.println("notes of 50 = "+c50);
}

static void cc20()
{
c20=n/20;
System.out.println("notes of 20 = "+c20);
}

static void cc10()
{
c10=n/10;
System.out.println("notes of 10 = "+c10);
}

static void cc5()
{
c5=n/5;
System.out.println("notes of 5= "+c5);
}

static void cc2()
{
c2=n/2;
System.out.println("coins of 2 = "+c2);
}

static void cc1()
{
c1=n/1;
System.out.println("coins of 1 = "+c1);
}



public static void main(String[] args)
{

c500=0;
c200=0;
c100=0;
c50=0;
c20=0;
c10=0;
c5=0;
c2=0;
c1=0;
while(1==1)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter the amount please ^_^ = ");
n = obj.nextInt();

if(n>=500)
{
cc500();
n=n%500;
}
if(n>=200)
{
cc200();
n=n%200;
}
if(n>=100)
{
cc100();
n=n%100;
}
if(n>=50)
{
cc50();
n=n%50;
}
if(n>=20)
{
cc10();
n=n%10;
}
if(n>=5)
{
cc5();
n=n%5;
}
if(n>=2)
{
cc2();
n=n%2;
}
if(n>=1)
{
cc1();
n=n%1;
}

//System.out.println(n);
break;
}
}
}