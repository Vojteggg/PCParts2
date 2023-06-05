package com.example.pcparts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

        String csvFile = "raw/data_app.csv";
        String line = "";
        String csvSplitBy = ",";

        List<String> names = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        List<Integer> socket = new ArrayList<>();
        List<Integer> architektura = new ArrayList<>();
        List<Integer> lrdzeni = new ArrayList<>();
        List<Integer> lwatkow = new ArrayList<>();
        List<String> czymnoznik = new ArrayList<>();
        List<Integer> pamiec = new ArrayList<>();
        List<Integer> tdp = new ArrayList<>();
        List<Double> taktowanie = new ArrayList<>();
        List<Double> turbo = new ArrayList<>();
        List<String> nazwaZdjecia = new ArrayList<>();


        // Add additional lists for other columns as needed



    ImageButton IB1;
    ImageButton IB2;
    ImageButton IB3;
    ImageButton IB4;
    ImageButton IB5;
    ImageButton IB6;
    ImageButton IB7;
    ImageButton IB8;
    ImageButton IB9;
    ImageButton IB10;
    ImageButton IB11;
    ImageButton IB12;
    ImageButton IB13;
    ImageButton IB14;
    ImageButton IB15;
    ImageButton IB16;
    ImageButton IB17;
    ImageButton IB18;
    ImageButton IB19;
    ImageButton IB20;
    ImageButton IB21;
    ImageButton IB22;
    ImageButton IB23;
    ImageButton IB24;


    TextView TV1;
    TextView TV2;
    TextView TV3;
    TextView TV4;
    TextView TV5;
    TextView TV6;
    TextView TV7;
    TextView TV8;
    TextView TV9;
    TextView TV10;
    TextView TV11;
    TextView TV12;
    TextView TV13;
    TextView TV14;
    TextView TV15;
    TextView TV16;
    TextView TV17;
    TextView TV18;
    TextView TV19;
    TextView TV20;
    TextView TV21;
    TextView TV22;
    TextView TV23;
    TextView TV24;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sortingSpinner = findViewById(R.id.sortingSpinner);
        sortingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = parent.getItemAtPosition(position).toString();
                // Call a method to sort the items based on the selected option
                sortItems(selectedOption);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle the case when nothing is selected
            }
        });


        IB1 = findViewById(R.id.IB1);
        IB2 = findViewById(R.id.IB2);
        IB3 = findViewById(R.id.IB3);
        IB4 = findViewById(R.id.IB4);
        IB5 = findViewById(R.id.IB5);
        IB6 = findViewById(R.id.IB6);
        IB7 = findViewById(R.id.IB7);
        IB8 = findViewById(R.id.IB8);
        IB9 = findViewById(R.id.IB9);
        IB10 = findViewById(R.id.IB10);
        IB11 = findViewById(R.id.IB11);
        IB12 = findViewById(R.id.IB12);
        IB13 = findViewById(R.id.IB13);
        IB14 = findViewById(R.id.IB14);
        IB15 = findViewById(R.id.IB15);
        IB16 = findViewById(R.id.IB16);
        IB17 = findViewById(R.id.IB17);
        IB18 = findViewById(R.id.IB18);
        IB19 = findViewById(R.id.IB19);
        IB20 = findViewById(R.id.IB20);
        IB21 = findViewById(R.id.IB21);
        IB22 = findViewById(R.id.IB22);
        IB23 = findViewById(R.id.IB23);
        IB24 = findViewById(R.id.IB24);

        TV1 = findViewById(R.id.TV1);
        TV2 = findViewById(R.id.TV2);
        TV3 = findViewById(R.id.TV3);
        TV4 = findViewById(R.id.TV4);
        TV5 = findViewById(R.id.TV5);
        TV6 = findViewById(R.id.TV6);
        TV7 = findViewById(R.id.TV7);
        TV8 = findViewById(R.id.TV8);
        TV9 = findViewById(R.id.TV9);
        TV10 = findViewById(R.id.TV10);
        TV11 = findViewById(R.id.TV11);
        TV12 = findViewById(R.id.TV12);
        TV13 = findViewById(R.id.TV13);
        TV14 = findViewById(R.id.TV14);
        TV15 = findViewById(R.id.TV15);
        TV16 = findViewById(R.id.TV16);
        TV17 = findViewById(R.id.TV17);
        TV18 = findViewById(R.id.TV18);
        TV19 = findViewById(R.id.TV19);
        TV20 = findViewById(R.id.TV20);
        TV21 = findViewById(R.id.TV21);
        TV22 = findViewById(R.id.TV22);
        TV23 = findViewById(R.id.TV23);
        TV24 = findViewById(R.id.TV24);

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
                int tdpV = Integer.parseInt(data[9]);
                double taktowanieV = Double.parseDouble(data[10]);
                double turboV = Double.parseDouble(data[11]);
                String nazwaZdj = data[13].replaceAll("^\"|\"$", "");
                // Store values in the corresponding lists

                names.add(name);
                prices.add(price);
                socket.add(socketV);
                architektura.add(architekturaV);
                lrdzeni.add(lrdzeniV);
                lwatkow.add(lwatkowV);
                czymnoznik.add(czymnoznikV);
                pamiec.add(pamiecV);
                tdp.add(tdpV);
                taktowanie.add(taktowanieV);
                turbo.add(turboV);
                nazwaZdjecia.add(nazwaZdj);
                // Add additional lines to store values in other lists for different columns
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



        for (int i = 1; i <= 24; i++) {
            int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
            int imageButtonId = getResources().getIdentifier("IB"+i,"id", getPackageName());
            TextView textView = findViewById(textViewId);
            ImageButton imageButton = findViewById(imageButtonId);
            textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
            textView.setText(names.get(i - 1));
            String imageName = nazwaZdjecia.get(i-1);
            int imageResourceId = getResources().getIdentifier(imageName,"drawable",getPackageName());
            imageButton.setImageResource(imageResourceId);

        }




        for (int i = 1; i <= 24; i++) {
            int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
            ImageButton imageButton = findViewById(buttonId);
            int textId = getResources().getIdentifier("TV"+i,"id",getPackageName());
            TextView textView = findViewById(textId);
            final int buttonIndex = i;
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("buttonIndex", buttonIndex);
                    startActivity(intent);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("buttonIndex", buttonIndex);
                    startActivity(intent);
                }
            });
        }
    }
    private void sortItems(String selectedOption) {
        switch (selectedOption) {
            case "Liczba rdzeni rosnąco":
                // Sort the items based on the prices list
                List<Integer> indexes = new ArrayList<>();
                for (int i = 0; i < lrdzeni.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(lrdzeni.get(index1), lrdzeni.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;

            case "Cena rosnąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < prices.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(prices.get(index1), prices.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Cena malejąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < prices.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(prices.get(index2), prices.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Liczba rdzeni malejąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < lrdzeni.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(lrdzeni.get(index2), lrdzeni.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Nazwa A-Z":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < names.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> names.get(index1).compareTo(names.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Nazwa Z-A":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < names.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> names.get(index2).compareTo(names.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Liczba wątków rosnąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < lwatkow.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(lwatkow.get(index1), lwatkow.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Liczba wątków malejąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < lwatkow.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(lwatkow.get(index2), lwatkow.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Pamięć podręczna rosnąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < pamiec.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(pamiec.get(index1), pamiec.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Pamięć podręczna malejąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < lwatkow.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(pamiec.get(index2), pamiec.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Pobór mocy (TDP) rosnąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < tdp.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(tdp.get(index1), tdp.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Pobór mocy (TDP) malejąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < tdp.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(tdp.get(index2), tdp.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Taktowanie rosnąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < taktowanie.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(taktowanie.get(index1), taktowanie.get(index2)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            case "Taktowanie malejąco":
                // Sort the items based on the prices list
                indexes = new ArrayList<>();
                for (int i = 0; i < taktowanie.size(); i++) {
                    indexes.add(i);
                }
                Collections.sort(indexes, (index1, index2) -> Double.compare(taktowanie.get(index2), taktowanie.get(index1)));

                // Update the TextViews with the sorted names and button indexes
                for (int i = 1; i <= 24; i++) {
                    int textViewId = getResources().getIdentifier("TV" + i, "id", getPackageName());
                    TextView textView = findViewById(textViewId);
                    textView.setBackgroundColor(Color.parseColor("#f2f2f2"));
                    int index = indexes.get(i-1);
                    textView.setText(names.get(index));

                    int buttonId = getResources().getIdentifier("IB" + i, "id", getPackageName());
                    ImageButton imageButton = findViewById(buttonId);
                    String imageName = nazwaZdjecia.get(index);
                    int imageResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                    imageButton.setImageResource(imageResourceId);

                    final int buttonIndex = index+1; // Store the index in a final variable

                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });

                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            intent.putExtra("buttonIndex", buttonIndex); // Use buttonIndex instead of index
                            startActivity(intent);
                        }
                    });
                }
                break;
            // Add cases for other sorting options if needed
            default:
                // Handle the case when nothing is selected
                break;
        }

    }


}
