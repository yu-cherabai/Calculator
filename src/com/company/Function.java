package com.company;

public class Function {

    static int addition(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    static int subtraction(int a, int b) {
        int result;
        result = a - b;
        return result;
    }

    static int multiplication(int a, int b) {
        int result;
        result = a * b;
        return result;
    }

    static int division(int a, int b) {
        int result;
        result = a / b;
        return result;
    }

    static float fraction(int a, int b) {
        float result;
        float a1, b1;
        a1 = a;
        b1 = b;
        result = a1 / b1;
        return result;
    }

    static int remainder(int a, int b) {
        int result;
        result = a % b;
        return result;
    }

    static int exponentiation(int a, int b) {

        int result, x, y;
        result = a;
        y = 1;

        if (b == 0) {
            result = 1;
        } else if (b > 1) {
            do {
                x = result;
                result = x * a;
                y++;
            } while (y < b);
        }
        return result;
    }

    static float negative_exponentiation(int a, int b) {
        float result, a1, b2, x, y;
        a1 = a;
        b2 = b;

        if (a1 == 1) {
            result = 1;

        } else if (a1 == -1) {
            if (b2 % 2 == 0) {
                result = 1;
            } else
                result = -1;
        } else {
            result = a1;
            y = 1f;

            do {
                x = result;
                result = x * a;
                y++;
            } while (y < (b2 * -1));
            result = 1 / result;
        }
        if (b2 == -1) {
            result = 1 / a1;
        }
        return result;
    }

    static int root(int a, int b) {
        int x = 0, y;

        if (b == 2) {
            do {
                x++;
                y = x * x;
                if (x > a) {
                    x = 0;
                    break;
                }
            } while (y != a);
        } else if (b == 3) {
            do {
                x++;
                y = x * x * x;
                if (x > a) {
                    x = 0;
                    break;
                }
            } while (y != a);
        } else
            System.out.println("В данный момент доступны только квадратный и кубический корень!");
        return x;
    }
    static void duo (int n){
        int r;
        r = n % 2;
        if (n >= 2)
            duo(n / 2);
        System.out.print(r == 0 ? '0' : '1');
    }
}
