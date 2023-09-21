package gyak02;

enum WeekDay {
	MON("HET"),
	TUE("KED"),
	WED("SZE"),
	THU("CSÜ"),
	FRI("PEN"),
	SAT("SZO"),
	SUN("VAS");
	
	//final és a const nem ugyan az.
	//String inmutable
	private String huName;
	
	WeekDay(String huName) {
		this.huName = huName;
	}
	
	public String getHuName() {
		return this.huName;
	}
	
	public void setHuName(String huName) {
		this.huName = huName;
	}
	
	public WeekDay nextDay() {
		 //return values()[3];
		//return values()[ordinal()+1];
		return values()[(ordinal() + 1) % values().length];
	}
	
	public WeekDay nextDay(int shift) {
		return values()[(ordinal() + shift) % values().length];
	}
}
