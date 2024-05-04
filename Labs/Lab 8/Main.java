public int coinChange(int[] coins, int amount) {
    int[] d = new int[amount + 1];
    Arrays.fill(d, amount + 1);
    d[0] = 0;

    for (int a = 1; a <= amount; a++) {
        for (int coin : coins) {
            if (a - coin >= 0) {
                d[a] = Math.min(d[a], 1 + d[a - coin]);
            }
        }
    }

    if (d[amount] != amount + 1) {
      return d[amount];
    } else {
      return -1;
    }
}
