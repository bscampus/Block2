public class SchleifenProbe {

    public static void main(String[] args) {

        int count = 0;
        while (count <= 40) {
            count++;
            System.out.println(count);
            System.out.println("hier bin ich in der Schleife");
        }
        System.out.println(count);
        System.out.println("endlich aus der Schleife");
    }
}
