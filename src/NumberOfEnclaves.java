import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {
   static class Pair{
        int row;
        int col;
        Pair(int r,int c)
        {
            this.row=r;
            this.col=c;
        }
    }
  static int numEnclaves(int[][] grid) {
        int m = grid.length;
        if (m <= 2) return 0;
        int n = grid[0].length;
        if (n <= 2) return 0;

        int [][]visited=new int[m][n];
        Queue<Pair> q=new LinkedList<Pair>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==n-1||j==0||i==m-1){
                    if(grid[i][j]==1)
                    {
                        q.add(new Pair(i,j));
                        visited[i][j]=1;
                    }
                }

            }}


        int dr[]={-1,0,+1,0};
        int dc[]={0,+1,0,-1};
        while(!q.isEmpty())
        {
            Pair it=q.poll();
            int row=it.row;
            int col=it.col;
            for(int i=0;i<4;i++)
            {
                int r=row+dr[i];
                int c=col+dc[i];
                if(r>=0&&c>=0&&r<m&&c<n&&grid[r][c]==1&&visited[r][c]==0)
                {
                    q.add(new Pair(r,c));
                    visited[r][c]=1;

                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1&&visited[i][j]==0)
                {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int grid[][]= {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(grid));
    }

}
