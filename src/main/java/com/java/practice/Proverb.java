package com.java.practice;

class Proverb {

    String[] words;
    private static final String normalSentence = "For want of a #arg the #arg was lost.\n";
    private static final String finalSentence = "And all for the want of a ";

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words == null || words.length == 0) {
            return "";
        }

        int arrLength = words.length;
        if (arrLength == 1) {
            return finalSentence + words[0] + ".";
        }

        boolean isEvenLength = arrLength % 2 == 0;
        int iterations = arrLength/2;

        if (!isEvenLength) {
            iterations = arrLength/2 - 1;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append(normalSentence);
        }

        String finalString = sb.toString();
        for (int i = 0; i < (isEvenLength ? arrLength : arrLength-1); i++) {
            finalString = finalString.replaceFirst("#arg", words[i]);
        }

        return finalString + finalSentence + words[0] + ".";
    }

    public static void main(String[] args) {
//        String[] words = new String[]{"nail", "shoe"};
        String[] words  = new String[]{"pin", "gun", "soldier", "battle"};

        System.out.println(new Proverb(words).recite());
    }

}
