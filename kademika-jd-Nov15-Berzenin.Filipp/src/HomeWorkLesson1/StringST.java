package HomeWorkLesson1;

public class StringST {

	public static void main(String[] args) {
		String s = "Education is the most powerful weapon which you can use to change the world";
		String t = "An investment in knowledge pays the best interest";
		// use knowledge to change the world
		
		String a = s.substring(s.indexOf("use"), s.indexOf("use")+"use".length());
		String b = t.substring(t.indexOf("knowledge"), t.indexOf("knowledge")+"knowledge".length());
		String c = s.substring(s.indexOf("to change the world"));
		
		System.out.println(a+" "+b+" "+c);
		
		System.out.println("--------------------------------------");

		// use knowledge to change the world
		System.out.println(s.substring(52, 55)+" "+t.substring(17, 26)+" "+s.substring(56));
	}

}
