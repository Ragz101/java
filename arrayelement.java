import java.util.Scanner;
public class arrayelement {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int x []=new int[n];
        System.out.println("enter 10 elements of the array: ");
        for (int i=0;i<10;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("array entered: ");
        for (int j=0; j<10; j++)
        {
            System.out.print(x[j]+" ");
        }
        System.out.println();
        System.out.println("enter element to search: ");
        int y= sc.nextInt();
        sc.close();
        int k;
        int idx=0;
        for ( k=0; k<10; k++)
        {
            if (x[k]==y){
                System.out.println("element exists at index:"+k);
                idx++;
            }
        }
        if (idx==0)
        System.out.println("element does not exist");
        

    }
    
}
