int[] metroCard(int lastNumberOfDays) {
    int ans2[] = new int[1];
    int ans3[] = new int[3]; 
    if(lastNumberOfDays == 28 || lastNumberOfDays == 30){
        ans2[0] = 31;
        return ans2;
    }
    else if(lastNumberOfDays == 31){
        ans3[0] = 28;
        ans3[1] = 30;
        ans3[2] = 31;
        return ans3;
    }
    return ans2;
}
