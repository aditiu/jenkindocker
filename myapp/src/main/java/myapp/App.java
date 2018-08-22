package myapp;
import myappDemo.Demo;
public class App {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Demo d = new Demo();
		d.test();
	}
	public String web() {
		return "I am method of App jar and called inside war version number 8.3";

	}

}
