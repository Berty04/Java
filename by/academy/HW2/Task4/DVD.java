package by.academy.HW2.Task4;

public class DVD extends VideoPlayer implements PlugInable {
	public DVD(String nameOfDevice) {
		super(nameOfDevice);
	}
	
	public void PlugIn() {
		System.out.println(this + " is plugged in");
	}
}
