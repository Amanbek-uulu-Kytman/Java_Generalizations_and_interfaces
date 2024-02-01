package My_Third_interfase;

public class Main {
    public static void main(String[] args) {
        // Пример использования метода printArray
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "apple", "banana", "orange" };

        printArray(intArray);
        printArray(stringArray);

        // Пример использования класса обобщения Math
        Integer[] intNumbers = { 1, 2, 3, 4, 5 };
        Double[] doubleNumbers = { 1.5, 2.5, 3.5, 4.5, 5.5 };

        Math<Integer> intMath = new Math<>();
        Math<Double> doubleMath = new Math<>();

        System.out.println("Sum of intNumbers: " + intMath.sumNum(intNumbers));
        System.out.println("Sum of doubleNumbers: " + doubleMath.sumNum(doubleNumbers));

        // Пример использования класса обобщения Elements
        String[] arr1 = { "Cat", "Dog", "Mouse" };
        Integer[] arr2 = { 1, 2, 3 };

        Elements<String> elements1 = new Elements<>();
        Elements<Integer> elements2 = new Elements<>();

        elements1.printElems(arr1);
        elements2.printElems(arr2);
    }

    // Метод для печати элементов массива
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Класс обобщения Math
class Math<T extends Number> {
    public double sumNum(T[] array) {
        double sum = 0;
        for (T num : array) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

// Класс обобщения Elements
class Elements<T> {
    public void printElems(T[] array) {
        for (T elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
