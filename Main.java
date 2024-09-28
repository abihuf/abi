import java.io.PrintStream;
import java.util.Scanner;
//ПОКА РАБОТАЕТ ДЛЯ НЕОТРИЦАТЕЛЬНЫХ
public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //подаем число на ввод
        System.out.println("Введите число:");
        int num = in.nextInt();
        //пустая переменная типа данных String, с помощью которой "переворачиваем" число
        String res = "";
        //это для нолика
        if (num == 0) {
            System.out.println(0);
        }
        while (num != 0) {
            res = (num % 2) + res;
            num = num / 2;
        }
        //тадам!
        System.out.println(res);
    }
}
