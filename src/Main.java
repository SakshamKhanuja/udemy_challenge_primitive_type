public class Main {

    public static void main(String[] args) {
        // Byte variable
        byte byteValue = Byte.MAX_VALUE;

        // Short variable
        short shortValue = Short.MAX_VALUE;

        // Int variable
        int intValue = Integer.MAX_VALUE;
    
        // Long variable
        long longValue = 50000L + 10L * (byteValue + shortValue + (long) intValue);

        // Prints the result.
        System.out.println(longValue);
    }
}
