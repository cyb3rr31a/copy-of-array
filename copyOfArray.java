public class copyOfArray {
    public static void main(String[] args) {
        int originalArray[] = {30, 70, 20, 60, 60, 15};
        int copiedArray[] = new int[originalArray.length + 1];

        // Copy values from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Add another value to copiedArray at the end
        copiedArray[copiedArray.length - 1] = 120;

        // Print out the contents of copiedArray
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}
