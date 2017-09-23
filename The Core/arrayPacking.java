int arrayPacking(int[] a) {
    String s = "";
    int count = 0;
    for(int i = 0 ; i < a.length ; i++){
        int data = a[i];
        count = 0;
            while(data > 0)
            {
                s+= Integer.valueOf( data % 2 );
                data /= 2;
                count++;
            }
        while(count != 8){
            s += Integer.valueOf(0);
            count++;
        }
    }
    char[] array = s.toCharArray();
    int ans = 0 , pos = 0;
    int pow = s.length() - 1;
    char[] array1 = new char[array.length];
    for(int i = array.length-1 ; i >= 0 ; i-- ){
        array1[pos] = array[i];
        pos++;
    }
    for(int i = 0; i < s.length(); i++){
        ans += (int)Math.pow(2 , pow) * (array1[i] - '0');
        pow--;
     }
     return ans;
}
