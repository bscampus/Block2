public class FindEven {
    public static void main(String[] args) {

        int count = 1;
        int end = 100;
        while (count <= end) {
            if (count % 2 == 0) {
                System.out.println("bin gerade " + count);
            }
            count++;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Durchlauf Nr.: " + i);
        }
    }
}

