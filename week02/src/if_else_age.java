public class if_else_age {
    public static void main(String[] args) {

        int age = 33;

        if (age < 7) {
            System.out.println("Infant");
        }
        else if (age >= 7 && age < 10) {
            System.out.println("Child");
        }
        else if (age >= 10 && age < 20) {
            System.out.println("Teenage");
        }
        else if (age >= 20 && age < 30) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Old");
        }
    }
}
