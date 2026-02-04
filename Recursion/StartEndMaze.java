public class StartEndMaze {
    public static int maze(char[][] grid) {
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='s'){
                return fun(i,j,grid);
            }
        }
       } 
       return 0;  
    }
    public static int fun(int i,int j,char grid[][]){
        if(i<0 || j<0 || i>=grid.length ||j>=grid[0].length || grid[i][j]=='0'){
            return 0;
        }
        if(grid[i][j]=='e'){
            return 1;
        }
        char temp = grid[i][j];
        grid[i][j]='0';
        grid[i][j] = temp;
        return fun(i-1,j,grid)+fun(i,j-1,grid)+fun(i,j+1,grid)+fun(i+1,j,grid);
    }

    public static void main(String[] args) {
    
       char grid[][]={{'s','1','1','1'},
                     {'1','0','0','1'},
                     {'1','0','1','1'},
                     {'1','1','1','e'}};
        System.out.println(maze(grid));
    }
}

