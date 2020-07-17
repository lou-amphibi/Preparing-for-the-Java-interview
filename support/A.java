package support;

public class A {
	final boolean blame;
	final int age;
    final String name;

    public A(int age, String name, boolean blame) {
    	this.blame = blame;
        this.age = age;
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello world!!!");
    }
    
    public String sayHello2() {
        return "Goodbye World!!!";
    }


}
