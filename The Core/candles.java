int candles(int candlesNumber, int makeNew) {
    int leftovers = candlesNumber;
    int burnt = candlesNumber;
    candlesNumber = 0;
    while(leftovers >= makeNew){
        candlesNumber = leftovers / makeNew;
        burnt += leftovers / makeNew;
        leftovers %= makeNew;
        leftovers += candlesNumber;
        candlesNumber = 0;
    }
    return burnt;
}
