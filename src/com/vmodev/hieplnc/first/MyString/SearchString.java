package com.vmodev.hieplnc.first.MyString;

import java.util.ArrayList;
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

    public void searchString(String keyWord){
        ArrayList<String> words = getWord(keyWord);
        for(String i : words){
            System.out.println(i);
        }
    }
}
