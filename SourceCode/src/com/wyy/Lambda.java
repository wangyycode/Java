package com.wyy;


import java.util.function.Predicate;

interface Converter<F,T> {

    F converter(T t);

}




public class Lambda {

    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(111);

            }
        });

        t1.start();

        new Thread(()-> System.out.println(111)).start();


        Converter<String,Integer> converter = new Converter<String, Integer>() {
            @Override
            public String converter(Integer integer) {
                return integer.toString();
            }
        };

        System.out.println(converter.converter(3));


        Converter<Integer,String> converter1 = t -> {t += 1;return Integer.valueOf(t);};

        System.out.println(converter1.converter("112"));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return -1 == s.lastIndexOf('s');
            }
        };

    }



}
