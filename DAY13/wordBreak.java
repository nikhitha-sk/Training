public class wordBreak {
   public static boolean breaks(String s , List<String> dit){
        Set<String> dict = new HashSet<>(dit);
        int size = w.length();
        boolean[] dp = new boolean[size+1];
        dp[0] = true;
        
        for(int i = 1; i <= size; i++){
            for(int j=0; j<i; j++){
                String sub = w.substring(j,i);
                if(dp[j] && dict.contains(sub)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[size];
   }
   
   public static void main(String[] args){
    String src = "applepenapple";
    List<String> dict = Arrays.asList("apple","pen");
    System.out.println(breaks(src , dict));
   }
}
