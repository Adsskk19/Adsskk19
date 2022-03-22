package co.kiran;

public class InheritanceDog {
	public static void main(String[] args) {
    Animal d1 = new Dog();  //Dog object is born
    d1.name = "husky";
    d1.type = "dabour";
    d1.age = 4;
    System.out.println(d1.getInfo()); //Dynamic polymorphism
//d1.getInfo("oxyy"); //Static polymorphism
    
	}
}
//Inheritance
//method Overriding
//Parent class reference