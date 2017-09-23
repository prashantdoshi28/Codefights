boolean tennisSet(int score1, int score2) {
    int flag = 0;
    if((score1 == 6 || score2 == 6) && (score1 < 5 || score2 < 5))
        flag = 1;
    else if(score1 == 7 && score1 > 5 && score2 >= 5 && score2 < 7)
        flag = 1;
    else if(score2 == 7 && score2 > 5 && score1 >= 5 && score1 < 7)
        flag = 1;
    else 
        flag = 0;
    if(flag == 1)
        return true;
    else
        return false;
}
