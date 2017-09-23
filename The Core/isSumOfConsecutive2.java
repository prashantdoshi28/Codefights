int isSumOfConsecutive2(int n) {
    int ways = 0;
    int ans = 0;
    for(int i = 1 ; i <= n ; i++){
        ans = 0;
        for(int j = i ; j < n ; j++){
            if(ans > n)
                break;
            if(ans == n)
                ways++;
            ans += j;
        }
    }
    return ways;
}
