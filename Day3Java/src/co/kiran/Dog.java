package co.kiran;

public class Dog extends Animal {
    String haircolor;
   
    public String getInfo1() {
    	return name+" is a " + type + " who is " + age + " years old with " +haircolor + " haircolor";}
    	 //Method overloding
    	public String getInfo(String name) {
    		return name + " over ";
    	}
}
