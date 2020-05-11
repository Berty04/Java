package by.academy.HW2.Task4;

public class Main {
	public static void main(String[] args) {
		PlugInable device1 = new BluRay ("BluRay Video Player");
		System.out.println(device1);
				
		PlugInable device2 = new BluRay ("DVD Video Player");
		System.out.println(device2);
		device2.PlugIn();
	}
}
