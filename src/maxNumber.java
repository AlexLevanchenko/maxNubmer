import java.util.Scanner;

public class maxNumber {

    public static void main(String[] args) {
        System.out.println("Введите 3 числа, а я вам покажу максимальное!");
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение для а: ");
        a = input.nextInt();
        System.out.print("Введите значение для b: ");
        b = input.nextInt();
        System.out.print("Введите значение для c: ");
        c = input.nextInt();
        int max = a > b ? a : b;
        max = c > max ? c : max;
        System.out.print("А вот и максимальное число: " + max);
    }
}
