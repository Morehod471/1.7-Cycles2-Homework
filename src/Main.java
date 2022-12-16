public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int monthIncome = 15_000;
        int account = 0;
        int i=0;
        while ( account <= 2_459_000) {
            monthIncome = monthIncome + monthIncome/100;
            account = account + monthIncome;
            i++;
            System.out.println("Месяц " +i+ " Cумма накоплений равна " + account + " рублей");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int a=0;
        while (a<10) {
            a++;
            System.out.print(a+ " ") ;
        }
        System.out.println();
        int b=11;
        while (b>1) {
            b--;
            System.out.print(b+ " ") ;
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthPer1000 = 17;
        int deathPer1000 = 8;
        int year = 0;
        while (year < 10) {
            year++;
            int birthYear = population/1000*birthPer1000;
            int deathYear = population/1000*deathPer1000;
            population = population + birthYear - deathYear;
            System.out.println("Год " + year+ ", численность населения составляет " + population);
        }

    }

    private static void task4() {
        System.out.println("Задача 4");
        int account = 15_000;
        int i = 0;
        while ( account < 12_000_000) {
            i++;
            account = account + account/100*7;
                System.out.println("Месяц " + i + " Итого " + account);
            }
        System.out.println(i + " месяцев надо, чтобы накопить 12 млн");
    }

    private static void task5() {
        System.out.println("Задача 5");
        int account = 15_000;
        int i = 0;
        while ( account < 12_000_000) {
            i++;
            account = account + account/100*7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + account);
            }
        }
        System.out.println(i + " месяцев надо, чтобы накопить 12 млн");
    }

    private static void task6() {
        System.out.println("Задача 6");
        int account = 15_000;
        int i = 0;
        while ( i < 9*12) {
            i++;
            account = account + account/100*7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + account);
            }
        }
    }

    private static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    private static void task8() {
        System.out.println("Задача 8");
        int yearCurrent = 2018;
        int year200Before = yearCurrent - 200;
        int year100After = yearCurrent + 100;
        int cometyear = year200Before - 1;
        while (cometyear <= year100After) {
            cometyear = cometyear + 79;
            if (cometyear <=year100After) {
                System.out.println(cometyear);
            }
        }
    }
}
