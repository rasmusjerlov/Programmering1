package gui;

import javafx.application.Application;
import model.YatzyDice;

import java.util.Arrays;

public class YatzyApp {

    public static void main(String[] args) {
        Application.launch(YatzyGui.class);
        YatzyDice test = new YatzyDice();
        int[] values = test.getValues();
        System.out.println("Values: " + Arrays.toString(values));
        test.onePairPoints();
        test.twoPairPoints();
        test.threeSamePoints();
        test.fourSamePoints();
        test.chancePoints();
        test.yatzyPoints();

    }
}
