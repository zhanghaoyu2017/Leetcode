package com.hiasenna.shejimoshi;

/**
 * @ClassName Single
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/12-10:15
 * @Version 1.0
 **/

public class Single {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}