package by.it.brikun.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chislo = sc.nextInt();
        int mes = sc.nextInt();
        int den;
        int jan = 31;
        int feb = 28;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int avg = 31;
        int sep = 30;
        int okt = 31;
        int nov = 30;
        int dec = 31;

        if (mes == 1) {
            den = chislo;
            System.out.println(den);
        }
        else if (mes == 2) {
            den = jan + chislo;
            System.out.println(den);
        }
        else if (mes ==3) {
            den = jan + feb + chislo;
            System.out.println(den);
        }
        else if (mes == 4) {
            den = jan+feb+mar+chislo;
            System.out.println(den);
        }
        else if (mes == 5) {
            den = jan +feb+mar+apr+chislo;
            System.out.println(den);
        }
        else if (mes ==6) {
            den = jan + feb +mar+apr+may+chislo;
            System.out.println(den);
        }
        else if (mes == 7) {
            den = jan + feb +mar+apr+may+jun+chislo;
            System.out.println(den);
        }
        else if (mes == 8) {
            den = jan + feb +mar+apr+may+jun+jul+chislo;
            System.out.println(den);
        }
        else if (mes ==9) {
            den = jan + feb +mar+apr+may+jun+jul+avg+chislo;
            System.out.println(den);
        }
        else if (mes ==10) {
            den = jan + feb +mar+apr+may+jun+jul+avg+sep+chislo;
            System.out.println(den);
        }
        else if (mes ==11) {
            den = jan + feb +mar+apr+may+jun+jul+avg+sep+okt+chislo;
            System.out.println(den);
        }
        else if (mes ==12) {
            den = jan + feb +mar+apr+may+jun+jul+avg+sep+okt+nov+chislo;
            System.out.println(den);
        }


    }
}