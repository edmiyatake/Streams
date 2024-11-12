import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        // import stream items
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("inputByte.txt");
            out = new FileOutputStream("outputByte.txt");
            int c;

            // while the bit c is not -1 meaning no bit
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}