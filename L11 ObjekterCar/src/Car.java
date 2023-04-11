import com.sun.prism.paint.Color;

import java.util.HashMap;

public class Car {
    private int doors;
    private Color color;
    private int hjul;

    public Car(Color color, int doors, int hjul) {
        this.color = color;
        this.doors = doors;
        this.hjul = hjul;

    }

    public Car() {
        color = Color.RED;
        hjul = 3;
        doors = 1;
    }

    public static String getColorName(Color color) {
        HashMap<Color, String> colorMap = new HashMap<>();
        colorMap.put(Color.RED, "red");
        colorMap.put(Color.GREEN, "green");
        colorMap.put(Color.BLUE, "blue");
        colorMap.put(Color.BLACK, "black");
        colorMap.put(Color.WHITE, "white");

        if (colorMap.containsKey(color)) {
            return colorMap.get(color);
        } else {
            return color.toString();
        }
    }

    @Override
    public String toString() {
        return getColorName(color) + " car with " + doors + " and " + hjul + " wheels";
    }

}
