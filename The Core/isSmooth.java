boolean isSmooth(int[] arr) {
    int middle = arr.length / 2;
    if(arr.length % 2 != 0){
        if(arr[0] == arr[arr.length-1] && arr[0] == arr[middle]){
            return true;
        }
        else
            return false;
    }
    else if(arr.length %  2 == 0){
        if(arr[0] == arr[arr.length-1] && arr[0] == arr[middle-1] + arr[middle])
            return true;
        else
            return false;
    }
    return true;
}
