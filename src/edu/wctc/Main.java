package edu.wctc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //IntStream dice = IntStream.of(1, 3, 3, 3, 4);
        String[] nums = {"2","2","2","3","2"};




        handEvaluater evaluater = new handEvaluater();
        System.out.println(evaluater.determineResult(nums));
    }


}
