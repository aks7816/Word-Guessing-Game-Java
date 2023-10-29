package game;

//This class, checks for the incorrect guesses

public class User {

    int place = 0;

    public boolean correctAttempt(Guessing guessing){

        if(guessing.getIncorrectCount() >= 5){
            place = 0;
            return false;
        }
        else{
            if(!guessing.ifCorrect()){
                place = 1;
                return false;
            }
            else{
                return true;
            }
        }
    }

    public void result(boolean check){

        while(!check){
            if(place == 0) {
                System.out.println("You lose! The secret word is chocolate.");
                break;
            }
            else if (place == 1){
                System.out.println("Congrats! You guessed the secret word.");
                break;
            }
        }
    }
}
