import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {


        Charset charset=Charset.forName("UTF-8");
        Path path= Paths.get("C:\\Users\\abran\\Documents\\branga_andrei\\io\\src\\io.txt");
        System.out.println(path.toString());
        try(BufferedReader reader=Files.newBufferedReader(path,charset))
        {
            String line=null;
            line=reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }
        }
        charset=Charset.forName("US-ASCII");
        String s="abcdefghijkl";
        try(BufferedWriter writer=Files.newBufferedWriter(path,charset))
        {
            writer.write(s);
            writer.newLine();
            writer.write("fvfsvfvdv");
        }


    }
}
