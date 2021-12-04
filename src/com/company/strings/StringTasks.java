package com.company.strings;

import static com.company.strings.StringUtils.lastSurvivors;

public class StringTasks {

    public static void main(String[] args) {
        String testOne = "abaa";
        String resultOne = lastSurvivors(testOne);

        System.out.println("Test string: " + testOne);
        System.out.println("Result string: " + resultOne);

        String testTwo = "zzab";
        String resultTwo = lastSurvivors(testTwo);


        System.out.println("Test string: " + testTwo);
        System.out.println("Result string: " + resultTwo);

        String testThree = "xsdlafqpcmjytoikojsecamgdkehrqqgfknlhoudqygkbxftivfbpxhxtqgpkvsrfflpgrlhkbfnyftwkdebwfidmpauoteahyh";
        String resultThree = lastSurvivors(testThree);

        System.out.println("Test string: " + testThree);
        System.out.println("Result string: " + resultThree);
    }
}
