int additionWithoutCarrying(int param1, int param2) {
    int ans = 0;
    int i = 0;
    int sum = 0;
    while(param1>0 || param2 > 0){
        sum = param1%10 + param2%10;
        sum %= 10;
        ans += sum*(int)Math.pow(10,i);
        i++;
        param1 /= 10;
        param2 /= 10;
    }
    return ans;
}
