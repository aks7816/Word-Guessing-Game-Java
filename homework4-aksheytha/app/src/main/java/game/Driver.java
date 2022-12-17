package game;

//In this class, I am interacting with the user

import java.util.Scanner;

public class Driver {

    static boolean check = true;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Guessing guessing = new Guessing();
        User user = new User();
        System.out.println("Welcome to the word guessing game");
        System.out.println("Guess the secret word: ---------");

        while(check){

            System.out.print("Guess a letter:  ");
            System.out.println();
            String letter = sc.nextLine();
            guessing.setList(letter);
            guessing.getList();
            guessing.getIncorrectCount();
            user.result(user.correctAttempt(guessing));
            check = user.correctAttempt(guessing);
        }
    }
}

