package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] jokes = {"My new thesaurus is terrible. In fact, it's so bad, I'd say it's terrible.", "How are false teeth like stars? They come out at night!", "Why are skeletons so calm? Because nothing gets under their skin.", "I got fired from a florist, apparently I took too many leaves.", "Q: What’s 50 Cent’s name in Zimbabwe? A: 200 Dollars."};
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter for hillarious joke!");
        while(true){
            String inputString = input.nextLine();
            if(inputString.equals("")){
                Random r = new Random();
                int randomNumber = r.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);

            }

        }


    }
}
