boolean isInfiniteProcess(int a, int b) {
    if(b >= a){
        if(a%2 == b%2)
            return false;
        else
            return true;
    }
    else 
        return true;
}
