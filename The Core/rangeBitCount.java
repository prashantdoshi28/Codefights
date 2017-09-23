int rangeBitCount(int a, int b) {
    int count = 0;
    String s ="";
    for(int i = a ; i <= b; i++){
        s += Integer.toBinaryString(i);
    }
    char[] array = s.toCharArray();
    for(int i = 0 ; i < s.length() ; i++){
        if(array[i] - '0' == 1)
            count++;
    }
    return count;
}
