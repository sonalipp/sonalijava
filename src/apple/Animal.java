package apple;

public abstract class Animal extends Object{
	boolean alive;
	
	public void eat() {
		System.out.println("Animal is Eating");
	}
	
	public void move(int distance)
	{
		System.out.println("animal is moving"+" " +distance +"distances");
	}

}
