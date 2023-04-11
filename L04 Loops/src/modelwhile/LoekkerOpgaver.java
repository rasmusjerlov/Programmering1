package modelwhile;

public class LoekkerOpgaver {

    public static void main(String[] args) {
//        Kald af metoder der afprøver opgave 1

        System.out.println(summerEven(100));
        System.out.println(summerSquare(10));
        System.out.println(summerOdd(3, 19));
        allPowers(20);
        System.out.println("The sum of odd numbers in 32677 is: " + sumOddDigits(32677));

    }

    // Metoden returnerer summen af alle lige tal mellem 2 og n
    public static int summerEven(int n) {
        // Opgave 1.a
        int i = 1;
        int sum = 0;
        while (i < n) {
            i++;
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //    // Metoden returnerer summen af alle kvdrater mellem 1*1 og n*n
    public static int summerSquare(int n) {
        //  Opgave 1.b
        int i = 0;
        int sumSquare = 0;
        while (i <= n) {
            sumSquare = sumSquare + i * i;
            i++;
        }
        return sumSquare;
    }
// Opgave 6.2+
public static int sumOddDigits(int n) {
    int sum = 0;
    int digit =  n;

    while (digit != 0) {
        if(digit % 10 % 2 != 0) {
            sum += digit % 10;
        }
        digit /= 10;
    }
    return sum;

}


//        while ( number > 0) {
//            digit = digit + number % 10;
//            if (digit % 2 == 1) {
//                sum = sum + digit;
//            }
//            number = number / 10;
//
//        }

    //
//    // Metoden returnerer summen af alle ulige tal mellem a og b
    public static int summerOdd(int a, int b) {
        //  Opgave 1.c
        int i = a;
        int sumOdd = 0;
        while (i >= a && i <= b) {
            if (i % 2 == 1) {
                sumOdd = sumOdd + i;
            }
            i++;
        }
        return sumOdd;
    }

    //
//    // Metoden udskriver 2 potenser fra  f
    public static void allPowers(int n) {
        //  Opgave 1.d
        int i = 0;
        int sumPow = 2;
        while (i < n) {
            System.out.println(sumPow);
            sumPow = sumPow * 2;
            i++;
        }
    }
//
//
}