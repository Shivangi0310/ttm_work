import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/nikhil-mittal/test.csv");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("test");
        fileWriter.close();

        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("here");
        int a = 4;

        try {
            if (a > 4) {
                throw new IllegalArgumentException("Something went wrong");
            } else {
                throw new IllegalAccessException("Something else");
            }
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println(e.getMessage());

        }
    }
}
