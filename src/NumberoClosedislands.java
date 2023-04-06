public class NumberoClosedislands {
//    1254. Number of Closed Islands
//    Medium
//3.4K
//111
//    Companies
//    Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
//
//    Return the number of closed islands.


    static int closed(int grid[][])
    {int c=0;
        int m=grid.length,n=grid[0].length;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    if(dfs(grid,m,n,i,j))
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
    static boolean dfs(int [][]grid,int m,int n,int i,int j)
    {
        if(i>=m||j>=n||i<0||j<0)
        {
            return false;
        }
        if(grid[i][j]==1||grid[i][j]==-1)
        {
            return true;
        }
        grid[i][j]=-1;
        boolean close=true;
        close&=dfs(grid,m,n,i+1,j);
        close&=dfs(grid,m,n,i-1,j);
        close&=dfs(grid,m,n,i,j+1);
        close&=dfs(grid,m,n,i,j-1);
        return close;
    }

    public static void main(String[] args) {
        int grid[][]={{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        System.out.println(closed(grid));
    }
}
