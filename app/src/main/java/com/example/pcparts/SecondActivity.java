package com.example.pcparts;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Map;

public class SecondActivity extends AppCompatActivity  {
    String line = "";
    String csvSplitBy = ",";

    List<String> names = new ArrayList<>();
    List<Double> prices = new ArrayList<>();
    List<Integer> sockets = new ArrayList<>();
    List<Integer> architektura = new ArrayList<>();
    List<Integer> lrdzeni = new ArrayList<>();
    List<Integer> lwatkow = new ArrayList<>();
    List<String> czymnoznik = new ArrayList<>();
    List<String> grafika = new ArrayList<>();
    List<Integer> pamiec = new ArrayList<>();
    List<Integer> tdp = new ArrayList<>();
    List<Double> taktowanie = new ArrayList<>();
    List<Integer> kodSklepu = new ArrayList<>();
    List<Double> turbo = new ArrayList<>();

    Button BT1;
    Button BT3;
    TextView TVnazwa;
    ImageView IMGV1;
    TextView PRICE;
    TextView TVSocket;
    TextView TVSocket2;
    TextView TVArchitecture;
    TextView TVArchitecture2;
    TextView TVRdzenie;
    TextView TVRdzenie2;
    TextView TVWatki;
    TextView TVWatki2;
    TextView TVMnoznik;
    TextView TVMnoznik2;
    TextView TVPamiec;
    TextView TVPamiec2;
    TextView TVGrafika;
    TextView TVGrafika2;
    TextView TVTdp;
    TextView TVTdp2;
    TextView TVTaktowanie;
    TextView TVTaktowanie2;
    TextView TVTurbo;
    TextView TVTurbo2;
    TextView TVKodsklepu;
    TextView TVKodsklepu2;




    DecimalFormat decimalFormat = new DecimalFormat("0.00");


