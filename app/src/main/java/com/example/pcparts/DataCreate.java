package com.example.pcparts;

import android.provider.ContactsContract;

import java.util.Arrays;
import java.util.List;

public class DataCreate {
    public static List<Integer> imges;
    public static String name;
    public static String price;
    public static String webLink;
    public static int table;

    DataCreate() {
        imges = Arrays.asList();
        name = "";
        price="";
        webLink="";
        table = 0;

    }

    public DataCreate(List<Integer> imges, String name, int table,String price,String webLink) {
        this.name = name;
        this.imges = imges;
        this.table = table;
        this.price=price;
        this.webLink=webLink;
    }
}
