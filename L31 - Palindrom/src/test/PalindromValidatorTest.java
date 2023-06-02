package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrom.PalindromValidator;
import palindrom.PalindromValidatorI;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromValidatorTest {
    ArrayList<String> palindromer;
    ArrayList<Integer> palindromprimtal;

    @BeforeEach
    void setUp() throws Exception {
        palindromer = new ArrayList<String>();

        File palindromTxt = new File("/Users/rasmusjerlov/Library/CloudStorage/OneDrive-EFIF/Datamatiker/1. semester/Programmering 1/IntelliJ Projects/Programmering 1/L31 - Palindrom/src/test/test-palindrom.txt");
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine()) {
            String data = palindromScanner.nextLine();
            palindromer.add(data);
        }
        palindromScanner.close();
        palindromprimtal = new ArrayList<Integer>();

        File palindromTalTxt = new File("/Users/rasmusjerlov/Library/CloudStorage/OneDrive-EFIF/Datamatiker/1. semester/Programmering 1/IntelliJ Projects/Programmering 1/L31 - Palindrom/src/test/test-palindrom-primtal.txt");
        Scanner palindromTalScanner = new Scanner(palindromTalTxt);
        while (palindromTalScanner.hasNextLine()) {
            String talData = palindromTalScanner.nextLine().toString();
            palindromprimtal.add(Integer.parseInt(talData));
        }
        palindromTalScanner.close();

//        palindromprimtal = new ArrayList<Integer>();
//
//        url = getClass().getResource("test-palindrom-primtal.txt");
//        palindromTxt = new File(url.getPath());
//        palindromScanner = new Scanner(palindromTxt);
//        while (palindromScanner.hasNextLine()) {
//            String data = palindromScanner.nextLine();
//            palindromprimtal.add(Integer.parseInt(data));
//        }
//        palindromScanner.close();
    }

    @Test
    void test() {
        PalindromValidatorI palindromValidator = new PalindromValidator();
        for (String palindrom : palindromer) {
            assertTrue(palindromValidator.erGyldigtPalindrom(palindrom));
        }
        PalindromValidatorI palindromTalValidator = new PalindromValidator();
        for (Integer palindromTal : palindromprimtal) {
            assertTrue(palindromTalValidator.erGyldigtPalindromPrimtal(palindromTal));
        }
    }

}
