public class TypeCastingExample {
    public static void main(String[] args) {
        // Widening Casting (automatic)
        int intVar = 9;
        double doubleVar = intVar; // int to double
        System.out.println("Double value: " + doubleVar);

        // Narrowing Casting (manual)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // double to int
        System.out.println("Integer value: " + anotherInt);
    }
}
