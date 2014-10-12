import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {

            inputStream = new FileInputStream("in.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solution = new Solution();
        solution.solve(in, out);
        out.close();
    }
}





