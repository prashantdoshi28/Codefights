int lateRide(int n) {
    int hour = 0;
    int min = 0;
    if(n%60 == 0)
        hour = n/60;
    else{
        min = n%60;
        hour = n/60;
    }
    return min % 10 + min / 10 + hour % 10 + hour / 10;
}
