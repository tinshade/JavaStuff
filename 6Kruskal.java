package krushkal;
import java.util.Scanner;
public class Krushkal {
    public static int i,j,k,a,b,u,v,n,ne=1;
    public static int min,mincost=0;
    public static int[][]cost=new int[20][20];
    public static int[] parent=new int[20];
    
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of vertices:");
        n=s.nextInt();
        System.out.println("Enter the cost adjacency matrix:");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=s.nextInt();
                if(cost[i][j]==0)
                {
                    cost[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        System.out.println("the edges of minimum cost spanning tree are");
        while(ne<n)
        {
            min = Integer.MAX_VALUE;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(cost[i][j]<min)
                    {
                        min = cost[i][j];
                        a=u=i;
                        b=v=j;
                    }
                }
            }
            if(v!=u)
            {
                parent[v]=u;
                ne++;
                System.out.println("edge("+a+","+b+")="+ min);
                mincost+=min;
            }
            cost[a][b] = (cost[b][a] = Integer.MAX_VALUE); //why?
        }
        System.out.println("minimum cost=" + mincost);
    }
}
