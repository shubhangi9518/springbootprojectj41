//package com.DesignPatter;
//In java object is created by using new keyword and factory method
//x=reference variable
//object is created only heap and variable is created only stack
//1.class ka static member  A 
//2.constructor is private
//3.and factory method is 
package com.DesignPatter;
class A
{
	int a=10;
	private static A ob=null;//class ka static member  A 
	
	private A()
	{
		
	}//constructor is private
	
	public static A getA()//factory method are those methods which give the object.
	{
		if(ob==null)
		{
			ob=new A();
		}
		return ob;
	}
}
public class TestSingletonDesignPattern {

	public static void main(String[] args) {
		
		A x=A.getA();
		x.a=x.a+20;
		System.out.println(x+" "+x.a);
		A y=A.getA();
		System.out.println(y+" "+y.a);
	}

}