int lineUp(String commands) {
    int count = 0;
    int right = -1;
    int left = 1;
    int a = 2;
    int sum = 4;
    for(int i = 0 ; i < commands.length() ; i++){
        if(commands.charAt(i) == 'L')
            sum += left;
        else if(commands.charAt(i) == 'R')
            sum += right;
        else
            sum += a;
        if(sum % 4 == 0 || sum % 2 == 0){
            count++;
            sum = 4;
        }    
    }
    return count;
}
