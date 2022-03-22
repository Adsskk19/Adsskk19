package co.kiran;

public class Inheritance {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "doll";
		cat1.type = "mammal";
		cat1.age = 2;
		cat1.haircolor ="Black";
		//System.out.println(cat1.getInfo());
		Dog dog1 = new Dog();
		dog1.name = "Oxyy";
		dog1.type = "Labrador";
		dog1.age = 4;
		dog1.haircolor = " yellow ";
		System.out.println(dog1.getInfo());
	}

}
