import java.util.Scanner;
import java.util.Random;
public class MadLibs {

    Scanner sc = new Scanner(System.in);
    String story;
    String name;
    String adj1;
    String adj2;
    String noun1;
    String noun2;
    String noun3;
    String adverb1;
    String randomNums;
    Random rand = new Random();

    // Getters
    public String getStory() {
        return story;
    }
    public String getName() {
        return name;
    }
    public String getAdj1() {
        return adj1;
    }
    public String getAdj2() {
        return adj2;
    }
    public String getNoun1() {
        return noun1;
    }
    public String getNoun2() {
        return noun2;
    }
    public String getNoun3() {
        return noun3;
    }
    public String getAdverb1() {
        return adverb1;
    }
    public String getRandomNums() {
        return randomNums;
    }
    // Setters
    public void setStory(String newStory) {
        this.story = newStory;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAdj1(String newAdj1) {
        this.adj1 = newAdj1;
    }
    public void setAdj2(String newAdj2) {
        this.adj2 = newAdj2;
    }
    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }
    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }
    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }
    public void setAdverb1(String newAdverb1) {
        this.adverb1 = newAdverb1;
    }
    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 1000;
        int index = 0;
        int[] nums = new int[3];
        while(index < nums.length) {
            nums[index] = num + index;
            index++;
        }
        randomNums = "not " + nums[0] + ", not " + nums[1] + " but " + nums[2];
    }

    public void printInstructions() {
        System.out.println("Welcome to the Madlibs game. If you type in words, we'll "
                + "create a story for you. Start by typing in your name." );
    }

    public void constructStory() {
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if(num == 0) {
            story = "Jimmy Dean and his dog " + getName() + " went to a dog park today. " +
                    "They saw a " + getNoun1() + " sitting at the edge of the park. " +
                    "Once they encountered a " + getAdj1() + " ball bouncing " + getAdverb1() + ". " +
                    "The " + getNoun2() + " was really excited to see the " + getAdj2() + " toys. " +
                    "We were quick to discover " + getNoun3() + "'s favorite toy was " + getRandomNums() +
                    " days old.";
        } else {
            story = "James Dean and his monkey " + getName() + " went to the circus today. " +
                    "They saw a " + getNoun1() + " sitting at the edge of the ring. " +
                    "Once they encountered a " + getAdj1() + " ball bouncing " + getAdverb1() + ". " +
                    "The " + getNoun2() + " was really excited to see the " + getAdj2() + " exhibit. " +
                    "We were quick to discover " + getNoun3() + "'s favorite event was " + getRandomNums() +
                    " dancing elephants.";
        }
        setStory(story);
    }

    public void enterName() {
        setName(sc.nextLine());
    }
    public void enterNoun1() {
        System.out.println("Please enter a noun");
        setNoun1(sc.nextLine());
    }
    public void enterNoun2() {
        System.out.println("Please enter a noun");
        setNoun2(sc.nextLine());
    }
    public void enterNoun3() {
        System.out.println("Please enter a noun");
        setNoun3(sc.nextLine());
    }
    public void enterAdj1(){
        System.out.println("Please enter an adjective");
        setAdj1(sc.nextLine());
    }
    public void enterAdj2(){
        System.out.println("Please enter an adjective");
        setAdj2(sc.nextLine());
    }
    public void enterAdverb1() {
        System.out.println("Please enter an adverb");
        setAdverb1(sc.nextLine());
    }

    public void play() {
        enterName();
        enterAdj1();
        enterAdj2();
        enterAdverb1();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        setRandomNums();
        constructStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
}
