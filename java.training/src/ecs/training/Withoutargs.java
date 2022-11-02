package ecs.training;

interface Nickname1{
String nickname=" Code wizard";
void nick();
void name();
}

abstract class LuckNo1{
	 int lno=5;
abstract void luckno();
}

class  SimpleName1 extends LuckNo implements Nickname1 {
public void name()
{
	String str= "Akash" ;
	System.out.println( str);

	}
public void nick() { 
	System.out.println("NICK NAME ="+ nickname);
}
public void luckno(){
	System.out.println("mMy lucky no is " + lno);
}
}

class praveen1 implements Nickname1{
	
	public void name()
	{
		String str= "Praveen" ;
		System.out.println( str);

		}
	public void nick() { 
		System.out.println("NICK NAME ="+ nickname+" on JAVA");
	}
	public void luckno(){
		int lno=10;
		System.out.println("mMy lucky no is " + lno);
	}
}
class Construct111 extends SimpleName1 {
 Construct111(){
		name();
		nick();
		luckno();
}}
class Construct11 extends praveen1
{
	Construct11()
	{
	name();
	nick();
	luckno();
    }
}
 
public class Withoutargs{
public static void main(String[] args) 
{
System.out.println(" without arguments......");
Construct111 obect=new Construct111();
Construct11 obect1=new Construct11();
}
}


