public class NumberoClosedislands {
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
