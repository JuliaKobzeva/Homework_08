import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    //Метод к заданию 1
    private static void getToKnowLeapYear (int year){

        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println( year + " год високосный");
        } else {
            System.out.println( year + " год не високосный");
        }
    }

    //Методы к заданию 2

    private static int getClientOS (String name){
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }

    }

    private static void getClientDevice (int deviceYear){

        int clientOS = getClientOS("iOS");

        if (clientOS == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && deviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

    }

    //Метод к заданию 3

    private static int calculateDelivery (int deliveryDistance) {

        int day = 1;

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day++;
            System.out.println("Доставка займет " + day + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day += 2;
            System.out.println("Доставка займет " + day + " дня");
        } else
            System.out.println("Доставка займет " + day + " день");
        return day;
    }

    //Метод к заданию 4

    private static void getNumberReverse (int [] arr2){

        for(int i = arr2.length-1; i >= 0; i-- ){
            System.out.print(arr2 [i]);
        }
        System.out.println();
    }

    //Метод к заданию 5

    private static void getToKnowDoubleLetters (String name1){

        char[] letters2 = name1.toCharArray();
        for (int i = 0; i < name1.length(); i++) {
            for (int j = i + 1; j < name1.length(); j++) {
                if (letters2[i] == letters2[j]) {
                    System.out.print(letters2[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    //Методы к заданию 6

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void getToKnowAverageExpense (int [] nnn){

        int total = getToKnowSum (nnn);

        double averageExpense = total* 1.0/ 30;

        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");

    }

    private static int getToKnowSum (int [] nnn2){

        int sum = 0;

        for (int element : nnn2) {
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args) {
        //Задание 1
        int currentYear = LocalDate.now().getYear();
        getToKnowLeapYear(currentYear);
        getToKnowLeapYear(2000);

        //Задание 2

        getClientDevice (currentYear);

        //Задание 3

        calculateDelivery (95);

        //Задание 4

        int[] number4 = {3,2,1,6,5};

        getNumberReverse (number4);

        //Задание 5

        String Letters = "aabccddefgghiijjkk";

        getToKnowDoubleLetters (Letters);

        //Задание 6

        int[] arr = generateRandomArray();

        System.out.println(Arrays.toString (arr));

        getToKnowAverageExpense (arr);

    }
}