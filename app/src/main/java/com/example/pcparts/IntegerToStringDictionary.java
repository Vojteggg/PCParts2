package com.example.pcparts;
import java.util.HashMap;
import java.util.Map;

public class IntegerToStringDictionary {
    private static final Map<Integer, String> dictionary = new HashMap<>();
    private static final Map<Integer, String> dictionary2 = new HashMap<>();

    static {
        // Add the integer-string mappings to the dictionary
        dictionary.put(10, "Comet Lake (10 Generacja)");
        dictionary.put(11, "Rocket Lake (11 Generacja)");
        dictionary.put(12, "Alder Lake (12 Generacja)");
        dictionary.put(13, "Raptor Lake (13 Generacja)");
        dictionary.put(3, "Zen 3");
        dictionary.put(4, "Zen 4");
        dictionary2.put(3, "AM3");
        dictionary2.put(4, "AM4");
        dictionary2.put(5, "AM5");
        // Add more mappings as needed
    }

    public static String getStringValue(int number) {
        // Retrieve the string value from the dictionary based on the input number
        return dictionary.getOrDefault(number, "Nieznana");
    }
    public static String getStringValue2(int number) {
        // Retrieve the string value from the dictionary based on the input number
        return dictionary2.getOrDefault(number, "Nieznana");
    }
}
