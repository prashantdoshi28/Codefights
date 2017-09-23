boolean isMAC48Address(String inputString) {
    boolean f = false;
    String[] s1 = inputString.split("-");
    if(inputString.length() < 17 || s1.length != 6 || inputString.length() > 20)
        return false;
    int pos = 1;
    for(int i = 0 ; i < inputString.length() ; i++){
         if(pos % 3 == 0 && inputString.charAt(pos-1) != '-')
            return false;
        pos++;
        
        if((inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'F')
         ||(inputString.charAt(i)-'0' >= 0 && inputString.charAt(i)-'0' <= 9) 
         || inputString.charAt(i) == '-' && 
         inputString.charAt(inputString.length()-1) != '-')
            f = true;
        else
            return false;
    }
    return true;
}
