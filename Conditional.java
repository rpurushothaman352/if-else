package com.conditional;

public class Conditional{

	public static void main(String[] args) {
		programs Coffe = new programs();
		Coffe.cof();
		Coffe.Superheroguess();

	}

}

public class programs{
	
	
//this is for the if else statement only
	boolean iscupEmpty=false;
public void cof()
{
	if(iscupEmpty==true)
	{
		System.out.println("Fill that coffee");
	}else
	{
		System.out.println("Drink that coffeee");
	}
	}

// this is for if-else-if statement only
public void Superheroguess() 
{
	String name ="vjs";
	if(name.equals("vj"))
	{
		System.out.println("Wrong Pridiction 1 ");
		
	}
	else if (name.equals("vjm"))
	{
		System.out.println("Wrong Pridiction 2 ");
	}
	else if (name.equals("roit"))
	{
		System.out.println("Wrong Pridiction 3 "); 
	}
	else
	{
		System.out.println("i cant find it ");
	}
	
	
	//
}
}