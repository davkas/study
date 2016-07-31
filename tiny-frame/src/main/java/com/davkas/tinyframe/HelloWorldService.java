package com.davkas.tinyframe;

/**
 * Created by davkas on 16/7/29.
 */
public class HelloWorldService {

    private String text;

    public void helloWorld(){
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }

}
