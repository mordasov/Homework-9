import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task-1
        int[] arrayMonth = new int[5];
        int totalSum = 0;
        for (int i = 0; i < arrayMonth.length; i++) {
            int sumOfExpense = (int) (Math.random() * 20) + 1;
            arrayMonth[i] = sumOfExpense;
        }
        System.out.println("Траты за месяц " + Arrays.toString(arrayMonth));
        for (int element : arrayMonth) {
            totalSum += element;
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей.\n");

        //task-2 (вариант 1)
        int[] arrayWeek = new int[5];
        for (int i = 0; i < arrayWeek.length; i++) {
            arrayWeek[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Траты за неделю " + Arrays.toString(arrayWeek));
        Arrays.sort(arrayWeek);

        int maxForWeek = arrayWeek[arrayWeek.length - 1];
        System.out.println("Максимальная сумма трат за неделю составила " + maxForWeek + " рублей.");

        int minForWeek = arrayWeek[0];
        System.out.println("Минимальная сумма трат за неделю составила " + minForWeek + " рублей.\n");


        //task-2 (вариант 2)
        int[] arrayWeek2 = new int[5];
        for (int i = 0; i < arrayWeek2.length; i++) {
            arrayWeek2[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Траты за неделю " + Arrays.toString(arrayWeek2));

        int maxForWeek2 = arrayWeek2[0];
        for (int i = 1; i < arrayWeek2.length; i++) {
            if (arrayWeek2[i] > maxForWeek2) maxForWeek2 = arrayWeek2[i];
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxForWeek2 + " рублей.");

        int minForWeek2 = arrayWeek2[0];
        for (int i = 1; i < arrayWeek2.length; i++) {
            if (arrayWeek2[i] < minForWeek2) minForWeek2 = arrayWeek2[i];
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minForWeek2 + " рублей.\n");


        //task-3
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }
        System.out.println("Траты за месяц " + Arrays.toString(array));

        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        double avgForMonth = (double) sum / array.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n\n", avgForMonth);

        //task-4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int size = reverseFullName.length;
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}