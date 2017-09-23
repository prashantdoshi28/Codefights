int leastFactorial(int n) {
    int n1 = 1;
    int ans = 1;
    while(ans < n){
        ans = n1 * ans;
        n1++;
    }
    return ans;
}
