int mirrorBits(int a) {
    int ans = 0;
    String s = new String();
    s = Integer.toBinaryString(a);
    for(int i = 0 ; i < s.length() ; i++){
        ans += (int) Math.pow(2 , i) * (s.charAt(i) - '0');
    }
    return ans;
}
