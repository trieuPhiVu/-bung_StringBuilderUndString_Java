public class StringAufgabe {
    public static String delimitedString(String s, char start, char end) {
        String Start = String.valueOf(start);
        String End = String.valueOf(end);
        try {
            if ((s.contains(Start)) && (s.contains(End))) {
                return s.substring(s.indexOf(Start), s.indexOf(End) + 1);
            } else {
                throw new IllegalArgumentException("Keine gültige Eingabe");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    public static String encode(String text) {
        if (text == null) {
            return null;
        }
    
        text = text.toLowerCase(); // Umwandeln in Kleinbuchstaben
    
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'ä') {
                    encodedText.append("ae");
                } else if (c == 'ß') {
                    encodedText.append("ss");
                } else if (c == 'ü') {
                    encodedText.append("ue");
                } else if( c == 'ö') {
                    encodedText.append("oe");
                } else {
                    int position = c - 'a' + 1;
                    encodedText.append(position);
                }
            }
        }
        return encodedText.toString();
    }
}
