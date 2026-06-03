public class editDistance {
    
    public static int dist(String w1 , String w2){
        int n= w1.length();
        int m = w2.length();
        int[][] dp = new int[n+1][m+1];

        for(int j=0; j < m; j++){
            dp[n][j] = m - j;
        }

        for(int i = 0; i <n; i++){
            dp[i][m] = n - i;
        }

        for(int i = n-1; i>=0; i--){
            for(int j= m-1; j >=0; j--){
                if(w1.charAt(i) == w2.charAt(j)){
                    dp[i][j] = dp[i+1][j+1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i+1][j],
                        Math.min(dp[i][j+1], dp[i+1][j+1])
                    );
                }
            }
        }
        return dp[0][0];
    }
    
    public static void main(String[] args) {
        System.out.println(dist("horse", "ros"));
        System.out.println(dist("intention", "execution"));
    }
}
