import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная 
// была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

public class task3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Enter command: ");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator<String> listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        System.out.printf("%s", listIterator);
                    }
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "exit":
                    System.out.println("See you soon!");
                    work = false;
                    break;
                default:
                    list.add(line);
            }
            System.out.println();
        }
    }
}
