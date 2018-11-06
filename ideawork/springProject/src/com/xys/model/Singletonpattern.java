package com.xys.model;

/**
 * Created by Administrator on 2018/2/9.
 */
public class Singletonpattern {
    private static Singletonpattern ourInstance = new Singletonpattern();

    public static Singletonpattern getInstance() {
        return ourInstance;
    }

    private Singletonpattern() {
    }
}
