package algorithm.dynmicProgramming;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @author liuxiaolei
 */

public class T1 {

    public static void main(String[] args) {
        int [] a=new int[]{1,4,2,6,4,64,32};

        combinationSum(a,1 );

    }

    /**
     * T39
     * @param candidates
     * @param target
     * @return
     */
    public  static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //对数组进行排序
        IntStream sorted = Arrays.stream(candidates).sorted();
        int[] sortedNum = sorted.toArray();
        for (int i : sortedNum) {



        }


        List<List<Integer>> res=new ArrayList<>();




        return null;

    }

    /**
     * t 64
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if ( i==0 && j!=0){
                    grid[i][j]=grid[i][j-1] + grid[i][j] ;
                }else if (i!=0 && j==0){
                    grid[i][j]=grid[i-1][j] + grid[i][j] ;
                }else if (i != 0){
                    grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
                }
            }
        }




        return grid[grid.length-1][grid[0].length-1];
    }
    /**
     * t 70   1 2   2  3
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int p=0;
        int q=0;
        int r=1;
        for (int i = 0; i < n; i++) {
            p=q;
            q=r;
            r=p+q;
        }

        return  r;
    }

}
