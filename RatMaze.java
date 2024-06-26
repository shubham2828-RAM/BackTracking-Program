package BackTracking;

public class RatMaze {
    public static void main(String[] args) {
        int row = 3;
        int cols = 3;
        int count = maze(1, 1, row, cols);
        System.out.println("The Way rat can move : "+count);

    }

    private static int maze(int sr, int sc, int er, int ec) {
//        base case
        if (sr > er || sc > ec)  return 0;
        if (sr == er && er == ec) return 1;

//        recursion work
        int downWays = maze(sr+1,sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);
        int totalWays = downWays+rightWays;
//        smallproblem
        return totalWays;
    }

}
//Rat Maze by recursion Only 2 Direction allowed
