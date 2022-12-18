// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

// Чубченко Светлана

import java.util.Arrays;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        // создаем связанный список
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        // инвертируем
        reverseList(list);
        // выводим на экран
        System.out.println(list);
    }

    public static void reverseList(LinkedList<Integer> list) {
        // проходим от начала до середины списка меняя
        // первый и последний элементы
        for(int i = 0, mid = list.size()/2, j = list.size() - 1; i < mid; i++, j--)
            list.set(i, list.set(j, list.get(i)));
    }
}
