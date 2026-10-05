public class array {
    public static void main(String[] args) {

        int o[] = new int[3];

        o[0] = 10;
        o[1] = 20;
        o[2] = 80;

        int k = o[0] + o[2];

        System.out.println("K value is: " + k);

        o[2] = 100;

        System.out.println("After changing o[2]: " + o[2]);
    }
}
