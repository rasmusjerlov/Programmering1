package palindrom;

public class PalindromValidator implements PalindromValidatorI {


    @Override
    public boolean erGyldigtPalindrom(String tekst) {
        String reverse = "";
        char ch;
        System.out.println("Original word: " + tekst);

        for (int i = 0; i < tekst.length(); i++) {
            ch = tekst.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("Reverse word: " + reverse);
        tekst = tekst.replaceAll("[^a-zA-Z0-9]", "");
        reverse = reverse.replaceAll("[^a-zA-Z0-9]", "");
        if (reverse.equalsIgnoreCase(tekst)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean erGyldigtPalindromPrimtal(int tal) {
        String strTal = String.valueOf(tal);
        String revTal = "";
        char ch;
        for (int i = 0; i < strTal.length(); i++) {
            ch = strTal.charAt(i);
            revTal = ch + revTal;
        }
        int tal2 = Integer.parseInt(revTal);
        if (tal == tal2) {
            return true;
        } else {
            return false;
        }
    }
}
