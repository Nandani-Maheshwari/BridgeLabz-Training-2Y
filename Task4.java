public class Task4 {

    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Age valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // you can change value
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
