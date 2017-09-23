int[] removeArrayPart(int[] inputArray, int l, int r) {
    int[] ans = new int[inputArray.length - r + l -1];
    int pos = 0;
    for(int i = 0 ; i < l ; i++){
        ans[pos] = inputArray[i];
        pos++;
    }
    for(int j = r + 1 ; j < inputArray.length ; j++){
        ans[pos] = inputArray[j];
        pos++;
    }
    return ans;
}
