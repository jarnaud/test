package test.model;

public class Locomotive extends RailwayVehicle {

	private int power;

	public Locomotive(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
