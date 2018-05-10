// Reading
import java.io.BufferedReader;
import java.io.FileReader;

// Writing
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.File;
import java.io.IOException;

public class FileIO
{
  public static void main(String[] args)
  {
    // Create file
    File file = new File("file.txt");
    // file.setWriteable();

    // Write to file
    try (BufferedWriter buff = new BufferedWriter(new FileWriter(file));)
    {
      buff.write("My name is Victor!");
    } catch (IOException e) {e.printStackTrace();}

    // Check file details
    System.out.println("Exists:      " + file.exists());
    System.out.println("Path:        " + file.getAbsolutePath());
    System.out.println("Is Dir:      " + file.isDirectory());
    System.out.println("Is File:     " + file.isFile());
    System.out.println("Can Write:   " + file.canWrite());

    // Read file
    try (BufferedReader buff = new BufferedReader(new FileReader(file));)
    {
      String line = "";
      while ((line = buff.readLine()) != null) System.out.println(line);
    } catch (IOException e) {e.printStackTrace();}
  }
}
