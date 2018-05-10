// Reading
import java.io.DataInputStream;
import java.io.FileInputStream;

// Writing
import java.io.FileOutputStream;
import java.io.DataOutputStream;

import java.io.RandomAccessFile;
import java.io.IOException;

public class FileBinaryIO
{
  public static void main(String[] args)
  {
    System.out.println();
    // Spacing

      ////////////////////////
     // Sequential File IO //
    ////////////////////////
    char[] text = {'V', 'i', 'c', 't', 'o', 'r'};

    // Write
    try (DataOutputStream data = new DataOutputStream(new FileOutputStream("file.dat"));)
    {
      for (char i: text) data.writeChar(i);
    } catch (IOException e) {e.printStackTrace();}

    // Read
    try (DataInputStream data = new DataInputStream(new FileInputStream("file.dat"));)
    {
      while (data.available() > 0) System.out.print(data.readChar());
    } catch (IOException e) {e.printStackTrace();}
    System.out.println();

      ///////////////////////////
     // Random Access File IO //
    ///////////////////////////
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

    // Write
    try (RandomAccessFile data = new RandomAccessFile("fileRAF.dat", "rw");)
    {
      for (int i: numbers) data.writeInt(i);
    } catch (IOException e) {e.printStackTrace();}

    // Read
    try (RandomAccessFile data = new RandomAccessFile("fileRAF.dat", "r");)
    {
      long numOfInts = data.length() / 4;
      for (long k = 0; k < numOfInts; k++)
      {
        int number = data.readInt();
        System.out.print(number + " ");
      }
    } catch (IOException e) {e.printStackTrace();}
    System.out.println();

    // Read backwards
    try (RandomAccessFile data = new RandomAccessFile("fileRAF.dat", "r");)
    {
      long numOfInts = data.length() / 4;
      for (long k = numOfInts - 1; k >= 0; k--)
      {
        data.seek(k * 4);
        int number = data.readInt();
        System.out.print(number + " ");
      }
    } catch (IOException e) {e.printStackTrace();}
    System.out.println();

    // Replace at given position
    try (RandomAccessFile data = new RandomAccessFile("fileRAF.dat", "rw");)
    {
      long numOfInts = data.length() / 4;
      int position = 3; // Position could be anything
      data.seek(position * 4);
      data.writeInt(9);
    } catch (IOException e) {e.printStackTrace();}

    // Read from given position
    try (RandomAccessFile data = new RandomAccessFile("fileRAF.dat", "r");)
    {
      long numOfInts = data.length() / 4;
      int position = 2; // Position could be anything
      for (long k = position; k < numOfInts; k++)
      {
        data.seek(k * 4);
        int number = data.readInt();
        System.out.print(number + " ");
      }
    } catch (IOException e) {e.printStackTrace();}

    // Spacing
    System.out.println("\n");
  }
}
