package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j", "k","l","m","n","o","p","r","s","t","u","f","h","c", "ch","sh","shh","'","ju","ja"};

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = StringUtils.capitalize(tokens[i]);
        }
        return StringUtils.join(tokens, ' ');
    }

    public static String translit(String arg) {
        String str = arg.toLowerCase();
        StringBuilder str_builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int index = StringUtils.indexOf(ukrAlphabet, str.charAt(i));
            if (index == -1) {
                str_builder.append(str.charAt(i));
            } else {
                str_builder.append(translitRepl[index]);
            }
        }

        return str_builder.toString();
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }
}
