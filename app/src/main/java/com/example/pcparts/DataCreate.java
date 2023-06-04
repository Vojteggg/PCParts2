package com.example.pcparts;

import android.provider.ContactsContract;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataCreate {
    public static List<Integer> imges;
    public static String name;
    public static Double price;
    public static int socket;
    public static int architecture;
    public static int noCores;
    public static int noThreads;
    public static String isTurbo;
    public static int memory;
    public static String graphics;
    public static int tdp;
    public static Double baseSpeed;
    public static Double turboSpeed;
    public static int shopCode;
    public static String webLink;
    public static int table;

    DataCreate() {
        imges = Arrays.asList();
        name = "";
        price=0.0;
        socket=0;
        architecture=0;
        noCores=0;
        noThreads=0;
        isTurbo="";
        memory=0;
        graphics="";
        tdp=0;
        baseSpeed=0.0;
        turboSpeed=0.0;
        shopCode=0;
        webLink="";
        table = 0;
    }

    public DataCreate(List<Integer> imges, String name, Double price, int socket, int architecture, int noCores,
            int noThreads, String isTurbo, int memory, String graphics,int tdp, Double baseSpeed,Double turboSpeed,int shopCode, int table
                      , String webLink) {
        this.name = name;
        this.socket=socket;
        this.architecture=architecture;
        this.noCores=noCores;
        this.noThreads=noThreads;
        this.isTurbo=isTurbo;
        this.shopCode=shopCode;
        this.memory=memory;
        this.graphics=graphics;
        this.tdp=tdp;
        this.baseSpeed=baseSpeed;
        this.turboSpeed=turboSpeed;
        this.imges = imges;
        this.table = table;
        this.price=price;
        this.webLink=webLink;
    }


}
