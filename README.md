# Java_Session4Assignment3
Java_Session4Assignment3 Description

/*Compilation Error for final variable*/
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final field FinalUseDemo.a cannot be assigned

	at javaSession4Assignment3.FinalUseDemo.method(FinalUseDemo.java:30)
	at javaSession4Assignment3.FinalUseDemo.main(FinalUseDemo.java:35)

/*Compilation Error for final method*/
Exception in thread "main" java.lang.VerifyError: class javaSession4Assignment3.Def overrides final method method1.()V
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(Unknown Source)
	at java.security.SecureClassLoader.defineClass(Unknown Source)
	at java.net.URLClassLoader.defineClass(Unknown Source)
	at java.net.URLClassLoader.access$100(Unknown Source)
	at java.net.URLClassLoader$1.run(Unknown Source)
	at java.net.URLClassLoader$1.run(Unknown Source)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(Unknown Source)
	at java.lang.ClassLoader.loadClass(Unknown Source)
	at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
	at java.lang.ClassLoader.loadClass(Unknown Source)
	at javaSession4Assignment3.FinalUseDemo.main(FinalUseDemo.java:40)

/*Compilation Error for final constructor*/
Cannot reassign value to final variable, it will throw compilation error, 'a' value is 90
Abc.method1: This is a final method, it cannot be overridden, it will throw compilation error
Def method2: Displaying from different method.
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Illegal modifier for the constructor in type Ghi; only public, protected & private are permitted

	at javaSession4Assignment3.Ghi.<init>(FinalUseDemo.java:22)

/*Compilation Error for final class*/
Cannot reassign value to final variable, it will throw compilation error, 'a' value is 90
Abc.method1: This is a final method, it cannot be overridden, it will throw compilation error
Def method2: Displaying from different method.
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The type Ghi cannot subclass the final class Def

	at javaSession4Assignment3.Ghi.<init>(FinalUseDemo.java:20)
	at javaSession4Assignment3.FinalUseDemo.main(FinalUseDemo.java:47)
	at javaSession4Assignment3.FinalUseDemo.main(FinalUseDemo.java:47)
