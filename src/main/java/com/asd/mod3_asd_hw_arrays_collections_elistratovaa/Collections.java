package com.asd.mod3_asd_hw_arrays_collections_elistratovaa;

import java.util.Comparator;
import java.util.List;

public class Collections {

    // Бинарный поиск в списке с использованием естественного порядка
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        if (list == null || key == null) {
            throw new NullPointerException("List or key cannot be null");
        }

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            T midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0) {
                low = mid + 1; // Ищем в правой части списка
            } else if (cmp > 0) {
                high = mid - 1; // Ищем в левой части списка
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    // Бинарный поиск в списке с использованием компаратора
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (list == null || c == null) {
            throw new NullPointerException("List or comparator cannot be null");
        }

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1; // Ищем в правой части списка
            } else if (cmp > 0) {
                high = mid - 1; // Ищем в левой части списка
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static void main(String[] args) {

    }
}
