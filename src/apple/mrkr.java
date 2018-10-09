package apple;

public class mrkr 
{
public double price;
public final String brand;
String color;
public static String category = "pens";
public double getPrice(){
	return price;
}
public void write(String input){
	System.out.println(input);
}
public mrkr()
{
	price=159;
	brand="alto";
	//System.out.println(marker object created);
}
public mrkr(String b)
{
	brand = b;
	
}
}
