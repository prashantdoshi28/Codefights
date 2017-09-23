int swapAdjacentBits(int n) {
  return ans(n);
}
int ans(int n){
  char[] s = Integer.toString(n , 2).toCharArray();
  if(s.length % 2 != 0){
    String x = "0" + Integer.toString(n , 2);
    s = x.toCharArray();
  }
  for(int i = 0 ; i < s.length - 1 ; i+=2){
    char t = s[i];
    s[i] = s[i+1];
    s[i+1] = t;
  }
  return Integer.parseInt(new String(s) , 2);
}
