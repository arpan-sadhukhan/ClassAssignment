package oop;

interface Ab{
	void display();
}

interface B extends Ab{
	void display();
}

interface C extends Ab{
	void display();
}
class A1 implements Ab{

	@Override
	public void display() {
		System.out.println("display method of A");
		
	}
	
}

class B1 implements B{

	@Override
	public void display() {
		System.out.println("display method of B");
		
	}
	
}
class C1 implements C{

	@Override
	public void display() {
		System.out.println("display method of C");
		
	}
	
}
class D implements B,C //multiple inheritance by implementing two different interfaces which are a common child of interface Ab
{

	@Override
	public void display() {
		System.out.println("display method of D");
		
	}
	
}

public class DiamondProblem {

	public static void main(String[] args) {
		A1 a=new A1();
		a.display();
		B1 b=new B1();
		b.display();
		C1 c=new C1();
		c.display();
		D d=new D();
		d.display();

	}

}
