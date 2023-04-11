import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> ints1 = new ArrayList<Integer>(List.of(1, 4, 2, 3, 7, 8, 9));
        ArrayList<Integer> ints2 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> ints3 = new ArrayList<Integer>(List.of(1, 1, 2, 3, 4, 5, 5, 6));
        System.out.println(ints);
        System.out.println(switchFirstAndLast(ints));
        System.out.println(replaceAllZeroes(ints));
        System.out.println(secondHighest(ints));
        System.out.println(isSorted(ints2));
        System.out.println(isSorted(ints1));
        System.out.println(ints2);
        System.out.println(shiftOne(ints2));
        System.out.print(ints + " ");
        System.out.println(hasDoublets(ints));
    }

    public static ArrayList<Integer> switchFirstAndLast (ArrayList<Integer> ints) {
        int temp;
        int temp2;
        temp = ints.get(0);
        temp2 = ints.get(ints.size()-1);
        ints.set(0, temp2);
        ints.set(ints.size()-1, temp);
        return ints;
    }
    public static ArrayList<Integer> replaceAllZeroes (ArrayList<Integer> ints) {
        for (int i = 0; i < ints.size()-1; i++) {
            if (ints.get(i) % 2 == 0) {
                ints.set(i, 0);
            }
        }
        return ints;
    }
    public static int secondHighest (ArrayList<Integer> ints) {
        Collections.sort(ints);
        return ints.get(7);
    }
    public static boolean isSorted (ArrayList<Integer> ints) {
        boolean sorted = false;
        for (int i = 0; i < ints.size()-1; i++) {
            if (ints.get(i) <= ints.get(i + 1)) {
                sorted = true;
            } else {
                return false;
            }
        }
        return sorted;
    }
    public static ArrayList<Integer> shiftOne (ArrayList<Integer> ints) {
        int temp;
        for (int i = 0; i < ints.size()-1; i++) {
            temp = ints.get(i);
            ints.set(i, temp);
        }
        int first = ints.get(ints.size() - 1);
        ints.add(0, first);
        ints.remove(ints.size()-1);
        return ints;
    }
    public static boolean hasDoublets (ArrayList<Integer> ints) {
        for (int i = 0; i < ints.size(); i++) {
            for (int j = 0; j < ints.size(); j++) {
                if(ints.get(i) == ints.get(j)) {
                    return true;
                }
                }
            }
        return false;
        }
    }
