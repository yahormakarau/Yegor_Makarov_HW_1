import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6) {
            System.out.println("Суббота");
        } else if (number == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Введите число от 1 до 7");
        }

        // task 2  approach 1
        Scanner scnr = new Scanner(System.in);
        System.out.println("нужно ввести 3 рандомных числа: введите первое");
        int a = scnr.nextInt();
        System.out.println("введите второе число");
        int b = scnr.nextInt();
        System.out.println("введите третье число");
        int c = scnr.nextInt();

        if (a >= b && a >= c) {
            System.out.println("max int is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("max int is " + b);
        } else {
            System.out.println("max value is " + c);
        }

        if (a <= b && a <= c) {
            System.out.println("min int is " + a);
        } else if (b <= a && b <= c) {
            System.out.println("min int is " + b);
        } else {
            System.out.println("min value is " + c);
        }

        // task 2 approach 2
        Scanner scnrr = new Scanner(System.in);
        System.out.println("нужно ввести 3 рандомных числа: введите первое");
        int e = scnr.nextInt();
        System.out.println("введите второе число");
        int f = scnr.nextInt();
        System.out.println("введите третье число");
        int j = scnr.nextInt();
        int smallest = Math.min(e, Math.min(f, j));
        System.out.println("min value = " + smallest);
        int maxValue = Math.max(e, Math.max(f, j));
        System.out.println("min value = " + maxValue);

        String minv = Integer.toString(smallest);
        System.out.println("Min value length is " + minv.length());
        String maxv = Integer.toString(maxValue);
        System.out.println("Max value length is " + maxv.length());

        //task 3
        Book book = new Book(1, "Book1", "Lermontov", 1988, 305, 32.15, "Paper");
        Book book1 = new Book(2, "Book2", "Pushkin", 1981, 305, 32.15, "Paper");
        Book book2 = new Book(3, "Kirovograd", "Lermontov", 1969, 305, 32.15, "Paper");
        Book book3 = new Book(4, "Kirovograd 4", "Turgeniev", 2003, 305, 32.15, "Paper");
        Book book4 = new Book(5, "Book5", "Lermontov", 1995, 305, 32.15, "Paper");
        Book.books.add(book);
        Book.books.add(book1);
        Book.books.add(book2);
        Book.books.add(book3);
        Book.books.add(book4);
        String bookAuthor = "Lermontov";
        for (Book x : Book.books) {
            if (bookAuthor.equals(x.getAuthor()))
                System.out.println("автор книги : " + x.getAuthor() + " и название книги : " + x.getName());
        }
        String bookName = "Kirovograd";
        for (Book x : Book.books) {
            if (x.getName().contains(bookName))
                System.out.println("название книги содержащие слово или часть фразы Кировоград: " + x.getName());
        }
        int startDate = 1980;
        int endDate = 2000;
        for (Book x : Book.books) {
            if (x.getYear() >= startDate && x.getYear() <= endDate)
                System.out.println("книга выпущенная в период с 1980 по 2000гг: " + x.getName());
        }

        //task 4

        Taxi taxi1 = new Taxi("Mercedes", 2010, 4, 12.5, 23500, 169);
        Taxi taxi2 = new Taxi("Opel", 2017, 4, 15.5, 5000, 120);
        Taxi taxi3 = new Taxi("Chrysler", 2001, 4, 11.7, 10500, 200);
        Taxi taxi4 = new Taxi("Porsche", 1980, 4, 10.2, 15000, 250);
        Taxi taxi5 = new Taxi("Audi", 2021, 4, 31.1, 111000, 198);
        Taxi.taxis.add(taxi1);
        Taxi.taxis.add(taxi2);
        Taxi.taxis.add(taxi3);
        Taxi.taxis.add(taxi4);
        Taxi.taxis.add(taxi5);

        //найти автомобиль соответствующий заданному диапазону параметру скорости
        int ms = 200;
        for (Taxi t : Taxi.taxis) {
            if (t.maxSpeed == ms)
                System.out.println("автомобиль с максимальной скоростью 200км/ч : " + t.manufacturer + " год выпуска :" + t.getProductionYear() + " цена :" + t.getPrice() + " максимальная скорость: " + t.maxSpeed + "км/ч");
        }
        int sum = 0;
        for (Taxi t : Taxi.taxis) {
            sum += t.getPrice();

        }
        System.out.println("стоимость автопарка -   " +sum);
    }
}
