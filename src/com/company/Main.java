package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        System.out.println("===========================================================");
        System.out.println("\t\t\t\t\t    КАЛЬКУЛЯТОР");
        System.out.println("Калькулятор умеет: +, -, *, /, %, ^, koren(kor), system 2;");
        System.out.println("Пример возведения в степень: 2 ^ 3 =   8");
        System.out.println("\t\ts\t\t\t\t\t 4 ^ 4 = 256");
        System.out.println("Пример взяти корня: 2 kor/koren  16 = 4");
        System.out.println("\t\t\t\t\t3 kor/koren 125 = 5");
        System.out.println("Пример перевода в двоичную систему счисления:\n" +
                           "7 system 2 = 111;");
        System.out.println("Для выхода из калькулятора,\n" +
                           "в любом выражении вместо знака введите exit.\n" +
                           "Например: 2 exit 5 = exit;");
        System.out.println("===========================================================");

        Scanner scan = new Scanner(System.in);

        int x, y, result;
        String sign;
        boolean itsTrue = true;

        while (itsTrue) {

            x = scan.nextInt();
            sign = scan.next();
            y = scan.nextInt();

            switch (sign) {
                case "+":
                    result = Function.addition(x, y);
                    System.out.println(x + sign + y + " = " + result);
                    break;
                case "-":
                    result = Function.subtraction(x, y);
                    System.out.println(x + sign + y + " = " + result);
                    break;
                case "*":
                    result = Function.multiplication(x, y);
                    System.out.println(x + sign + y + " = " + result);
                    break;
                case "/":
                    if (y != 0) {
                        if (x < y || x % y != 0){
                            float f;
                            f = Function.fraction(x, y);
                            System.out.println(x + sign + y + " = " + f);
                        }else{
                            result = Function.division(x, y);
                            System.out.println(x + sign + y + " = " + result);
                        }
                    } else
                        System.out.println("Деление на ноль невозможно!");
                    break;
                case "%":
                    result = Function.remainder(x, y);
                    System.out.println(x + sign + y + " = " + result);
                    break;
                case "^":
                    if (y < 0) {
                        float f;
                        f = Function.negative_exponentiation(x, y);
                        System.out.println(x + sign + y + " = " + f);
                    } else {
                        result = Function.exponentiation(x, y);
                        System.out.println(x + sign + y + " = " + result);
                    }
                    break;
                case "kor":
                    if (y > 0) {
                        result = Function.root(y, x);
                        System.out.println(result);
                    } else if (y == 0) {
                        result = 0;
                        System.out.println(result);
                    } else
                        System.out.println("Неправильно введены данные!");
                    break;
                case "koren":
                    if (y > 0) {
                        result = Function.root(y, x);
                        System.out.println(result);
                    } else if (y == 0) {
                        result = 0;
                        System.out.println(result);
                    } else
                        System.out.print("Не правильно введены данные!\n");
                    break;
                case "system":
                    if (y == 2){
                        Function.duo(x);
                        System.out.print("\n");
                    }else
                        System.out.println("Не возможен перевод в данную систему счисления!");
                    break;
                case "exit":
                    itsTrue = false;
                    break;
                default:
                    System.out.println("Не корректно введена операция!");
            }
        }
    }
}
