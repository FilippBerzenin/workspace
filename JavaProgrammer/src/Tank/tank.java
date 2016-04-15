package Tank;

public class tank {
	
	String color;
	int maxSpeed;
	int crew;

//	tank (String color) {
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//		this.crew = crew;
//	}
	

	public void setColor(String color) {
		System.out.print("+");
		this.color = color;
		System.out.print("+");
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getCrew() {
		return crew;
	}

}
