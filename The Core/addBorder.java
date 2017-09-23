String[] addBorder(String[] picture) {
    String[] ans = new String[picture.length + 2];
    Arrays.fill(ans , "");
    int len = picture[0].length() + 2;
    for(int i = 0 ; i < len ; i++)
        ans[0] += '*';
    int pos = 1;
    for(int i = 0 ; i < picture.length ; i++ , pos++)
        ans[pos] = "*" + picture[i] + "*";
    for(int i = 0 ; i < len ; i++)
        ans[pos] += '*';
    return ans;
}