    private DataCreate getImageListForButton(int buttonIndex) {
        List<Integer> imges=Arrays.asList();
        String name="";
        Double price=0.0;
        int socketV=0;
        int architekturaV=0;
        int lrdzeniV=0;
        int lwatkowV=0;
        String czyMnoznikV="";
        String grafikaV="";
        int pamiecV=0;
        int tdpV=0;
        Double taktowanieV=0.0;
        Double turboV=0.0;
        String webLink="";
        int shopCodeV=0;
        int table=0;


        // Determine the appropriate imageList based on the buttonIndex
        switch (buttonIndex) {
            case 1:
                imges = Arrays.asList(R.drawable.i9_1_1);
                name = names.get(0);
                price = prices.get(0);
                socketV = sockets.get(0);
                architekturaV = architektura.get(0);
                lrdzeniV=lrdzeni.get(0);
                lwatkowV=lwatkow.get(0);
                czyMnoznikV=czymnoznik.get(0);
                grafikaV=grafika.get(0);
                pamiecV=pamiec.get(0);
                tdpV=tdp.get(0);
                taktowanieV=taktowanie.get(0);
                turboV=turbo.get(0);
                shopCodeV=kodSklepu.get(0);
                table = R.drawable.i9_1_tab;
                webLink="https://www.x-kom.pl/p/689606-procesor-intel-core-i9-intel-core-i9-12900k.html";
                break;

            case 2:
                imges = Arrays.asList(R.drawable.i9_2_1, R.drawable.i9_2_2, R.drawable.i9_2_3, R.drawable.i9_2_4, R.drawable.i9_2_5, R.drawable.i9_2_6);
                name = names.get(1);
                price = prices.get(1);
                socketV = sockets.get(1);
                architekturaV = architektura.get(1);
                lrdzeniV=lrdzeni.get(1);
                lwatkowV=lwatkow.get(1);
                czyMnoznikV=czymnoznik.get(1);
                grafikaV=grafika.get(1);
                pamiecV=pamiec.get(1);
                tdpV=tdp.get(1);
                taktowanieV=taktowanie.get(1);
                turboV=turbo.get(1);
                shopCodeV=kodSklepu.get(1);
                table = R.drawable.i9_2_tab;
                webLink="https://www.x-kom.pl/p/1101211-procesor-intel-core-i9-intel-core-i9-13900ks.html";
                break;

            case 3:
                imges = Arrays.asList(R.drawable.i9_3_1, R.drawable.i9_3_2, R.drawable.i9_3_3);
                name = names.get(2);
                price = prices.get(2);
                socketV = sockets.get(2);
                architekturaV = architektura.get(2);
                lrdzeniV=lrdzeni.get(2);
                lwatkowV=lwatkow.get(2);
                czyMnoznikV=czymnoznik.get(2);
                grafikaV=grafika.get(2);
                pamiecV=pamiec.get(2);
                tdpV=tdp.get(2);
                taktowanieV=taktowanie.get(2);
                turboV=turbo.get(2);
                shopCodeV=kodSklepu.get(2);
                table = R.drawable.i9_3_tab;
                webLink="https://www.x-kom.pl/p/626765-procesor-intel-core-i9-intel-core-i9-11900k.html";
                break;

            case 4:
                imges = Arrays.asList(R.drawable.i7_1_1);
                name = names.get(3);
                price = prices.get(3);
                socketV = sockets.get(3);
                architekturaV = architektura.get(3);
                lrdzeniV=lrdzeni.get(3);
                lwatkowV=lwatkow.get(3);
                czyMnoznikV=czymnoznik.get(3);
                grafikaV=grafika.get(3);
                pamiecV=pamiec.get(3);
                tdpV=tdp.get(3);
                taktowanieV=taktowanie.get(3);
                turboV=turbo.get(3);
                shopCodeV=kodSklepu.get(3);
                table = R.drawable.i7_1_tab;
                webLink="https://www.x-kom.pl/p/689603-procesor-intel-core-i7-intel-core-i7-12700k.html";
                break;

            case 5:
                imges = Arrays.asList(R.drawable.i7_2_1, R.drawable.i7_2_2);
                name = names.get(4);
                price = prices.get(4);
                socketV = sockets.get(4);
                architekturaV = architektura.get(4);
                lrdzeniV=lrdzeni.get(4);
                lwatkowV=lwatkow.get(4);
                czyMnoznikV=czymnoznik.get(4);
                grafikaV=grafika.get(4);
                pamiecV=pamiec.get(4);
                tdpV=tdp.get(4);
                taktowanieV=taktowanie.get(4);
                turboV=turbo.get(4);
                shopCodeV=kodSklepu.get(4);
                table = R.drawable.i7_2_tab;
                webLink="https://www.x-kom.pl/p/626762-procesor-intel-core-i7-intel-core-i7-11700kf.html";
                break;

            case 6:
                imges = Arrays.asList(R.drawable.i7_3_1, R.drawable.i7_3_2);
                name = names.get(5);
                price = prices.get(5);
                socketV = sockets.get(5);
                architekturaV = architektura.get(5);
                lrdzeniV=lrdzeni.get(5);
                lwatkowV=lwatkow.get(5);
                czyMnoznikV=czymnoznik.get(5);
                grafikaV=grafika.get(5);
                pamiecV=pamiec.get(5);
                tdpV=tdp.get(5);
                taktowanieV=taktowanie.get(5);
                turboV=turbo.get(5);
                shopCodeV=kodSklepu.get(5);
                table = R.drawable.i7_3_tab;
                webLink="https://www.x-kom.pl/p/564443-procesor-intel-core-i7-intel-core-i7-10700f.html";
                break;

            case 7:
                imges = Arrays.asList(R.drawable.i5_1_1);
                name = names.get(6);
                price = prices.get(6);
                socketV = sockets.get(6);
                architekturaV = architektura.get(6);
                lrdzeniV=lrdzeni.get(6);
                lwatkowV=lwatkow.get(6);
                czyMnoznikV=czymnoznik.get(6);
                grafikaV=grafika.get(6);
                pamiecV=pamiec.get(6);
                tdpV=tdp.get(6);
                taktowanieV=taktowanie.get(6);
                turboV=turbo.get(6);
                shopCodeV=kodSklepu.get(6);
                table = R.drawable.i5_1_tab;
                webLink="https://www.x-kom.pl/p/702238-procesory-intel-core-i5-intel-core-i5-12400f.html";
                break;

            case 8:
                imges = Arrays.asList(R.drawable.i5_2_1);
                name = names.get(7);
                price = prices.get(7);
                socketV = sockets.get(7);
                architekturaV = architektura.get(7);
                lrdzeniV=lrdzeni.get(7);
                lwatkowV=lwatkow.get(7);
                czyMnoznikV=czymnoznik.get(7);
                grafikaV=grafika.get(7);
                pamiecV=pamiec.get(7);
                tdpV=tdp.get(7);
                taktowanieV=taktowanie.get(7);
                turboV=turbo.get(7);
                shopCodeV=kodSklepu.get(7);
                table = R.drawable.i5_2_tab;
                webLink="https://www.x-kom.pl/p/689598-procesory-intel-core-i5-intel-core-i5-12600k.html";
                break;

            case 9:
                imges = Arrays.asList(R.drawable.i5_3_1);
                name = names.get(8);
                price = prices.get(8);
                socketV = sockets.get(8);
                architekturaV = architektura.get(8);
                lrdzeniV=lrdzeni.get(8);
                lwatkowV=lwatkow.get(8);
                czyMnoznikV=czymnoznik.get(8);
                grafikaV=grafika.get(8);
                pamiecV=pamiec.get(8);
                tdpV=tdp.get(8);
                taktowanieV=taktowanie.get(8);
                turboV=turbo.get(8);
                shopCodeV=kodSklepu.get(8);
                table = R.drawable.i5_3_tab;
                webLink="https://www.x-kom.pl/p/564465-procesory-intel-core-i5-intel-core-i5-10400f.html";
                break;

            case 10:
                imges = Arrays.asList(R.drawable.i3_1_1);
                name = names.get(9);
                price = prices.get(9);
                socketV = sockets.get(9);
                architekturaV = architektura.get(9);
                lrdzeniV=lrdzeni.get(9);
                lwatkowV=lwatkow.get(9);
                czyMnoznikV=czymnoznik.get(9);
                grafikaV=grafika.get(9);
                pamiecV=pamiec.get(9);
                tdpV=tdp.get(9);
                taktowanieV=taktowanie.get(9);
                turboV=turbo.get(9);
                shopCodeV=kodSklepu.get(9);
                table = R.drawable.i3_1_tab;
                webLink="https://www.x-kom.pl/p/596730-procesor-intel-core-i3-intel-core-i3-10100f.html";
                break;

            case 11:
                imges = Arrays.asList(R.drawable.i3_2_1);
                name = names.get(10);
                price = prices.get(10);
                socketV = sockets.get(10);
                architekturaV = architektura.get(10);
                lrdzeniV=lrdzeni.get(10);
                lwatkowV=lwatkow.get(10);
                czyMnoznikV=czymnoznik.get(10);
                grafikaV=grafika.get(10);
                pamiecV=pamiec.get(10);
                tdpV=tdp.get(10);
                taktowanieV=taktowanie.get(10);
                turboV=turbo.get(10);
                shopCodeV=kodSklepu.get(10);
                table = R.drawable.i3_2_tab;
                webLink="https://www.x-kom.pl/p/702241-procesor-intel-core-i3-intel-core-i3-12100.html";
                break;

            case 12:
                imges = Arrays.asList(R.drawable.i3_3_1, R.drawable.i3_3_2);
                name = names.get(11);
                price = prices.get(11);
                socketV = sockets.get(11);
                architekturaV = architektura.get(11);
                lrdzeniV=lrdzeni.get(11);
                lwatkowV=lwatkow.get(11);
                czyMnoznikV=czymnoznik.get(11);
                grafikaV=grafika.get(11);
                pamiecV=pamiec.get(11);
                tdpV=tdp.get(11);
                taktowanieV=taktowanie.get(11);
                turboV=turbo.get(11);
                shopCodeV=kodSklepu.get(11);
                table = R.drawable.i3_3_tab;
                webLink="https://www.x-kom.pl/p/597431-procesor-amd-ryzen-9-amd-ryzen-9-5900x.html";
                break;

            case 13:
                imges = Arrays.asList(R.drawable.r9_1_1);
                name = names.get(12);
                price = prices.get(12);
                socketV = sockets.get(12);
                architekturaV = architektura.get(12);
                lrdzeniV=lrdzeni.get(12);
                lwatkowV=lwatkow.get(12);
                czyMnoznikV=czymnoznik.get(12);
                grafikaV=grafika.get(12);
                pamiecV=pamiec.get(12);
                tdpV=tdp.get(12);
                taktowanieV=taktowanie.get(12);
                turboV=turbo.get(12);
                shopCodeV=kodSklepu.get(12);
                table = R.drawable.r9_1_tab;
                webLink="https://www.x-kom.pl/p/689606-procesor-intel-core-i9-intel-core-i9-12900k.html";
                break;

            case 14:
                imges = Arrays.asList(R.drawable.r9_2_1,R.drawable.r9_2_2,R.drawable.r9_2_3,R.drawable.r9_2_4,R.drawable.r9_2_5,R.drawable.r9_2_6);
                name = names.get(13);
                price = prices.get(13);
                socketV = sockets.get(13);
                architekturaV = architektura.get(13);
                lrdzeniV=lrdzeni.get(13);
                lwatkowV=lwatkow.get(13);
                czyMnoznikV=czymnoznik.get(13);
                grafikaV=grafika.get(13);
                pamiecV=pamiec.get(13);
                tdpV=tdp.get(13);
                taktowanieV=taktowanie.get(13);
                turboV=turbo.get(13);
                shopCodeV=kodSklepu.get(13);
                table = R.drawable.r9_2_tab;
                webLink="https://www.x-kom.pl/p/1072683-procesor-amd-ryzen-9-amd-ryzen-9-7950x.html";
                break;

            case 15:
                imges = Arrays.asList(R.drawable.r9_3_1);
                name = names.get(14);
                price = prices.get(14);
                socketV = sockets.get(14);
                architekturaV = architektura.get(14);
                lrdzeniV=lrdzeni.get(14);
                lwatkowV=lwatkow.get(14);
                czyMnoznikV=czymnoznik.get(14);
                grafikaV=grafika.get(14);
                pamiecV=pamiec.get(14);
                tdpV=tdp.get(14);
                taktowanieV=taktowanie.get(14);
                turboV=turbo.get(14);
                shopCodeV=kodSklepu.get(14);
                table = R.drawable.r9_3_tab;
                webLink="https://www.x-kom.pl/p/1117003-procesor-amd-ryzen-9-amd-ryzen-9-7950x3d.html";
                break;

            case 16:
                imges = Arrays.asList(R.drawable.r7_1_1);
                name = names.get(15);
                price = prices.get(15);
                socketV = sockets.get(15);
                architekturaV = architektura.get(15);
                lrdzeniV=lrdzeni.get(15);
                lwatkowV=lwatkow.get(15);
                czyMnoznikV=czymnoznik.get(15);
                grafikaV=grafika.get(15);
                pamiecV=pamiec.get(15);
                tdpV=tdp.get(15);
                taktowanieV=taktowanie.get(15);
                turboV=turbo.get(15);
                shopCodeV=kodSklepu.get(15);
                table = R.drawable.r7_1_tab;
                webLink="https://www.x-kom.pl/p/735724-procesor-amd-ryzen-7-amd-ryzen-7-5800x3d.html";
                break;

            case 17:
                imges = Arrays.asList(R.drawable.r7_2_1);
                name = names.get(16);
                price = prices.get(16);
                socketV = sockets.get(16);
                architekturaV = architektura.get(16);
                lrdzeniV=lrdzeni.get(16);
                lwatkowV=lwatkow.get(16);
                czyMnoznikV=czymnoznik.get(16);
                grafikaV=grafika.get(16);
                pamiecV=pamiec.get(16);
                tdpV=tdp.get(16);
                taktowanieV=taktowanie.get(16);
                turboV=turbo.get(16);
                shopCodeV=kodSklepu.get(16);
                table = R.drawable.r7_2_tab;
                webLink="https://www.x-kom.pl/p/597430-procesor-amd-ryzen-7-amd-ryzen-7-5800x.html";
                break;

            case 18:
                imges = Arrays.asList(R.drawable.r7_3_1,R.drawable.r7_3_2,R.drawable.r7_3_3,R.drawable.r7_3_4,R.drawable.r7_3_5,R.drawable.r7_3_6);
                name = names.get(17);
                price = prices.get(17);
                socketV = sockets.get(17);
                architekturaV = architektura.get(17);
                lrdzeniV=lrdzeni.get(17);
                lwatkowV=lwatkow.get(17);
                czyMnoznikV=czymnoznik.get(17);
                grafikaV=grafika.get(17);
                pamiecV=pamiec.get(17);
                tdpV=tdp.get(17);
                taktowanieV=taktowanie.get(17);
                turboV=turbo.get(17);
                shopCodeV=kodSklepu.get(17);
                table = R.drawable.r7_3_tab;
                webLink="https://www.x-kom.pl/p/1072717-procesor-amd-ryzen-7-amd-ryzen-7-7700x.html";
                break;

            case 19:
                imges = Arrays.asList(R.drawable.r5_1_1,R.drawable.r5_1_2);
                name = names.get(18);
                price = prices.get(18);
                socketV = sockets.get(18);
                architekturaV = architektura.get(18);
                lrdzeniV=lrdzeni.get(18);
                lwatkowV=lwatkow.get(18);
                czyMnoznikV=czymnoznik.get(18);
                grafikaV=grafika.get(18);
                pamiecV=pamiec.get(18);
                tdpV=tdp.get(18);
                taktowanieV=taktowanie.get(18);
                turboV=turbo.get(18);
                shopCodeV=kodSklepu.get(18);
                table = R.drawable.r5_1_tab;
                webLink="https://www.x-kom.pl/p/735703-procesor-amd-ryzen-5-amd-ryzen-5-5600.html";
                break;

            case 20:
                imges = Arrays.asList(R.drawable.r5_2_1);
                name = names.get(19);
                price = prices.get(19);
                socketV = sockets.get(19);
                architekturaV = architektura.get(19);
                lrdzeniV=lrdzeni.get(19);
                lwatkowV=lwatkow.get(19);
                czyMnoznikV=czymnoznik.get(19);
                grafikaV=grafika.get(19);
                pamiecV=pamiec.get(19);
                tdpV=tdp.get(19);
                taktowanieV=taktowanie.get(19);
                turboV=turbo.get(19);
                shopCodeV=kodSklepu.get(19);
                table = R.drawable.r5_2_tab;
                webLink="https://www.x-kom.pl/p/597427-procesor-amd-ryzen-5-amd-ryzen-5-5600x.html";
                break;

            case 21:
                imges = Arrays.asList(R.drawable.r5_3_1);
                name = names.get(20);
                price = prices.get(20);
                socketV = sockets.get(20);
                architekturaV = architektura.get(20);
                lrdzeniV=lrdzeni.get(20);
                lwatkowV=lwatkow.get(20);
                czyMnoznikV=czymnoznik.get(20);
                grafikaV=grafika.get(20);
                pamiecV=pamiec.get(20);
                tdpV=tdp.get(20);
                taktowanieV=taktowanie.get(20);
                turboV=turbo.get(20);
                shopCodeV=kodSklepu.get(20);
                table = R.drawable.r5_3_tab;
                webLink="https://www.x-kom.pl/p/1048488-procesor-amd-ryzen-5-amd-ryzen-5-3600.html";
                break;

            case 22:
                imges = Arrays.asList(R.drawable.r3_1_1);
                name = names.get(21);
                price = prices.get(21);
                socketV = sockets.get(21);
                architekturaV = architektura.get(21);
                lrdzeniV=lrdzeni.get(21);
                lwatkowV=lwatkow.get(21);
                czyMnoznikV=czymnoznik.get(21);
                grafikaV=grafika.get(21);
                pamiecV=pamiec.get(21);
                tdpV=tdp.get(21);
                taktowanieV=taktowanie.get(21);
                turboV=turbo.get(21);
                shopCodeV=kodSklepu.get(21);
                table = R.drawable.r3_1_tab;
                webLink="https://www.x-kom.pl/p/500097-procesor-amd-ryzen-3-amd-ryzen-3-3200g.html";
                break;

            case 23:
                imges = Arrays.asList(R.drawable.r3_2_1,R.drawable.r3_2_2);
                name = names.get(22);
                price = prices.get(22);
                socketV = sockets.get(22);
                architekturaV = architektura.get(22);
                lrdzeniV=lrdzeni.get(22);
                lwatkowV=lwatkow.get(22);
                czyMnoznikV=czymnoznik.get(22);
                grafikaV=grafika.get(22);
                pamiecV=pamiec.get(22);
                tdpV=tdp.get(22);
                taktowanieV=taktowanie.get(22);
                turboV=turbo.get(22);
                shopCodeV=kodSklepu.get(22);
                table = R.drawable.r3_2_tab;
                webLink="https://www.x-kom.pl/p/735711-procesor-amd-ryzen-3-amd-ryzen-3-4100.html";
                break;

            case 24:
                imges = Arrays.asList(R.drawable.r3_3_1, R.drawable.r3_3_2);
                name = names.get(23);
                price = prices.get(23);
                socketV = sockets.get(23);
                architekturaV = architektura.get(23);
                lrdzeniV=lrdzeni.get(23);
                lwatkowV=lwatkow.get(23);
                czyMnoznikV=czymnoznik.get(23);
                grafikaV=grafika.get(23);
                pamiecV=pamiec.get(23);
                tdpV=tdp.get(23);
                taktowanieV=taktowanie.get(23);
                turboV=turbo.get(23);
                shopCodeV=kodSklepu.get(23);
                table = R.drawable.r3_3_tab;
                webLink="https://www.x-kom.pl/p/682220-procesor-amd-ryzen-3-amd-ryzen-3-1200-oem.html";
                break;


            default:
                break;
        }
        return new DataCreate(imges,name,price,socketV,architekturaV,lrdzeniV,lwatkowV,czyMnoznikV,pamiecV,grafikaV,tdpV,taktowanieV,turboV,shopCodeV,table,webLink);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        BT1= findViewById(R.id.BT1);
        BT3= findViewById(R.id.BT3);
        TVnazwa=findViewById(R.id.TVNazwa);
        IMGV1=findViewById(R.id.IMGV1);
        PRICE=findViewById(R.id.PIRCE);

        TVSocket=findViewById(R.id.TVSocket);
        TVSocket2=findViewById(R.id.TVSocket2);

        TVArchitecture=findViewById(R.id.TVArchitecture);
        TVArchitecture2=findViewById(R.id.TVArchitecture2);

        TVRdzenie=findViewById(R.id.TVRdzenie);
        TVRdzenie2=findViewById(R.id.TVRdzenie2);

        TVWatki=findViewById(R.id.TVWatki);
        TVWatki2=findViewById(R.id.TVWatki2);

        TVMnoznik=findViewById(R.id.TVMnoznik);
        TVMnoznik2=findViewById(R.id.TVMnoznik2);

        TVPamiec=findViewById(R.id.TVPamiec);
        TVPamiec2=findViewById(R.id.TVPamiec2);

        TVGrafika=findViewById(R.id.TVGrafika);
        TVGrafika2=findViewById(R.id.TVGrafika2);

        TVTdp=findViewById(R.id.TVTdp);
        TVTdp2=findViewById(R.id.TVTdp2);


        TVTaktowanie=findViewById(R.id.TVTaktowanie);
        TVTaktowanie2=findViewById(R.id.TVTaktowanie2);

        TVTurbo=findViewById(R.id.TVTurbo);
        TVTurbo2=findViewById(R.id.TVTurbo2);

        TVKodsklepu=findViewById(R.id.TVKodsklepu);
        TVKodsklepu2=findViewById(R.id.TVKodsklepu2);







        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        Bundle extras = getIntent().getExtras();
        try (InputStream inputStream = getResources().openRawResource(R.raw.data_app);
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                // Extract values from the columns
                String name = data[0].replaceAll("^\"|\"$", "").replace("\\n", "\n");
                double price = Double.parseDouble(data[1]);
                int socketV = Integer.parseInt(data[2]);
                int architekturaV = Integer.parseInt(data[3]);
                int lrdzeniV = Integer.parseInt(data[4]);
                int lwatkowV = Integer.parseInt(data[5]);
                String czymnoznikV = data[6].replaceAll("^\"|\"$", "");
                int pamiecV = Integer.parseInt(data[7]);
                String grafikaV = data[8].replaceAll("^\"|\"$", "");
                int tdpV = Integer.parseInt(data[9]);
                double taktowanieV = Double.parseDouble(data[10]);
                double turboV = Double.parseDouble(data[11]);
                int kodSklepuV = Integer.parseInt(data[12]);
                // Store values in the corresponding lists

                names.add(name);
                prices.add(price);
                sockets.add(socketV);
                architektura.add(architekturaV);
                lrdzeni.add(lrdzeniV);
                lwatkow.add(lwatkowV);
                czymnoznik.add(czymnoznikV);
                pamiec.add(pamiecV);
                grafika.add(grafikaV);
                tdp.add(tdpV);
                taktowanie.add(taktowanieV);
                turbo.add(turboV);
                kodSklepu.add(kodSklepuV);
                // Add additional lines to store values in other lists for different columns
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (extras != null && extras.containsKey("buttonIndex")) {
            int buttonIndex = extras.getInt("buttonIndex");
            DataCreate data = getImageListForButton(buttonIndex);
            ViewPager2 viewPager2 = findViewById(R.id.VP0);

            List<Integer> imageList = data.imges;
            ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(imageList);
            viewPager2.setAdapter(imagePagerAdapter);

            TVnazwa.setText(data.name);
            TVnazwa.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            IMGV1.setImageResource(data.table);
            PRICE.setText(decimalFormat.format(data.price)+" zł");

            TVSocket.setText("Socket  ");
            if (data.socket==3||data.socket==4||data.socket==5){
                TVSocket2.setText(IntegerToStringDictionary.getStringValue2(data.socket));
            }
            else{
                TVSocket2.setText(String.valueOf(data.socket));
            }

            TVSocket.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVSocket2.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVArchitecture.setText("Architektura  ");
            TVArchitecture2.setText(IntegerToStringDictionary.getStringValue(data.architecture));
            TVRdzenie.setText("Liczba rdzeni  ");
            TVRdzenie2.setText(String.valueOf(data.noCores));
            TVRdzenie.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVRdzenie2.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVWatki.setText("Liczba wątków  ");
            TVWatki2.setText(String.valueOf(data.noThreads));
            TVMnoznik.setText("Odblokowany mnożnik  ");
            TVMnoznik2.setText(data.isTurbo);
            TVMnoznik.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVMnoznik2.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVPamiec.setText("Pamięć podręczna  ");
            TVPamiec2.setText(String.valueOf(data.memory)+" MB");
            TVGrafika.setText("Układ graficzny  ");
            TVGrafika2.setText(data.graphics);
            TVGrafika.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVGrafika2.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVTdp.setText("Pobór mocy (TDP)  ");
            TVTdp2.setText(String.valueOf(data.tdp)+" W");
            TVTaktowanie.setText("Taktowanie rdzenia (bazowe)  ");
            TVTaktowanie2.setText(String.valueOf(data.baseSpeed)+" Ghz");
            TVTaktowanie.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVTaktowanie2.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVTurbo.setText("Taktowanie rdzenia (turbo)  ");
            TVTurbo2.setText(String.valueOf(data.turboSpeed)+" Ghz");
            TVKodsklepu.setText("Kod sklepu  ");
            TVKodsklepu2.setText(String.valueOf(data.shopCode));
            TVKodsklepu.setBackgroundColor(Color.parseColor("#f2f2f2"));
            TVKodsklepu2.setBackgroundColor(Color.parseColor("#f2f2f2"));


            BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =data.webLink;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        }
    }
}