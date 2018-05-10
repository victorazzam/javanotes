public class SortAndSearch
{
	public static void main(String[] args)
	{
		int[] values = {4, 1, 7, 3, 5, 13, 2, 11};
		for (int value: values) System.out.print(value + " ");
		System.out.print("\nBubble:     ");
		bubble(values);
		System.out.print("\nSelection:  ");
		selection(values);
		System.out.print("\nFind 5:     ");
		linearSearch(values, 5);
	}
	public static void bubble(int[] arr) // Ascending bubble sort
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int x = 0; x < arr.length - i-1; x++)
			{
				if (arr[x] > arr[x+1])
				{
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		for (int value: arr) System.out.print(value + " "); // Print sorted array
	}
	public static void selection(int[] arr) // Ascending selection sort
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			int index = i;
			for (int x = i + 1; x < arr.length; x++)
			{
				if (arr[x] < arr[index]) index = x;
			}
			int smaller = arr[index];
			arr[index] = arr[i];
			arr[i] = smaller;
		}
		for (int value: arr) System.out.print(value + " "); // Print sorted array
	}
	public static int linearSearch(int[] arr, int key) // Linear search
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == key)
			{
				System.out.println("found");
				return i;
			}
		}
		System.out.println("not found");
		return -1;
	}
}
