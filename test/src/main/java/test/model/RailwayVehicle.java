package test.model;

/**
 * 
 * @author Jean Arnaud
 *
 */
public abstract class RailwayVehicle extends Vehicle {

	/**
	 * Standard track gauge of 1435mm
	 */
	public static final int TRACK_GAUGE_STD = 1435;

	private int trackGauge;

	public RailwayVehicle(int trackGauge) {
		this.trackGauge = trackGauge;
	}

	public int getTrackGauge() {
		return trackGauge;
	}

	public void setTrackGauge(int trackGauge) {
		this.trackGauge = trackGauge;
	}
}
