 int n = nums.length+2;
    int[] newnums = new int[n];
    for (int i = 0;i < n - 2; i++){
        newnums[i+1] = nums[i];
    }
    newnums[0] = newnums[n - 1] = 1;
    int[][] DP = new int[n][n];
    for (int k = 2; k < n; k++){
        for (int l = 0; l + k < n; l++){
            int h = l + k;
            for (int m = l + 1; m < h; m++){
                DP[l][h] = Math.max(DP[l][h],newnums[l] * newnums[m] * newnums[h] + DP[l][m] + DP[m][h]);
            }
        }
    }
    return DP[0][n - 1];
