package people.domain;

public class FareDTO {
	int yearFare;
	double fare100 = 1250;
	double fare80 = 1000;
	double fare50 = 625;
	double fare30 = 375;
	public FareDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FareDTO(int yearFare, double fare100, double fare80, double fare50, double fare30) {
		super();
		this.yearFare = yearFare;
		this.fare100 = fare100;
		this.fare80 = fare80;
		this.fare50 = fare50;
		this.fare30 = fare30;
	}
	public double getYearFare() {
		return yearFare;
	}
	public void setYearFare(int yearFare) {
		this.yearFare = yearFare;
	}
	public double getFare100() {
		return fare100;
	}
	public void setFare100(double fare100) {
		this.fare100 = fare100;
	}
	public double getFare80() {
		return fare80;
	}
	public void setFare80(double fare80) {
		this.fare80 = fare80;
	}
	public double getFare50() {
		return fare50;
	}
	public void setFare50(double fare50) {
		this.fare50 = fare50;
	}
	public double getFare30() {
		return fare30;
	}
	public void setFare30(double fare30) {
		this.fare30 = fare30;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" [해당 연도=");
		builder.append(yearFare);
		builder.append("  l  1250원 일 경우 = ");
		builder.append(fare100);
		builder.append("  l  1000원 일 경우 = ");
		builder.append(fare80);
		builder.append("  l   675원 일 경우 = ");
		builder.append(fare50);
		builder.append("  l  375원 일 경우 = ");
		builder.append(fare30);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
