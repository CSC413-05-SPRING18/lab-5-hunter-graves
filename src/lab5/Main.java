package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import lab5.Frequency;
import lab5.Counter;

public class Main {

  public static void main(String[] args) {
    try {
      File f = new File("src/lab5/Test.java");
      BufferedReader b = new BufferedReader(new FileReader(f));
      String readLine = "";
      while ((readLine = b.readLine()) != null) {
        System.out.println(readLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    Frequency blah = new Frequency();
    String bloo = blah.read();
    Counter count = new Counter(bloo);
    System.out.println(count.removeNull(count.getCurrent()));
    count.populateHashMap();
  }



}
