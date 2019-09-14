package com.example.jokelib;

import java.util.Random;

public class MyJoke {
    private static final String[] jokesCollection = {
            "Today at the bank, an old lady asked me to help check her balance. So I pushed her over.",
            "I bought some shoes from a drug dealer. I don't know what he laced them with, but I've been tripping all day.",
            "I told my girlfriend she drew her eyebrows too high. She seemed surprised.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away."
    };

    public static String getJoke() {
        return jokesCollection[new Random().nextInt(jokesCollection.length)];
    }
}
