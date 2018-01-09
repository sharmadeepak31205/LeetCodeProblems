package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by deepaksharma on 1/7/18.
 */
public class SingleTon {

    private SingleTon(){}

    private static SingleTon instance;

    private static class SingletonHelper{
        private static final SingleTon singleton = new SingleTon();
    }

    public SingleTon getInstance(){
        return SingletonHelper.singleton;
    }

    public static SingleTon threadSafeWay(){
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null){
                    instance = new SingleTon();

                }
            }
        }
        return instance;
    }



}
