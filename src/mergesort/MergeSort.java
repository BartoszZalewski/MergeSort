package mergesort;

import java.util.Scanner;

public class MergeSort{

    public static Scanner input = new Scanner(System.in);
    
    public static void Merge(int[] A,int L,int M,int R,int[] B)
    {   
        for (int i = L; i <= R; i++) 
            B[i] = A[i];
        int i = L;
        int j = M+1; 
        int k = L; 
        while ( i <= M && j <= R ) 
        {
            if ( B[i] <= B[j] )
                A[k++]=B[i++];
            else
                A[k++]=B[j++];
        }
        while ( i <= M )
            A[k++] = B[i++];
    }    
    
    public static void MergeSort(int[] A,int  L,int R,int[] B) 
    {
        if (L < R) 
        {
            int M = ((L+R)/2);
            MergeSort (A, L, M, B);
            MergeSort (A, M+1, R, B);
            Merge (A, L, M, R, B);
        }
    }
    
    public static void main(String[] args) 
    {   
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=input.nextInt();
            int []A=new int[m];
            int []B=new int[m];
            for(int j=0;j<m;j++)
                A[j]=input.nextInt();
            MergeSort(A, 0, A.length-1, B);
            for(int j=0;j<m;j++)
                System.out.println(A[j]);
        }
    }    
}
