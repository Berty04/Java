package by.academy.HW2.Task4;

public class BluRay extends VideoPlayer implements PlugInable {
	public BluRay(String nameOfDevice) {
		super(nameOfDevice);
	}
	
	public void PlugIn() {
		System.out.println(this + " is plugged in");
	}
}