import java.util.Arrays;

public class sol13 {

    // Q: Given an n x n binary matrix image, flip the image horizontally, then
    // invert it, and return the resulting image.

    // To flip an image horizontally means that each row of the image is reversed.

    // For example, flipping [1,1,0] horizontally results in [0,1,1].
    // To invert an image means that each 0 is replaced by 1, and each 1 is replaced
    // by 0.

    // For example, inverting [0,1,1] results in [1,0,0].

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        flipAndInvertImage(image);
        for (int[] item : image) {
            System.out.println(Arrays.toString(item));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for (int[] item : image) {
            for (int i = 0; i < size / 2; i++) {
                flipAndInvert(item, i, size - 1 - i);
            }
        }
        if (size % 2 != 0) {
            for (int[] item : image) {
                item[size / 2] ^= 1;
            }
        }
        return image;
    }

    public static void flipAndInvert(int[] arr, int index1, int index2) {
        int temp = arr[index1] ^ 1;
        arr[index1] = arr[index2] ^ 1;
        arr[index2] = temp;
    }

}