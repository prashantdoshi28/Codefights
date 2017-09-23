int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
    if(weight1 + weight2 <= maxW)
        return value1+value2;
    int flag = 0;
    if(value2 >= value1){
        if(weight2 <= maxW)
            flag = 2;
        else if(weight1 <= maxW)
            flag = 1;
    }
    else{
        if(weight1 <= maxW)
            flag = 1;
        else if(weight2 <= maxW)
            flag = 2;
    }
    if(flag == 1)
        return value1;
    else if(flag == 2)
        return value2;
    else
        return 0;
}
