package com.example.stroll.ui.kuis;


import com.example.stroll.R;

public class SoalDestinasi {

    public static int[] mImage = {
            R.drawable.quizi,
            R.drawable.quizii,
            R.drawable.quiziii
    };

    public static String[] mQuestions = {
            "Dimana tempat main yang asik bareng temen?",
            "Dimana wisata edukasi kesukaanmu?",
            "Dimana tempat indoor yang kamu banget?"
    };


    private final String[][] mChoices = {
            {"Pantai", "Kolam Renang", "Restoran"},
            {"Publik Places","Candi","Museum "},
            {"Mall", "Bioskop", "Internet Cafe"}
    };


    public int getImage(int a) {
        return mImage[a];
    }

    public String getQuestion(int a) {
        return mQuestions[a];
    }

    public String getChoice1(int a) {
        return mChoices[a][0];
    }

    public String getChoice2(int a) {
        return mChoices[a][1];
    }
    public String getChoice3(int a) {
        return mChoices[a][2];
    }

}
