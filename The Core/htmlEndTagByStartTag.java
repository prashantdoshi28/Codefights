String htmlEndTagByStartTag(String startTag) {
    String[] s = startTag.split(" ");
    String[] s1 = s[0].split("<");
    String s3 = new String();
    if(s1[1].charAt(s1[1].length() -1) != '>')
        s3 = "<" + "/" + s1[1] + ">";
    else
        s3 = "<" + "/" + s1[1];
    return s3;
}

