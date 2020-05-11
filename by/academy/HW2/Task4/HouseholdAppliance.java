package by.academy.HW2.Task4;

abstract class HouseholdAppliance {
	String nameOfDevice;

	public String getNameOfDevice() {
		return nameOfDevice;
	}

	public void setNameOfDevice(String nameOfDevice) {
		this.nameOfDevice = nameOfDevice;
	}

	public HouseholdAppliance(String nameOfDevice) {
		super();
		this.nameOfDevice = nameOfDevice;
	}

	public HouseholdAppliance() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nameOfDevice);
		return builder.toString();
	}
}

interface PlugInable {
	void PlugIn ();
}

