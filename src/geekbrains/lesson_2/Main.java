package geekbrains.lesson_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {

                Scanner sc = new Scanner(System.in);
                System.out.println("Вы любите спать? (введите соответствующую цифру) 1. Да 2. Нет");
                int n1 = 1;
                int n2 = 2;
                int an = sc.nextInt();
                if (an == 1)
                    System.out.println("Не переживайте, это нормально");
                else if (an == 2)
                    System.out.println("Будьте честны с собой");
                else System.out.println("Поздравления, вы мыслите вне рамок");

            }
        }
    }
