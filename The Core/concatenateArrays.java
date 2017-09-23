int[] concatenateArrays(int[] a, int[] b) {
    int pos = 0;
    int[] ans = new int[a.length + b.length];
    for(int i = 0 ; i < a.length ; i++){
        ans[pos] = a[i];
        pos++;
    }
    for(int i = 0 ; i < b.length ; i++){
        ans[pos] = b[i];
        pos++;
    }
    return ans;
}
