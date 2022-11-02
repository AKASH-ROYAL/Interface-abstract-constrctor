package ecs.training;

interface Nickname
{
String nickname=" Code wizard";
void nick();
void name();
void luckno();
}

abstract class LuckNo
{
int lno=5;
}



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


//class Construct extends SimpleName {
// Construct(){
//		name();
//		nick();
//		luckno();
//}}
//class Construct1 extends praveen
//{
//	Construct1(){
//	name();
//	nick();
//	luckno();
//}
//}
// 
public class Constructor{
public static void main(String[] args) 
{
//Construct obect=new Construct();
//Construct1 obect1=new Construct1();
	 Akash a = new Akash();
 praveen   p = new praveen();
argument arg = new argument();
   ragavan r = new ragavan();
     surya s = new surya();
arg.argmethod(a);
arg.argmethod(p);
arg.argmethod(r);
arg.argmethod(s);
}
}
