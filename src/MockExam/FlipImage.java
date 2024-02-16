package MockExam;

public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
//        FlipImage prog = new FlipImage();
//        int[][] image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        prog.flipAndInvertImage(image);
        int n = image.length;

        for (int[] row : image) {
            // Only need to iterate up to n / 2 (exclusive) for flipping.
            // If n is odd, the middle element will be inverted later on.
            for (int i = 0; i < n / 2; i++) {
                // Swap and invert elements at positions i and n - i - 1.
                // No need to use a temporary variable since we invert both.
                int temp = row[i];
                row[i] = row[n - i - 1] ^ 1; // Invert and swap in one step
                row[n - i - 1] = temp ^ 1;   // Invert and swap in one step
            }
            // If n is odd, invert the middle element (which wasn't reached in the loop)
            if (n % 2 == 1) {
                row[n / 2] = row[n / 2] ^ 1; // Invert the middle element
            }
        }

        return image;
    }
}
