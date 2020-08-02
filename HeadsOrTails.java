import java.util.Random;

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
        String result;//tossCoin()'s result
        int count = 0;//Heads's count

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