package com.example.stroll.ui.kuis;


public class SoalDestinasi {

    public static String mQuestions [] = {
            "Dimana tempat main yang asik bareng temen ?",
            "Dimana wisata edukasi kesukaanmu?",
            "Dimana tempat indoor yang kamu banget?"


    };


    private String mChoices [][] = {
            {"Pantai", "Kolam Renang", "Restoran"},
            {"Publik Places","Candi","Museum "},
            {"Mall", "Bioskop", "Internet Cafe"}

    };


    private String mCorrectAnswers[] = {"16 masehi", "Leaves", "Flower"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
