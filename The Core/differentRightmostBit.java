int differentRightmostBit(int n, int m) {
  return ans(n , m);
}
int ans(int n , int m){
  String s = Integer.toString(n , 2);
  String x = Integer.toString(m , 2);
  if(s.length() < x.length()){
    String t = "";
    while(x.length() - t.length() != s.length())
      t += "0";
    s += t;
  }
    if(s.length() > x.length()){
    String t = "";
    while(s.length() - t.length() != x.length())
      t += "0";
    x += t;
  }
  int c = 0;
  for(int i = s.length() - 1; i >= 0 ; i--){
    if(s.charAt(i) != x.charAt(i))
      return (int)Math.pow(2 , c);
    c++;
  }
  return 0;
}
