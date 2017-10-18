import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by joacim on 2017-10-16.
 */


public class Writer {

    public void write (String info) throws IOException {

        BufferedWriter bf = new BufferedWriter(new FileWriter("Kunder som tränat.txt", true));

        bf.write(info+"\n");
        bf.close();
    }
}