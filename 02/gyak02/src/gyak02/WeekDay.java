package gyak02;

enum WeekDay {
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT,
	SUN;
	
	public WeekDay nextDay(){
		 //return values()[3];
		//return values()[ordinal()+1];
		return values()[(ordinal() + 1) % values().length];
	}
	
	public WeekDay nextDay(int shift){
		return values()[(ordinal() + shift) % values().length];
	}
}
