public class patterns {
    public static void main(String[] args) {
        int i,j;
        System.out.println("* SQUARE PATTERN *"+ "\n");
        for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= 5; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
        }
        System.out.print("\n"); 
        System.out.println("* RECTANGLE PATTERN *"+ "\n");
        for(i = 1; i <= 5; i++)
		{
			for(j = 1; j < 5; j++)
			{
				System.out.print(" *"); 
			}
			System.out.print("\n"); 
        }
		System.out.print("\n");
		System.out.println("* TRIANGLE PATTERN *"+ "\n");
		for(i=0; i<5; i++)
		{
			for( j =0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		System.out.println("* INVERTED TRIANGLE PATTERN *"+ "\n");
		for(i=5-1; i>=0; i--)
		{
			for (j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
    }
}