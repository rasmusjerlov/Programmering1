package ex3student;
import java.util.Scanner;

public class Stars {
        public static void main(String[] args) {
            Scanner rows = new Scanner (System.in);
            System.out.println("Insert number of rows");
            int n = rows.nextInt();
            exA(n);
            exB(n);
            exC(n);
        }

        public static void exA(int rowCount) {
            System.out.println();
            System.out.println("Exercise a");

            for (int row = 1; row <= rowCount; row++) {

                // print row number
                System.out.printf("%2d: ", row);

                // print stars
                int starCount = rowCount + 1 - row;
                for (int i = 1; i <= starCount; i++) {
                    System.out.print('*');
                }

                // print dashes
                int dashCount = rowCount - starCount;
                for (int i = 1; i <= dashCount; i++) {
                    System.out.print(' ');
                }
                // new line
                System.out.println();
            }
            }
        public static void exB(int rowCount) {
            System.out.println();
            System.out.println("Exercise b");

            for (int row = 1; row <= rowCount; row++) {

                // print row number
                System.out.printf("%2d: ", row);

                // print dashes
                int dashCount = rowCount + 1 - row;
                for (int i = 1; i < dashCount; i++) {
                    System.out.print(' ');

                }// print stars
                int starCount = row;
                for (int i = 1; i <= starCount; i++) {
                    System.out.print('*');
                }

                // new line
                System.out.println();
            }

            }
        public static void exC(int rowCount) {
            System.out.println();
            System.out.println("Exercise c");
            for (int row = 1; row <= rowCount; row++) {

                // print row number
                System.out.printf("%2d: ", row);

                // print dashes
                int starCount1 = rowCount + 1 - row;
                int dashCount = rowCount - starCount1;
                for (int i = 1; i <= dashCount; i++) {
                    System.out.print(' ');
                }

                // print stars
                int starCount = rowCount + 1 - row;
                for (int i = 1; i <= starCount; i++) {
                    System.out.print('*');
                }

                // new line
                System.out.println();
            }


                // new line
                System.out.println();
            }
            //TODO exercise 4d?
        }
