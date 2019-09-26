import java.util.*;

public class ArrayOfArrayList 
{
	public static void main(String[] args) 
	{
		System.out.println("Array of ArrayList");
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of lines : ");
		int lines = sc.nextInt();
		int createLines = lines+1;
		List[] l = new ArrayList[createLines];
		
		for(int i = 0; i < createLines; i++)
		{
		    l[i] = new ArrayList();
		   // System.out.println("Created List : "+i);
		}
		
		int noOfArrayList = lines;
		for(int i = 0;i <= noOfArrayList; i++) 
		{	
			System.out.println("Line : "+i);
			String str = sc.nextLine();
			String[] strArray = str.split(" ");
			if(i != 0)
			{
				int size = Integer.valueOf(strArray[0]); 
				for(int j= 0; j <= size; j++)
				{ 
					l[i].add(Integer.valueOf(strArray[j]));
					//System.out.println("Added : "+l[i].get(j));
				}
			}
		}
		
		System.out.println("Enter no of Queries : ");
		int queries = sc.nextInt();
		for(int i = 0; i <= queries; i++)
		{
			String input = sc.nextLine();
			String[] inputArray = input.split(" ");
			if(i != 0)
			{
				int line = Integer.valueOf(inputArray[0]);
				int valueAt = Integer.valueOf(inputArray[1]);

				try 
				{
					System.out.println(l[line].get(valueAt));
				} 
				catch (Exception e) 
				{
					System.out.println("ERROR!");
				}
			}
		}
	}
}
