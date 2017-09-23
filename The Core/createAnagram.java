int createAnagram(String s, String t) {
    int c = 0;
    List<Character> l = new ArrayList<Character>();
    for(int i = 0 ; i < t.length() ; i++)
        l.add(t.charAt(i));
    for(int i = 0 ; i < s.length() ; i++){
        if(l.contains(s.charAt(i))){
            l.remove(new Character(s.charAt(i)));
        }
        else
            c++;
    }
    return c;
}
