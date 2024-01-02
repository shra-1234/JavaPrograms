public class dataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte x1 = 25;
        short x2 = 32767;
        int x3 = 100000;
        long x4 = 1234567890123456L;  // Use 'L' suffix for long literals
        float pi = 3.14159f;                // Use 'f' suffix for float literals
        double x5 = 9.81;
        char x6 = 'A';
        boolean x7 = true;

        // Non-primitive data types
        int[] x8 = {1, 2, 3, 4, 5};
        String x9 = "John Doe";

        System.out.println("Examples of All datatypes in Java --");
        System.out.println("Primitive datatypes :---");
        System.out.println("Byte : "+x1);
        System.out.println("Short : "+x2);
        System.out.println("Int : "+x3);
        System.out.println("Long int : "+x4);
        System.out.println("Float : "+pi);
        System.out.println("Double : "+x5);
        System.out.println("Char : "+x6);
        System.out.println("Boolean : "+x7);
        System.out.println();
        System.out.println("Non-Primitive datatypes :---");
        System.out.print("Array : ");
        for(int i=0;i<x8.length;i++){
            System.out.print(x8[i]+" ");
        }
        System.out.println("\nString : "+x9);

    }
}
