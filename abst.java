package P1;

//abstract, atleast one abstract method we have to define that class as abstract
//using abstract keyword
//abstract method = no body// no logic// only def
abstract class vehicle
{
	void speed()
	{
		System.out.println("100 kmph speed");
	}
	abstract void noOfwheels();
	
}
class car extends vehicle // extends 2) all the methods are available to child class 3)you have body for the abstract methods
{
	void noOfwheels()
	{
		System.out.println("4 wheeler ");
	}}
public class abst
{	
public static void main(String args[])
{
	car obj=new car();
	obj.speed();
	obj.noOfwheels();// 4 wheeler
}
}
