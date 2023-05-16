package com.example.pcparts;

import android.provider.ContactsContract;

import java.util.Arrays;
import java.util.List;

public class DataCreate {
    public static List<Integer> imges;
    public static String name;
    DataCreate(){
        imges= Arrays.asList();
        name="";
    }

    public DataCreate(List<Integer> imges,String name){
        this.name=name;
        this.imges=imges;

    }
}
