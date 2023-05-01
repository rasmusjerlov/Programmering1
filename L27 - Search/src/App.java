import java.util.ArrayList;

public class App {
    private static int[] exercise1 = {0, 1, 2, 3, 4, 2, 6, 7, 10, 12, 11};
    private static int[] exercise2 = {7, 56, 34, 3, 7, 14, 13, 4};
    private static int[] exercise3 = {7, 9, 13, 7, 9, 13};
    private static int[] exercise3x1 = {7, 9, 13, 13, 9, 7};
    private static int[] exercise3x2 = {1, 3, 5, 5, 5, 3, 7, 9, 3};
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static ArrayList<Player> players = new ArrayList<>();
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>(8);
        Player p1 = new Player("Rasmus", 190, 90, 23);
        Player p2 = new Player("Sebastian", 185, 92, 19);
        Player p3 = new Player("Mikkel", 165, 84, 4);
        Player p4 = new Player("Emil", 172, 73, 6);
        Player p5 = new Player("Anders", 177, 80, 2);
        Player p6 = new Player("Esben", 183, 60, 18);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        findPlayerLinear(players, 4);
        players = new ArrayList<>();
        players.add(p5);
        players.add(p3);
        players.add(p4);
        players.add(p6);
        players.add(p2);
        players.add(p1);
        findPlayerBinary(players, 2);
        System.out.println(doesUnevenExist(exercise1));
        System.out.println(firstInInterval(exercise2));
        System.out.println(twoSame(exercise3));
        System.out.println(twoSame(exercise3x1));
        System.out.println(twoSame2(exercise3x2, 3));
        list.add("Rasmus");
        list.add("Emil");
        list.add("Klark");
        list.add("Steffen");
        list.add("Anders");
        list.add("Anders");
        list.add("Emil");
        list.add("Klark");
        list.add("Rasmus");
        System.out.println(findAllIndices(list, "Rasmus"));
        System.out.println(findAllIndices(list, "Klark"));
        System.out.println(repeatedChars("abcefdgiihjykssss", 3));
    }

    public static Player findPlayerLinear(ArrayList<Player> players, int score) {
        Player player = null;
        int i = 0;
        while (player == null && i < players.size()) {
            Player p = players.get(i);
            if (p.getScoredGoals() == score) {
                player = p;
            } else
                i++;
        }
        System.out.println(player);
        return player;
    }

    public static Player findPlayerBinary(ArrayList<Player> players, int score) {
        Player player = null;
        int left = 0;
        int right = players.size() - 1;
        while (player == null && left <= right) {
            int middle = (left + right) / 2;
            Player p = players.get(middle);
            if (p.getScoredGoals() == score) {
                player = p;
            } else if (p.getScoredGoals() > 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        System.out.println(player);
        return player;
    }

    //EXERCISE 1
    public static boolean doesUnevenExist(int[] numbers) {
        boolean hasUneven = false;
        int i = 0;
        while (!hasUneven && i < numbers.length) {
            if (numbers[i] % 2 == 1) {
                hasUneven = true;
                return hasUneven;
            } else {
                hasUneven = false;
                i++;
            }
        }
        return hasUneven;
    }


    //EXERCISE 2
    public static int firstInInterval(int[] numbers) {
        int firstInt = -1;
        int i = 0;
        while (firstInt == -1 && i < numbers.length) {
            int k = numbers[i];
            if (k >= 10 && k <= 15) {
                i = k;
            } else {
                i++;
            }
        }
        return i;
    }

    //EXERCISE 3
    public static boolean twoSame(int[] numbers) {
        boolean twoSame = false;
        int i = 0;
        while (twoSame == false && i < numbers.length - 1) {
            int k = numbers[i];
            int k1 = numbers[i + 1];
            if (k == k1) {
                twoSame = true;
            } else {
                i++;
            }
        }
        return twoSame;
    }

    //EXERCISE 3.1
    public static boolean twoSame2(int[] numbers, int n) {
        boolean twoSame = false;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int k = numbers[i];
            for (int j = i; j <= n; j++) {
                int k1 = numbers[j + 1];
                if (k1 == k) {
                    count++;
                }
            }
        }
        if (count == n) {
            twoSame = true;
        }
        return twoSame;
    }

    //EXERCISE 4
    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (target.equals(list.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static boolean repeatedChars(String s, int k) {
        boolean isFound = false;
        int i = 0;
        int count = 0;
        while (isFound == false && i < s.length()) {
            char kand = s.charAt(i);
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (kand == s.charAt(j)) {
                    count++;
                }
            }
            i++;
        }
        if (count == k) {
            isFound = true;
        }

        return isFound;
    }
}
