package HomeWorkLesson1;

public class valueDHMS {

	public static void main(String[] args) {
		long time = System.currentTimeMillis()/1000;
		
		int day = 60*60*24;
		System.out.print(time/day + ":");
		
		time=time%day;
		int hour = 60*60;
		System.out.print(time/hour + ":");
		
		time=time%hour;
		int minuts = 60;
		System.out.print(time/minuts + ":");
		
		time=time%minuts;
		System.out.print(time);
		
		System.out.println("");
		
		System.out.println("--------------------------------------------");
		
		
		long time2 = System.currentTimeMillis()/1000;
		long day2 = 60*60*24;
		long vday = time2/(60*60*24);
		
		long hour2 = ((System.currentTimeMillis()/1000) - (vday*day2))/(60*60);
		long min2 = ((System.currentTimeMillis()/1000) - (vday*day2)-(hour2*60*60))/(60);
		long sec2 = ((System.currentTimeMillis()/1000) - (vday*day2)-(hour2*60*60)-(min2*60));
		
		System.out.println(vday+":" + hour2 + ":" + min2 + ":" + sec2);
		
         //System.out.println((11/3)-(11-3*3));
	}

}
