public class ArrayDemo1 {

    public static void main(String[] args) {

        int [] array1 = new int[3];
        array1[0] = 723;
        array1[1] = 48;
        array1[2] = 371;

        int [] array2 = new int[3];
        array2[0] = 7;
        array2[1] = 13;
        array2[2] = 2;

        int sumFor = 0;
        System.out.print("+ : ");
        for( int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + array2[i] +",");

        }
        System.out.println();
        System.out.print("* : ");
        for( int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array2[i] + ",");
        }
    }
}
