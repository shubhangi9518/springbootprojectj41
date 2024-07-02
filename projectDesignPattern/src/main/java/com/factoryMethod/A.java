package com.factoryMethod;

public class A {
	
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
		public void msg()
		{
			System.out.println("value is"+a);
	
}
		
}
