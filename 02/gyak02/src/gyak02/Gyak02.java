package gyak02;


public class Gyak02 {
	public static void main(String[] args){
		System.out.println(City.BUDAPEST);
		System.out.println(City.BUDAPEST.getZipCode());
		System.out.println(City.BUDAPEST.toString());
		
		System.out.println("---");
		System.out.println(City.KALOCSA);
		System.out.println(City.KALOCSA.getZipCode());
		System.out.println(City.KALOCSA.toString());
		
		System.out.println("---");
		System.out.println(City.KISKUNHALAS);
		System.out.println(City.KISKUNHALAS.getZipCode());
		System.out.println(City.KISKUNHALAS.toString());
		
		System.out.println("---");
		System.out.println(City.BUDAPEST2);
		
		System.out.println("---");
		for (City city : City.values()) {
			System.out.println(city.toString());
		}
		
		System.out.println("---");
		System.out.println(WeekDay.MON);
		System.out.println(WeekDay.TUE);
		System.out.println(WeekDay.WED);
		System.out.println(WeekDay.THU);
		System.out.println(WeekDay.FRI);
		System.out.println(WeekDay.SAT);
		System.out.println(WeekDay.SUN);
		
		System.out.println("---");
		for (WeekDay day : WeekDay.values()) {
			System.out.println(day);
		}
		
		System.out.println("---");
		System.out.println(WeekDay.MON.nextDay());
		
		System.out.println("---");
		System.out.println(WeekDay.SUN.nextDay());
		
		System.out.println("---");
		System.out.println(WeekDay.MON.nextDay(3));
		
		System.out.println("---");
		System.out.println(WeekDay.SAT.nextDay(3));
		
		System.out.println("---");
		System.out.println(WeekDay.SAT.nextDay(-3));
		
		System.out.println("---");
		System.out.println(WeekDay.SAT.nextDay(-3));
		
		
	}
}