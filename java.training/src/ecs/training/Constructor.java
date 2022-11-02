package ecs.training;

interface Nickname{
String nickname=" Code wizard";
void nick();
void name();
}

abstract class LuckNo{
	 int lno=5;
abstract void luckno();
}

class  SimpleName extends LuckNo implements Nickname {
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

class praveen implements Nickname{
	
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
//class argument {
//	
//	void argmethod(Nickname n) {
//	System.out.println("This is method that how we have to pass arguments")	;
//	n.name();
//	n.nick();
//	}
//}


class Construct extends SimpleName {
 Construct(){
		name();
		nick();
		luckno();
}}
class Construct1 extends praveen
{
	Construct1(){
	name();
	nick();
	luckno();
}
}
 
public class Constructor{
public static void main(String[] args) 
{
Construct obect=new Construct();
Construct1 obect1=new Construct1();
praveen p=  new praveen();

//argument arg =new argument();
//
//
//arg.argmethod(obect);
//arg.argmethod(p);


}
}
