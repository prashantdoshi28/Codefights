int appleBoxes(int k) {
    int yellow = 0;
    int red = 0;
    for(int i = 1 ; i <= k ; i++){
        if(i % 2 == 0){
            yellow += i * i;
        }
        else
            red += i * i;
    }
    return yellow - red;
}
