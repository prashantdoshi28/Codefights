int mostFrequentDigitSum(int n) {
    ArrayList al = new ArrayList();
    while(n != 0){
        int sum = 0 , temp = n;
        while(temp > 0){
            sum += temp%10;
            temp /= 10;
        }
        n -= sum;
        al.add(sum);
    }
    Collections.sort(al);
    int maxrep = 0 , maxrepnum = 0;
    for(int i = 0 ; i < al.size() ; i++){
        if(al.lastIndexOf((int)al.get(i))-al.indexOf((int)al.get(i))>maxrep){
            maxrep = al.lastIndexOf((int)al.get(i))-al.indexOf((int)al.get(i));
            maxrepnum = (int)al.get(i);
        }
        if(al.lastIndexOf((int)al.get(i))-al.indexOf((int)al.get(i))==maxrep
           && maxrepnum < (int)al.get(i)){
            maxrep = al.lastIndexOf((int)al.get(i))-al.indexOf((int)al.get(i));
            maxrepnum = (int)al.get(i);
        }
    }
    return maxrepnum;
}
