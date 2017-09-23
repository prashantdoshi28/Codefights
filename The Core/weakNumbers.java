int[] weakNumbers(int n) {
    ArrayList divisors = new ArrayList();
    divisors.add(0);
    for(int i = 1 ; i <= n ; i++){
        int tempcount = 0;
        for(int j = 1 ; j <= i ; j++){
            if(i % j == 0)
                tempcount++;
        }
        divisors.add(tempcount);
    }
    ArrayList weakness = new ArrayList();
    for(int i = 1 ; i < divisors.size() ; i++){
        int tempcount = 0;
        for(int j = 1 ; j < i ; j++){
            if((int)divisors.get(j) > (int)divisors.get(i))
                tempcount++;
        }
        weakness.add(tempcount);
    }
    Collections.sort(weakness);
    int[] ans = new int[2];
    ans[0] = (int)weakness.get(weakness.size() - 1);
    ans[1] = 0;
    for(int i = 0 ; i < weakness.size() ; i++){
        if((int)weakness.get(i) == ans[0])
            ans[1]++;
    }
    return ans;
}
