package javaSession4Assignment3;

class Abc{
	 final void method1(){  //final method
		  System.out.println("Abc.method1: This is a final method, it cannot be overridden, it will throw compilation error"); 
		 }
}

final class Def extends Abc{ // final class
	 /*void method1(){  
		  System.out.println("Cannot override the parent class method"); 
		 }*/
	void method2(){  
	  System.out.println("Def method2: Displaying from different method."); 
	 }
	
}

//Cannot extend final class
class Ghi /*extends Def*/{
	
	/*final*/ Ghi(){ // final constructor
		System.out.println("Constructors do not support final");
	}
	 void method1(){  
		  System.out.println("Ghi.method1: Def is the final class, it cannot be extended,it will throw compilation error"); 
		 }
}

public class FinalUseDemo {
	
	 final int a=90;//final variable  
	 void method(){  
	  //a=400;  
		System.out.println("Cannot reassign value to final variable, it will throw compilation error, 'a' value is "+a);
	 }
	public static void main(String[] args) {
		FinalUseDemo obj = new FinalUseDemo();
		obj.method();
		
		Abc abc = new Abc();
		abc.method1();
		
		Def def = new Def();
		def.method2();
		
		Ghi ghi = new Ghi();
		ghi.method1();

	}

}
