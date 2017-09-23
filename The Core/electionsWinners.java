int electionsWinners(int[] votes, int k) {
    Arrays.sort(votes);
    int c = 0;
    int max = votes[votes.length - 1];
    for(int i = 0 ; i < votes.length ; i++)
        if(votes[i] + k > max)
            c++;
    if(c == 0 && votes[votes.length - 1] != votes[votes.length - 2])
        return 1;
    return c;
}
