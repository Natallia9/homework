public class Main {
    public static void main(String[] args) {

        //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
        //Операцией возведения в степень пользоваться нельзя!
        int num = 16;

        if (powerOfTwo(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println();
        //Дано натуральное число N. Вычислите сумму его цифр.
        // При решении этой задачи нельзя использовать строки, списки,
        // массивы (ну и циклы, разумеется).

        int num2 = 179;
        int result = sum(num2);
        System.out.println(result);
        System.out.println();

        //Напишите рекурсивный метод, который выводит на экран
        // числа Фибоначчи до N-ого элемента.
        //F 0 = 0, F 1 = 1, F n = F n-1 + F n-2
        int num3 = 5;

        System.out.println("Числа Фибоначчи до:");
        for (int i = 0; i < num3; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println();

        //Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
        String word = "комок";

        if (palindrome(word)) {
            System.out.println("Это слово является палиндромом.");
        } else {
            System.out.println("Это слово не является палиндромом.");
        }
    }

    private static boolean powerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sum(n / 10);
        }
    }
    private static int fibonacci(int f) {
        if (f == 0) {
            return 0;
        } else if (f == 1) {
            return 1;
        } else {
            return fibonacci(f - 1) + fibonacci(f - 2);
        }
    }
    private static boolean palindrome(String str) {
        String p = str.toLowerCase();
        return recursivePalindrome(p, 0, p.length() - 1);
    }

    private static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            return str.charAt(start) == str.charAt(end) &&
                    recursivePalindrome(str, start + 1, end - 1);
        }
    }
}






