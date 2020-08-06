package Test2;

import java.util.Scanner;

public class Test2Name {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя  ");
        String name = in.nextLine();
           if (name.equals("Вячеслав"))
               System.out.println("Привет, Вячеслав!");
            else System.out.println("Нет такого имени");
        }
    }