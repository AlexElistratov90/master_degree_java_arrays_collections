package com.asd.mod3_asd_hw_arrays_collections_elistratovaa;

import java.util.Comparator;

public class Arrays {

    public static int binarySearch(byte[] a, byte key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(char[] a, char key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(double[] a, double key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(float[] a, float key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(int[] a, int key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(long[] a, long key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(short[] a, short key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (a == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ищем в правой части массива
            } else if (midVal > key) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        if (a == null || c == null) {
            throw new NullPointerException("Array or comparator cannot be null");
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1; // Ищем в правой части массива
            } else if (cmp > 0) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (a == null || c == null) {
            throw new NullPointerException("Array or comparator cannot be null");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex cannot be greater than toIndex");
        }
        if (fromIndex < 0 || toIndex > a.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Средний индекс, избегая переполнения
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1; // Ищем в правой части массива
            } else if (cmp > 0) {
                high = mid - 1; // Ищем в левой части массива
            } else {
                return mid; // Элемент найден
            }
        }

        return -(low + 1); // Элемент не найден: возвращаем вставленную позицию
    }


    public static void main(String[] args) {
    }
}