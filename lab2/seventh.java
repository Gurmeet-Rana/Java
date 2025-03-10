import java.util.Scanner;
public class seventh {
    static void showMatrix(int mat[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void findSaddlePoint(int mat[][],int m,int n)
    {
        int row=0;
        while(row<m)
        {
            int miniCol=mat[row][0];
            int j=0,c=0;
            while(j<n)
            {
                if(mat[row][j]<miniCol) 
                {
                    miniCol=mat[row][j];
                    c=j;
                }
                j++;
            }
            
            int maxiRow=mat[row][c];

            for(int i=0;i<m;i++)
            {
                if(i==row) continue;
                if(mat[i][c]>maxiRow)
                {
                    maxiRow=mat[i][c];
                }


            }

            if(maxiRow==miniCol)
            {
                System.out.println("Saddle point is : "+maxiRow);
            }

            row++;

        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println(("Enter the size of the matrix : "));
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter the values in the matrix : ");
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        findSaddlePoint(mat,m,n);
        System.out.println("The matrix is :  ");
        showMatrix(mat,m,n);
    }     
}