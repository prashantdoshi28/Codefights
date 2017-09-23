List<String> allLongestStrings(String[] inputArray) {
    List<String> l = new ArrayList();
    int max = inputArray[0].length();
    for(int i = 0 ; i < inputArray.length ; i++){
        if(inputArray[i].length() > max)
            max = inputArray[i].length();
    }
    for(int i = 0 ; i < inputArray.length ; i++){
        if(max == inputArray[i].length())
            l.add(inputArray[i]);
    }
    return l;
}
