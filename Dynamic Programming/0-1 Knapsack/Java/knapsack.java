public class Knapsack {
    public int knapsack(int[] val, int[] wt, int n, int w) {

        int[][] dp = new int[n + 1][w + 1];

        // Llenar de ceros la columna j=0
        for(int i = 0; i <= n; ++i) {
            dp[i][0] = 0;
        }

        // Llenar de ceros la fila i=0
        for(int j = 0; j <= w; ++j) {
            dp[0][j] = 0;
        }

        for(int item = 1; item <= n; ++item) { // item i
            for(int capacity = 1; capacity <= w; ++capacity) { // capacity j

                int itemCurr = item - 1;
                // Maximos items acumulado
                int lastMax = dp[item-1][capacity];
                int currMax = 0;

                if(wt[itemCurr] <= capacity) {
                    // Valor del item actual + el mejor item que cabe en la mochila
                    currMax = val[itemCurr] + dp[item - 1][capacity-wt[itemCurr]];
                }
                dp[item][capacity] = Math.max(lastMax, currMax);
            }
        }

        return dp[n][w];
    }

    Integer[][] dp;

    int solve(int[] val, int[] wt, int item, int capacity) {
        if(item <= 0 || capacity <= 0) return 0;

        if(dp[item][capacity] != null) return dp[item][capacity];

        int itemCurr = item - 1;
        // Maximos items acumulado
        int lastMax = solve(val, wt, item-1, capacity);
        int currMax = 0;

        if(wt[itemCurr] <= capacity) {
            // Valor del item actual + el mejor item que cabe en la mochila
            currMax = val[itemCurr] + solve(val, wt, item - 1, capacity-wt[itemCurr]);
        }

        dp[item][capacity] = Math.max(lastMax, currMax);
        return dp[item][capacity];
    }

    public static void main(String[] args) {

        int[] val = {10, 40, 30, 50};
        int[] wt =  {5, 4, 6, 3};
        int n = val.length;
        int w = 10;

        Knapsack ks = new Knapsack();
        System.out.println(ks.knapsack(val, wt, n, w));
        // 90

        ks.dp = new Integer[n+1][w+1];
        System.out.println(ks.solve(val, wt, n, w));
        // 90
    }
}