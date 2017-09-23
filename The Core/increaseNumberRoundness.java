boolean increaseNumberRoundness(int n) {
    int concount = 0;
    int number1 = n;
    while(number1 > 0){
        if(number1 % 10 == 0)
            concount++;
        if(number1 % 10 != 0)
            break;
        number1 /= 10;
    }
    int totalcount = 0;
    while(n > 0){
        if(n % 10 == 0)
            totalcount++;
        n /= 10;
    }
    return totalcount > concount;
}
