package jiin.chapter06_command.home;

import lombok.Getter;
import lombok.Setter;

public class Stereo {
	private String location;
	@Getter
	private int status;
	@Getter
	private String mode;

	public static final int OFF = 0;
	public static final int ON = 1;

	public static final String CD = "cd";
	public static final String DVD = "dvd";
	public static final String RADIO = "radio";

	public Stereo(String location) {
		this.location = location;
		status = OFF;
		mode = CD;
	}

	public void on() {
		status = ON;
		System.out.println(location + " stereo is on");
	}

	public void off() {
		status = OFF;
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		mode = CD;
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		mode = DVD;
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		mode = RADIO;
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		System.out.println(location + " stereo volume set to " + volume);
	}
}
