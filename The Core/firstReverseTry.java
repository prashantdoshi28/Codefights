int[] firstReverseTry(int[] arr) {
    int temp = 0;
    if(arr.length == 0 || arr.length == 1)
        return arr;
    temp = arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1] = temp;
    return arr;
}
