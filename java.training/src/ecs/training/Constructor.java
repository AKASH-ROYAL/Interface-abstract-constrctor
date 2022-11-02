package ecs.training;

interface Nickname{
String nickname=" Code wizard";
void nick();
}

abstract class LuckNo{
	 int lno=5;
abstract void luckno();
}

class  SimpleName extends LuckNo implements Nickname {
void name()
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


class Construct extends SimpleName {
 Construct(){
		name();
		nick();
		luckno();
}}

 
public class Constructor{
public static void main(String[] args) 
{
Construct obect=new Construct();
}
}
