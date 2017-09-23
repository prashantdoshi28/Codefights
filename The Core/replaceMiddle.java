int[] replaceMiddle(int[] arr) {
    int[] a = {0};
    if(arr.length % 2 != 0)
        return arr;
    else if(arr.length % 2 == 0){
        int[] ans = new int[arr.length -1];
        int middle = arr.length / 2 - 1;
        int pos = 0;
        for(int i = 0 ; i < middle ; i++){
            ans[pos] = arr[i];
            pos++;
        }
        ans[pos] = arr[middle] + arr[middle+1];
        pos++;
        for(int i = middle+2 ; i < arr.length ; i++){
            ans[pos] = arr[i];
            pos++;
        }
        return ans;
    }
    else
        return a;
}
