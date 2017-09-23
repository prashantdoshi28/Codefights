int equalPairOfBits(int n, int m) {
  return ans(n , m);
}
int ans(int n , int m){
  StringBuffer s = new StringBuffer(Integer.toString(n , 2));
  StringBuffer x = new StringBuffer(Integer.toString(m , 2));
  s.reverse();
  x.reverse();
  if(s.length() < x.length()){
    while(s.length() != x.length())
      s.append('0');
  }
  if(s.length() > x.length()){
    while(s.length() != x.length())
      x.append('0');
  }
  int f = 0;
  for(int i = 0 ; i < s.length() && i < x.length() ; i++){
    if(s.charAt(i) == x.charAt(i))
      return (int)Math.pow(2 , i);
  }
  return 0;
}
