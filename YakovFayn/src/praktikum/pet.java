/**
 * Created by Samsung on 02.11.2015.
 */
package praktikum;

public class pet {
    int age;
    float weight;
    float height;
    String Color;

 final public void sleep(){
        System.out.println ("Good bay! See you soon.");
    }
    public void eat() {
        System.out.println ("I am very hungry, give mi chips!");
    }
    public String say(String aWorld) {
        String petResponse = "Ok!!" + aWorld;
        return petResponse;
    }
}
