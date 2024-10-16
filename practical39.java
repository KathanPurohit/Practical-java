import java.util.Arrays;

public class practical39 {

    // Generic method to sort an array of Comparable objects
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        // Simple sorting algorithm (Bubble Sort in this case)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example 1: Sorting an array of Integers
        Integer[] intArray = {5, 2, 9, 1, 6, 3};
        System.out.println("Before sorting Integers: " + Arrays.toString(intArray));
        sortArray(intArray);
        System.out.println("After sorting Integers: " + Arrays.toString(intArray));

        // Example 2: Sorting an array of Strings
        String[] stringArray = {"Banana", "Apple", "Orange", "Mango"};
        System.out.println("\nBefore sorting Strings: " + Arrays.toString(stringArray));
        sortArray(stringArray);
        System.out.println("After sorting Strings: " + Arrays.toString(stringArray));

        // Example 3: Sorting an array of custom Products (Product class implements Comparable)
        Product[] productArray = {
            new Product("Laptop", 800),
            new Product("Smartphone", 500),
            new Product("Tablet", 300),
            new Product("Smartwatch", 200)
        };
        System.out.println("\nBefore sorting Products by price: " + Arrays.toString(productArray));
        sortArray(productArray);
        System.out.println("After sorting Products by price: " + Arrays.toString(productArray));
    }
}

// Example custom Product class implementing Comparable
class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Implementing the compareTo method to compare by price
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
