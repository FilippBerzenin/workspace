package praktikum;

public class Fish extends pet {
	
	int currentDepth;
	Fish(int startingPosition) {
	currentDepth = startingPosition;
	}
	
public int dive (int howDepp) {
	currentDepth += howDepp;
	if (currentDepth>100) {
	System.out.println("I am littel fish, so i dont can dive so depth");	
	}
	else {System.out.println("I dive on " + howDepp + " futs!");
	System.out.println("I am on " + currentDepth + " futs!");
	}
	return currentDepth;
	
}

public String say (String something) {
	return "You mast now. Fish dont can say!";
}

}
