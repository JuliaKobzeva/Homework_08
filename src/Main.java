import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    //Метод к заданию 1
    public static void leapYear (int number){
        int Year = number;
        if (Year % 4 == 0 && Year % 100 > 0) {
            System.out.println( Year + " год високосный");
        } else if (Year % 400 == 0) {
            System.out.println( Year + " год високосный");
        } else if (Year % 4 > 0) {
            System.out.println( Year + " год не високосный");
        }
    }

    //Методы к заданию 2

    public static int getClientOS (String name){
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void clientDevice (int number2){
        int DeviceYear = number2;
        if (DeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения");
        }
    }

    //Метод к заданию 3

    public static int delivery (int number3) {
        int deliveryDistance = number3;
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

    public static void numberReverse (int [] arr2){

        for(int i = 4; i >= 0; i-- ){
            System.out.print(arr2 [i]);
        }
        System.out.println();
    }

    //Метод к заданию 5

    public static void doubleLetters (String name1){

        char[] LE = name1.toCharArray();
        for (int i = 0; i < name1.length(); i++) {
            for (int j = i + 1; j < name1.length(); j++) {
                if (LE[i] == LE[j]) {
                    System.out.print(LE[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    //Методы к заданию 6

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void getToKnowAverageExpense (int [] nnn){

        int total = getToKnowSum (nnn);

        double AverageExpense = total / 30;

        System.out.println("Средняя сумма трат за месяц составила " + AverageExpense + " рублей.");

    }

    public static int getToKnowSum (int [] nnn2){

        int sum = 0;

        for (int element : nnn2) {
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args) {
        //Задание 1
        int currentYear = LocalDate.now().getYear();
        leapYear(currentYear);
        leapYear(2000);

        //Задание 2

        int clientOS = getClientOS ("iOS");
        clientDevice (currentYear);

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 3

        delivery(95);

        //Задание 4

        int[] number4 = {3,2,1,6,5};

        numberReverse (number4);

        //Задание 5

        String Letters = "aabccddefgghiijjkk";

        doubleLetters (Letters);

        //Задание 6

        int[] arr = generateRandomArray();

        System.out.println(Arrays.toString (arr));

        getToKnowAverageExpense (arr);

    }
}