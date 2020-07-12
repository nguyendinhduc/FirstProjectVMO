package com.vmodev.hieplnc.first.MyString;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SearchString {
    private ArrayList<String> listString;
    private Pattern myPattern;

    public SearchString(ArrayList<String> listString){
        this.listString = listString;
    }

    public ArrayList<String> getListString() {
        return listString;
    }

    public void setListString(ArrayList<String> listString) {
        this.listString = listString;
    }

    public void addString(String word){
        listString.add(word);
    }

    private static boolean isSpace(char space){ return space == ' ' || space == '\t'; }

    private int levenshteinDistance(String word, String pattern){
        if(word.length() == 0 || pattern.length() == 0) return word.length() + pattern.length();

        int[] editDistance = new int[3];
        editDistance[0] = levenshteinDistance(word.substring(0, word.length() - 1), pattern) + 1;
        editDistance[1] = levenshteinDistance(word, pattern.substring(0, pattern.length() - 1)) + 1;

        editDistance[2] = levenshteinDistance(word.substring(0, word.length() - 1), pattern.substring(0, pattern.length() - 1));
        editDistance[2] += word.charAt(word.length() - 1) == pattern.charAt(pattern.length() - 1) ? 0 : 1;

        int minDistance = editDistance[0];
        for(int i = 0; i < 3; i++){
            minDistance = Math.min(minDistance, editDistance[i]);
        }
        return minDistance;
    }

    private static ArrayList<String> getWord(String word){
        int index = -1;
        ArrayList<String> wordList = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            if(!isSpace(word.charAt(i))){
                if(index == -1) {
                    index = i;
                }
            } else{
                if(index > -1){
                    wordList.add(word.substring(index, i));
                    index = -1;
                }
            }
        }
        if(index != -1) wordList.add(word.substring(index));
        return wordList;
    }

    private int sentenceCompare(String sentence, String pattern){
        ArrayList<String> sentenceWordList = getWord(sentence);
        ArrayList<String> patternWordList = getWord(pattern);

        int minDistance = -1;
        int score = 0;
        for(int i = 0; i < sentenceWordList.size(); i++){
            for(int j = 0; j < patternWordList.size(); j++){
                int temp = levenshteinDistance(sentenceWordList.get(i), patternWordList.get(j));
                if(minDistance > temp || minDistance < 0) minDistance = temp;
            }
            score += minDistance;
            minDistance = -1;
        }
        return score;
    }

    private void sortString(List<String> stringList, List<Integer> scoreList){
        for(int i = 0; i < scoreList.size(); i++){
            for(int j = i + 1; j < scoreList.size(); j++){
                int score_1 = scoreList.get(i);
                int score_2 = scoreList.get(j);
                if(score_1 > score_2){
                    String pattern_1 = stringList.get(i);
                    String pattern_2 = stringList.get(j);

                    scoreList.set(j, score_1);
                    scoreList.set(i, score_2);
                    stringList.set(j, pattern_1);
                    stringList.set(i, pattern_2);
                }
            }
        }
    }

    private void displayList(List myList){
        System.out.println("Display List:");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    public void searchString(String keyWord){
        List<Integer> scoreList = new ArrayList<>();
        for(int i = 0; i < listString.size(); i++){
            scoreList.add(sentenceCompare(keyWord, listString.get(i)));
        }
        sortString(listString, scoreList);
        displayList(listString);
    }
}
