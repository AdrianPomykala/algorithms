package com.sda.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainGenerics {
    public static void main(String[] args) {
        System.out.println(addToList(new Scanner(System.in)));
        System.out.println(addToListVarArgs("Ala",14,new ArrayList<String>(),new Object()));
        Box<String> pudelko = new Box<String>("123");
        pudelko.whatsInTheBox();
        Para<String,Integer> para = new Para<String, Integer>("Ala",123);
        System.out.println(para.getLewy());
        System.out.println(para.getPrawy());
        DowodRzeczowy<Example> dowodRzeczowy = new DowodRzeczowy<Example>(new Example(),"BlaBla");
    }

    public static <T> List<T> addToList(T parametr){
        List<T> list = new ArrayList<T>();
        list.add(parametr);
        return list;
    }

    public static <T> List<T> addToListVarArgs(T... parametry){
        List<T> list = new ArrayList<T>();
//        List<T> list = new ArrayList<T>(Arrays.asList(parametry));
        for (T obj: parametry) {
            list.add(obj);
        }
        return list;
    }
}
