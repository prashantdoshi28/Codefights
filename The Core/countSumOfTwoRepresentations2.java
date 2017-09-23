int countSumOfTwoRepresentations2(int n, int l, int r) {
    if(l < 1 || l > r)
        return 0; 
    if(l == r && l+r == n)
        return 1;
    if(n > l && n < r)
        return 0;
    int count = 0;
    int add = (l+r)/2;
    int sum = l+r;
    int left = l;
    int right = r;
    while(l <= add && sum <= n){
        left = l;
        sum = left + right;
        while(sum <= n){
            if(left + right == n){
                count++;
                break;
            }
        }
        left++;
        right--;
    }
    return count;
}
