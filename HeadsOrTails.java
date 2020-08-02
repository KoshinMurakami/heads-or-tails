import java.util.Random;
import java.util.Scanner;

class HeadsOrTails {
    
    static String tossCoin() {
        Random r = new Random();

        if(r.nextInt(2) == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String result;//tossCoin()'s result
        int count = 0;//Heads's count
        String name;//user name
        
        //greeting the user
        System.out.println("Who are you?");
        System.out.print("> ");
        name = stdIn.nextLine();
        System.out.println("Hello, " + name + "!");

        //coin toss
        System.out.println("Tossing a coin...");

        for(int i = 1; i <= 3; i++) {
            result = tossCoin();
            System.out.println("Round" + i + ":" + result);
            if(result.equals("Heads")) {
                count++;
            }
        }

        System.out.print("Heads:" + count);
        System.out.println(", Tails:" + (3 - count));
    }
}