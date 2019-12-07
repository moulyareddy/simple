class Test1
{
void display()
{
System.out.println("this is test1");
}
void add()
{
int a,b=8,c=8;
a=c+b;
System.out.println("addition is " +a);
}
void sub()
{
int a=10,b=3,c;
c=a-b;
System.out.println("sub is"+c);
}
}
class Test2
{
void display()
{
System.out.println("this is test2");
}
void div()
{
int a=10,b=5,c;
c=a/b;
System.out.println("div is"+c);
}
void mul()
{
int a=12,b=2,c;
c=a*b;
System.out.println("mul is"+c);
}
}
class Test3
{
void display()
{
System.out.println("this is test3");
}
void area()
{
int a=5,ar;
ar= a*a;
System.out.println("area is "+ar);
}
void area1()
{
int a=3,b=4,c;
c=a*b;
System.out.println("rectangle is"+c);
}
}
class Test4
{
void display()
{
System.out.println("this is test");
}
void area2()
{
int a=4,b=4;
double c;
c= (a*b)*0.5;
System.out.println("triangle is" +c);
}
void cube()
{
int a=4,b;
b=6*a;
System.out.println("cube is"+b);
}
}
class Test5{
void display()
{
System.out.println("this is test5");
}
void bank()
{
int p=7,t=9,r=7;
double y;
y= (p*t*r)/100;
System.out.println("simple interest "+y);
}
void mod()
{
int a=9,b=2,c;
c=a%b;
System.out.println("mod is"+c);
}
}

public class Test {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.display();
		t1.add();
		t1.sub();
		Test2 t2=new Test2();
		t2.display();
		t2.div();
		t2.mul();
		Test3 t3=new Test3();
		t3.display();
		t3.area();
		t3.area1();
		Test4 t4=new Test4();
		t4.display();
		t4.area2();
		t4.cube();
		Test5 t5=new Test5();
		t5.display();
		t5.bank();
		t5.mod();   


	}

}