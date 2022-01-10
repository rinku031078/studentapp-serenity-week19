package com.studentapp.utils;

import java.util.Random;

/**
 * @author Anand Tripathi
 * @project StudentApp-Serenity-week19
 * @created 09/01/2022
 */
public class TestUtils {

    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}
