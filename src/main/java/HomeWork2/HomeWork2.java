package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        int[] numbs = {0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < numbs.length; i++)
            if (numbs[i] == 1) {
                numbs[i] = 0;
            } else numbs[i] = 1;
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + "");

        } arrays();
        arrays1();
    }


    private static void arrays() {

        int[] array = new int[8];
        int j = 0;
        for (int i = 0; i < array.length; i++, j = j + 3) {
            array[i] = j;
        }
        for(int i = 0; i < array.length; i++)
            System.out.println( array[i]);

        }
        private static void arrays1(){
        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array1.length ; i++) {
                if ( array1[i] < 6) {
                    array1[i] = array1[i ]* 2 ;
                }
                System.out.println( i + "-" + array1[i] + "");


            }
        }

    }




