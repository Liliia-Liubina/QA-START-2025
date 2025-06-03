import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] hotelRooms = new int[15];
        Random rand = new Random();
        for (int i = 0; i < hotelRooms.length; i++) {
            hotelRooms[i] = rand.nextInt(25);
        }
        boolean unsorted = hotelRooms.length > 1;

        while (unsorted) {
            boolean elementsSwitched = false;
            for (int i = 0; i < hotelRooms.length - 1; i++) {
                int currentElement = hotelRooms[i + 1];
                int previousElement = hotelRooms[i];


                if (previousElement > currentElement) {
                    elementsSwitched = true;
                    unsorted = true;
                    hotelRooms[i + 1] = previousElement;
                    hotelRooms[i] = currentElement;
                }
                if (!elementsSwitched) {
                    unsorted = false;
                }
            }
            System.out.println();
            for (int i = 0; i < hotelRooms.length; i++) {
                System.out.print(hotelRooms[i] + ",");
            }
        }


//        int[] hotelRooms = new int[15];
//        Random rand = new Random();
//        for (int i = 0; i < hotelRooms.length; i++) {
//            hotelRooms[i] = rand.nextInt(25);
//        }
//        //1. ми не знаємо скільки разів ми будем пробігати масивом
//        //2. ми знаємо, що масив відсортовано тоді, коли ми не поміняли місцями жодних двох елементів
//        //3. елементи порівнюються попарно, пичнаючи з інедксу 1, і "озираючись" назад. Тобто 1 і 0, 2 і 1
//        //4. якщо поточний елемент менший за попредній, поміняти їх місцями
//        boolean unsorted = hotelRooms.length > 1;
//
        //        while (unsorted) {
//            boolean elementsSwitched = false;
//            for (int i = 1; i < hotelRooms.length; i++) {
//                int currentElement = hotelRooms[i];
//                int previousElement = hotelRooms[i - 1];
//
//                if (previousElement > currentElement) {
//                    elementsSwitched = true;
//                    unsorted = true;
//                    hotelRooms[i] = previousElement;
// hotelRooms[i - 1] = currentElement;
//                }
//                if (!elementsSwitched) {
//                    unsorted = false;
//                }
//            }
//            System.out.println();
//            for (int i = 0; i < hotelRooms.length; i++) {
//                System.out.print(hotelRooms[i] + ",");
//
        //            }


//        for (int i = 0; i < hotelRooms.length; i++) {
//            if (hotelRooms[i] % 2 == 0) {
//                System.out.println("Hotel Room with index " + i + " is an even number");
//            } else {
//                System.out.println("Hotel Room with index " + i + " is an odd number");
//            }
//        }

//        for (int i = hotelRooms.length - 1 ; i >= 0; i-=2) {
//            System.out.println("Hotel Room with index " + i + " is " + hotelRooms[i]);
//        }
//
//        for (int i = 0; i < hotelRooms.length; i+=2) {
//            System.out.println("Hotel Room with index " + i + " is " + hotelRooms[i]);
//        }

//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);
//
//        int j = 10;
//        while (j < 10) {
//            System.out.println(j);
//            j++;
//        }

//       int[] hotelRooms = new int[10];
//       hotelRooms[0] = 1;
//       hotelRooms[1] = 8;
//       hotelRooms[2] = 5;
//       hotelRooms[3] = 7;
//       hotelRooms[4] = 3;
//       hotelRooms[5] = 2;
//       hotelRooms[6] = 4;
//       hotelRooms[7] = 9;
//       hotelRooms[8] = 6;
//       hotelRooms[9] = 10;

//        boolean unsorted = hotelRooms.length > 1;
//        while (unsorted) {

//            for (int i = 0; i < hotelRooms.length; i++) {
//                System.out.println(hotelRooms[i]);
//           }


//            boolean elementsSwitched = false;
//            for (int i = 1; i < hotelRooms.length; i++) {
//                int currentElement = hotelRooms[i];
//                int previousElement = hotelRooms[i - 1];

//                if (previousElement > currentElement) {
//                    elementsSwitched = true;
//                    unsorted = true;
//                    hotelRooms[i] = previousElement;
//                    hotelRooms[i - 1] = currentElement;
//                }
//                if (!elementsSwitched) {
//                    unsorted = false;
//                }
//            }
//            System.out.println();

//        }


    }
}
