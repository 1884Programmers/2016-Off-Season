package frc.team1884.testbot.controllers;

import edu.wpi.first.wpilibj.Joystick;

public class XboxController extends Joystick {
	public XboxController(int port) {
		super(port);
	}

	public double getLeftXAxis() {
		return this.getRawAxis(0);
	}

	public double getLeftYAxis() {
		return this.getRawAxis(1);
	}

	public double getRightXAxis() {
		return this.getRawAxis(4);
	}

	public double getRightYAxis() {
		return this.getRawAxis(5);
	}

	public double getLeftTrigger() {
		return this.getRawAxis(2);
	}

	public double getRightTrigger() {
		return this.getRawAxis(3);
	}

	public POVPosition getDPadPosition() {
		switch (this.getPOV(0)) {
		case 0:
			return POVPosition.UP;
		case 45:
			return POVPosition.UP_RIGHT;
		case 90:
			return POVPosition.RIGHT;
		case 135:
			return POVPosition.DOWN_RIGHT;
		case 180:
			return POVPosition.DOWN;
		case 225:
			return POVPosition.DOWN_LEFT;
		case 270:
			return POVPosition.LEFT;
		case 315:
			return POVPosition.UP_LEFT;
		default:
			return null;
		}
	}
	
	public boolean getButtonA() {
		return this.getRawButton(1);
	}
	
	public boolean getButtonB() {
		return this.getRawButton(2);
	}
	
	public boolean getButtonX() {
		return this.getRawButton(3);
	}
	
	public boolean getButtonY() {
		return this.getRawButton(4);
	}
	
	public boolean getLeftBumber() {
		return this.getRawButton(5);
	}
	
	public boolean getRightBumper() {
		return this.getRawButton(6);
	}
	
	public boolean getBack() {
		return this.getRawButton(7);
	}
	
	public boolean getStart() {
		return this.getRawButton(8);
	}
	
	public boolean getLeftStickDepressed() {
		return this.getRawButton(9);
	}
	
	public boolean getRightStickDepressed() {
		return this.getRawButton(10);
	}
}
