package game;

//In this class, I am encapsulating the secret word. Also, this class has the interaction with the secret word.

import java.util.ArrayList;
import java.util.Arrays;

public class Guessing {

    private String[] dashLine = new String[9];
    private String[] wordLine = new String[9];
    private ArrayList<String> storeLetters = new ArrayList<String>();
    private String word = "chocolate";
    private int marker;

    public Guessing() {

        dashLine = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-"};
        wordLine = new String[]{"c", "h", "o", "c", "o", "l", "a", "t", "e"};
        storeLetters = new ArrayList<>();
        this.word = "chocolate";
        this.marker = 0;
    }

    public void setList(String letter) {

        if (storeLetters.contains(letter)){
            marker++;
            System.out.println("No such letter. You have " + (5-marker) + " incorrect attempts left");
            return;
        }
        storeLetters.add(letter);
        int count = 0;
        for (int x = 0; x < 9; x++) {
            if ((wordLine[x].equals(letter))) {
                dashLine[x] = letter;
                count++;
            }
        }
        if (count == 0) {
            marker++;
            System.out.println("No such letter. You have " + (5-marker) + " incorrect attempts left");
        }
    }

    public int getIncorrectCount(){

        return marker;
    }

    public boolean ifCorrect(){

        boolean check = true;
        if(Arrays.equals(dashLine, new String[]{"c", "h", "o", "c", "o", "l", "a", "t", "e"})){
            check = false;
        }
        return check;
    }

    public void getList(){
        String str = String.join("", dashLine);
        System.out.println("Your current guess is: " + str);
    }
}
