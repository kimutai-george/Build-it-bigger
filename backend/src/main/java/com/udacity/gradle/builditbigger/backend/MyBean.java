package com.udacity.gradle.builditbigger.backend;


import com.example.jokelibrary.MyCoolJokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        //myData = new MyCoolJokes().getJoke();
        return myData;

    }
    String setData(String data){
        myData=data;
        return data;
    }
}