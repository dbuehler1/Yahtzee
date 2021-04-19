package edu.wctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class handEvaluater {




    public static String determineResult(String[] nums){
        boolean ThreeOfAKind = false;
        boolean FourOfAKind = false;
        boolean Yahtzee = false;

        List<String> dice = Arrays.asList(nums);
        Collections.sort(dice);
        int pairs = 0;
        for(int x = 1; x < 7; x++){
            int match = 0;
            for(int y = 0; y < 5; y++){
                if(Integer.parseInt(dice.get(y)) == x){
                    match++;
                }
            }
            switch(match){
                case 2:
                    pairs++;
                    break;
                case 3:
                    ThreeOfAKind = true;
                    break;
                case 4:
                    FourOfAKind = true;
                    break;
                case 5:
                    Yahtzee = true;
                    break;
            }
        }
        if(Yahtzee == true){
            return("Yahtzee!");
        }
        else if(FourOfAKind == true){
            return("Four of a Kind!");
        }
        else if(ThreeOfAKind == true && pairs == 1){
            return("Full House!");
        }
        else if(ThreeOfAKind == true && pairs == 0) {
            return ("Three of a Kind!");
        }
        else if(pairs == 2){
            return("Two Pair!");
        }
        else if(pairs == 1){
            return("Pair!");
        }
        else{
            return("One of a Kind!");
        }



    }

}
