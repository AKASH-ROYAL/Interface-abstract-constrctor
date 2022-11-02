package ecs.training;
// interface


interface nicknamen{
	void name();
}

interface Nickname extends nicknamen
{
String nickname=" Code wizard";
void nick();
void luckno();
}

// Abstract class

abstract class LuckNo
{
int lno=5;
}

 //Implementing multiple Inheritance

class  Akash extends LuckNo implements Nickname {
public void name()
{
	String str = "Akash";
	System.out.println( str);

	}
public void nick() { 
	System.out.println("NICK NAME ="+ nickname);
}
public void luckno()
{
	System.out.println("Lucky no is " + lno);
}
}

class praveen extends LuckNo implements Nickname{
	public void name()
	{
		String str= "Praveen" ;
		System.out.println( str);
}
	public void nick() { 
		System.out.println("NICK NAME ="+ nickname+"  JAVA");
	}
	public void luckno(){
		int lno=10;
		System.out.println("Lucky no is " + lno);
	}
}

class ragavan extends LuckNo implements Nickname{
	
	public void name()
	{
		String str= "ragavan" ;
		System.out.println( str);

		}
	public void nick() { 
		System.out.println("NICK NAME ="+ nickname+" Cs ENGG");
	}
	public void luckno(){
		int lno= 07;
		System.out.println("Lucky no is " + lno);
	}
}

class surya extends LuckNo implements Nickname{
	
	public void name()
	{
		String str= "surya" ;
		System.out.println( str);

		}
	public void nick() { 
		System.out.println("NICK NAME ="+ nickname+" Mass ECE");
	}
	public void luckno(){
		int lno= 02;
		System.out.println("Lucky no is " + lno);
	}
}

 class argument {
	void argmethod(Nickname n) {
	System.out.println("This is method that how we have to pass arguments")	;
	n.name();
	n.nick();
	n.luckno();
	}
}
 // main class

public class Constructor{
public static void main(String[] args) {
    Akash  a = new Akash();
 praveen   p = new praveen();
   ragavan r = new ragavan();
     surya s = new surya();
argument arg = new argument();
arg.argmethod(a);
arg.argmethod(p);
arg.argmethod(r);
arg.argmethod(s);
}
}
