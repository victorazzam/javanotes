public class BinarySearchDemo
{
  public static void main(String[] args)
  {
    char[] values = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    for (char i: values) System.out.print(i + " ");
    // Search for value that exists
    System.out.print("\nSearching for e:   ");
    int found = binarySearch(values, 'e');
    if (found < 0) System.out.println("not found");
    else System.out.println("found at index " + found);
    // Search for value that does not exist
    System.out.print("Searching for x:   ");
    int notfound = binarySearch(values, 'x');
    if (notfound < 0) System.out.println("not found");
    else System.out.println("found at index " + notfound);
  }
  public static int binarySearch(char[] data, char key) // Binary search for char type
  {
    int low = 0;
    int high = data.length - 1;
    while (high >= low)
    {
      int middle = (low + high) / 2;
      if (data[middle] == key) return middle;
      if (data[middle] < key) low = middle + 1;
      if (data[middle] > key) high = middle - 1;
    }
    return -1;
  }
}
