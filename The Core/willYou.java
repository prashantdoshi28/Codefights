boolean willYou(boolean young, boolean beautiful, boolean loved) {
    boolean flag = false;
    if(loved)
        flag = !young || !beautiful;
    else
        flag = young && beautiful;
    return flag;
}
