package Projects;
	public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int num1 = 200;
        long num2 = num1;
        System.out.println("After implicit type casting (widening): num2 = " + num2);

        // Explicit type casting (narrowing)
        double num3 = 56789.56;
        int num4 = (int) num3;
        System.out.println("After explicit type casting (narrowing): num4 = " + num4);
    }
}

