package apple;

public class Bird extends Animal{
	
	public void fly(int distance) {
		System.out.println("bird is flying"+distance);
		
	}
	
	public static void main(String[] args) {
		Bird b1=new Bird();
		
		b1.eat();
		b1.fly(200);
		
	}
	public static void main1(String[] args) {
		Animal a1=new Animal();
		System.out.println(a1.alive);
		
		a1.eat();
		a1.move(120);
	}

}
