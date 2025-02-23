//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int countRecur(int n, int[] memo) {
        
        // Base Case: invalid n 
        if (n < 0) return 0;
        
        // Base case: valid n 
        if (n == 0) return 1;
        
        // If value is memoized
        if (memo[n] != -1) return memo[n];
        
        int ans = 0;
        
        // count ways if one tile 
        // is placed vertically
        ans = countRecur(n - 1, memo);
        
        // count ways if two tiles 
        // are placed horizontally.
        ans += countRecur(n - 2, memo);
        
        return memo[n] = ans;
    }
    static int numberOfWays(int n) {
        // if(n == 0 || n == 1){
        //     return 1;
        // }
        
        // // vertical choice
        // int fnm1 = numberOfWays(n-1);
        
        // // horizontal choice
        // int fnm2 = numberOfWays(n-2);
        
        // int totWays =  fnm1 + fnm2;
        
        // return totWays;
        
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countRecur(n, memo);
        
        
    }
    
};