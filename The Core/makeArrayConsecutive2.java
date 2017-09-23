int makeArrayConsecutive2(int[] sequence) {
    int min = sequence[0];
    int max = sequence[0];
    for(int i = 0 ; i < sequence.length ; i++){
        if(min >= sequence[i])
            min = sequence[i];
        if(max <= sequence[i])
            max = sequence[i];
    }
    int count = 0;
    int flag = 0;
    while(min != max){
        for(int i = 0 ; i < sequence.length ; i++){
            if(min == sequence[i]){
                flag = 0;
                break;
            }
            else if(min != sequence[i])
                flag = 1;
        }
        if(flag == 1)
            count++;
        min++;
    }
    return count;
}
