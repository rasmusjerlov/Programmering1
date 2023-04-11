import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args) {
        //OPGAVE A
        System.out.println("OPGAVE A");
        int[] a = new int[10];
        a.toString();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // OPGAVE B
        System.out.println("OPGAVE B");
        int[] b = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //OPGAVE C
        System.out.println("OPGAVE C");
        int[] c = new int[10];
        int n = 0;
        for (int i = 0; i < c.length; i++) {
            System.out.print(n + " ");
            n += 1;
        }
        System.out.println();
        //OPGAVE D
        System.out.println("OPGAVE D");
        int[] d = new int[10];
        int nD = 2;
        for (int i = 0; i < d.length; i++) {
            System.out.print(nD + " ");
            nD += 2;

        }
        System.out.println();
        //OPGAVE E
        System.out.println("OPGAVE E");
        int[] e = new int[10];
        int sum = 0;
        int unEven = 1;
        for (int i = 0; i < e.length; i++) {
            sum = sum + unEven;
            System.out.print(sum + " ");
            unEven = unEven + 2;
        }
        System.out.println();
        //OPGAVE E.2
        System.out.println("OPGAVE E.2");
        int[] e2 = new int [10];
        for (int i = 0; i < e.length; i++) {
            e2[i] = (i + 1) * (i + 1);
            System.out.print(e2[i] + " ");
        }

        System.out.println();
        //OPGAVE F
        System.out.println("Opgave F");
        int[] f = new int [10];
        for (int i = 0; i < f.length; i++) {
            if (i % 2 == 0) {
                System.out.print(f[i] + " ");
            } else
                System.out.print("1 ");

        }
        System.out.println();
        //OPGAVE G
        System.out.println("Opgave G");
        int[] g = new int [10];
        int nG = 0;
        for (int i = 0; i < g.length; i++) {
            System.out.print(nG + " ");
            nG ++;
            if (nG == 5) {
                nG = 0;
            }

        }
        System.out.println();
        //OPGAVE H
        System.out.println("OPGAVE H");
        int[] h = new int [10];
        for (int i = 0; i < h.length; i++) {
            if (i % 2 == 0) {
                h[i] = i * 2;
            } else {
                h[i] = i * 2 + 1;
            }
            System.out.print(h[i] + " ");
        }

        }
    }


