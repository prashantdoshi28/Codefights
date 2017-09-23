int secondRightmostZeroBit(int n) {
  return ans(n) ;
}
int ans(int n){
  String s = Integer.toString(n , 2);
  int count = 0;
  for(int i = s.length()-1 ; i >= 0 ; i--){
    if(s.charAt(i) == '0' && count == 1)
      return (int)Math.pow(2 , s.length() - i - 1);
    else if(s.charAt(i) == '0')
      count++;
    System.out.println(s.charAt(i) + " " + i);
  }
  return 0;
}
