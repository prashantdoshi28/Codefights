int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    int[] array = new int[inputArray.length];
    for(int i = 0 ;i < inputArray.length ; i++){
        if(inputArray[i] == elemToReplace)
            array[i] = substitutionElem;
        else
            array[i] = inputArray[i];
    }
    return array;
}
