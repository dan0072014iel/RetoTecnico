package co.com.sanangel.Utils;

import java.text.Normalizer;

public class NormalizeString {
    public static String normalizeString(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();
    }


}
