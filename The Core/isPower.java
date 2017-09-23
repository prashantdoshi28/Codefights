boolean isPower(int n) {
    if(n == 1)
        return true;
    for(int i = 1 ; i < n ; i++){
        for(int j = 2 ; j < n ; j++){
            if((int)Math.pow(i , j) == n)
                return true;
        }
    }
    return false;
}
