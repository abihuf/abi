import java.util.Scanner;
//ПОКА РАБОТАЕТ ДЛЯ ПОЛОЖИТЕЛЬНЫХ
public class Main {
    public static void main(String[] args) {
        //подаем число на ввод
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        //пустая переменная типа данных String, с помощью которой "переворачиваем" число
        String total = "";
        //это для нолика
        if (num == 0) {
            System.out.println(0);
        }
        while (num > 0) {
            // находим остаток
            int bin = num % 2;
            //конвертируем в String
            String bin2 = String.valueOf(bin);
            total = bin2 + total;
            num = num / 2;
        }
        //тадам!
        System.out.println(total);
    }
}