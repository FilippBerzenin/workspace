
public class task1homework {

	public static void main(String[] args) {
		
		//System.out.println(System.currentTimeMillis()/1000/60/60/24);//dhms
		//System.out.println(System.currentTimeMillis()/1000/60/60);//dhms
		//System.out.println(System.currentTimeMillis()/1000/60);//dhms
		
		//System.out.println(System.currentTimeMillis()/1000);//dhms
		
		//System.out.println((System.currentTimeMillis()/1000/60/60/24)+":"+(System.currentTimeMillis()/1000/60/60)+":"+(System.currentTimeMillis()/1000/60)+":"+System.currentTimeMillis()/1000);
	long time = System.currentTimeMillis()/1000; //value in seconds
	
	int sd = 60*60*24;
	System.out.println(time/sd+ ":");
	
	time=time%sd;
	sd=60*60;
	System.out.println(time/sd + ":");
	
	time=time%sd;
	sd=60;
	System.out.println(time/sd + ":");
	
	System.out.println(time%sd);
	
	
	double value = 24.6;
	String word = String.valueOf(value);
	int krapka = word.indexOf(".");
	System.out.println(word.substring(0,krapka));
	System.out.println(word.substring(krapka+1));
	
	String s = "Education is the most powerful weapon which you can use to change the world";
	String t = "An investment in knowledge pays the best interest";
	
	//use knowledge to change the world"
	String a = s.substring(52,55);//use
	String b = t.substring(17,26);//knowledge
	String c = s.substring(56,58);//to
	String d = s.substring(59,65);//change
	String i = s.substring(13,16);//the
	String f = s.substring(70,75);//world
	System.out.println(a+" "+b+" "+c+" "+d+" "+i+" "+f);
	}


	}


