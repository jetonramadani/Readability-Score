class ManufacturingController {
    private static int requests = 0;
    public static String requestProduct(String product) {
        // write your code here
        ++requests;
        return String.format("%d. Requested %s", requests, product);
    }

    public static int getNumberOfProducts() {
        // write your code here
        return requests;
    }
}