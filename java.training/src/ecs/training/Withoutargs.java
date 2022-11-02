package ecs.training;

// interface

interface nicknamen1{
	void name();
}
interface Nickname1 extends nicknamen1{
String nicknamem=" Code wizard";
void nick();
}

//abstract class 

abstract class LuckNo1{
	abstract // int lno=5;
void luckno(int lno);
 }

//class to implemnts inheritances

class  Akash1 extends LuckNo1 implements Nickname1 {
	int lno=4;
public void name()
{
	String str= "Akash" ;
	System.out.println( str);

	}
public void nick() { 
	System.out.println("NICK NAME ="+ nicknamem);
}
void luckno(int lno){ 
	System.out.println("mMy lucky no is " + lno);
}
}

class praveen1 extends LuckNo1 implements Nickname1 
{
	
	public void name()
	{
		String str= "Praveen" ;
		System.out.println( str);

		}
	public void nick() { 
		System.out.println("NICK NAME ="+ nicknamem+" on JAVA");
	}
	
	void luckno(int lno){ 
		System.out.println("mMy lucky no is " + lno);
	}
} 

class surya1 extends LuckNo1 implements Nickname1 
{
	
	public void name()
	{
		String str= "surya" ;
		System.out.println( str);

		}
	public void nick() { 
		System.out.println("NICK NAME ="+ nicknamem+" Mass ECE");
	}
	void luckno(int lno){ 
		System.out.println("mMy lucky no is " + lno);
	}
	}

class Construct1 extends Akash1 {
 Construct1(){
		name();
		nick();
		luckno(1);
}}
class Construct2 extends praveen1
{
	Construct2()
	{
	name();
	nick();
	luckno(2);
    }
}
class Construct3 extends surya1
{
	Construct3()
	{
	name();
	nick();
	luckno(3);
    }
}

//Main class
public class Withoutargs{
	
public static void main(String[] args) 
{
System.out.println(" without arguments......");
Construct1 c1=new Construct1();
Construct2 c2=new Construct2();
Construct3 c3=new Construct3();
}
}


