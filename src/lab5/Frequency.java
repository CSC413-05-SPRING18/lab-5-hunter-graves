package lab5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frequency
{

    private String rawText;
    public Frequency()
    {
       // this.rawText = read();
    }

    public String read()
    {
        Path filePath = Paths.get("src/lab5/Test.java");
        try {
            Scanner scanner = new Scanner(filePath);
            //List<Integer> integers = new ArrayList<>();
            while (scanner.hasNext()) {
                this.rawText += (" " + scanner.next());
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return this.rawText;
    }

}
