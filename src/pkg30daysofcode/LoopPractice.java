public class LoopPractice {

    public static void whileLoop(){
       int x = 0;
       while(x < 10) {
            System.out.println("X is : " + x);
            x++;
        }
    }

    public static void doWhileLoop() {
        int x = 0;
        do {
            System.out.println("X is : " + x++);
        } while( x < 12);

    }

    public static void forLoop(){
        for(int i = 0; i < 11; i++) {
            System.out.println("I is : " + i);
        }
    }

    public static void nestedLoop() {
        for(int i = 0; i < 11; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }

    public static void main(String[] args){
        whileLoop();
        doWhileLoop();
        forLoop();
        nestedLoop();
    }
}
