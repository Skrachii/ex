package L1;

public class Ex {
    public static void main(String[] args) {
        boolean gameOver=true;
        int score = 100;
        int levelCompleted=5;
        int bonus=100;

        if(gameOver){
            int FinalScore= score+(levelCompleted*bonus);
            System.out.println("Your final score is "+FinalScore);
        }
//        if(score<=5000 && score >=1000){
//            System.out.println("Your score is between 5000 and 1000");
//        }
//        else if (score<1000){
//            System.out.println("Your score is less than 1000");
//        }
//        else{
//            System.out.println("Greater than 5000");
//        }

    }
}
