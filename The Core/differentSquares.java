int differentSquares(int[][] matrix) {
    int flag1 = 0 , first = matrix[0][0];
    for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; j < matrix[0].length ; j++){
            if(matrix[i][j] != first){
                flag1 = 1;
                break;
            }
        }
    }
    if(flag1 == 0 && matrix.length != 1)
        return 1;
    List<int[][]> l = new ArrayList<int[][]>();
    for(int i = 0 ; i < matrix.length - 1 ; i++){
        for(int j = 0 ; j < matrix[0].length - 1 ; j++){
            int[][] al = new int[2][2];
            for(int p = i ; p < i + 2 && p < matrix.length ; p++){
                for(int q = j ; q < j + 2 && q < matrix[0].length ; q++){
                    al[p - i][q - j] = matrix[p][q];
                }
            }
            l.add(al);
        }
    }
    for(int i = 0 ; i < l.size() ; i++){
        int[][] x = (int[][])l.get(i);
        int f = 0;
        for(int j = i + 1 ; j < l.size() ; j++){
            int[][] y = (int[][])l.get(j);
            if(x[0][0] == y[0][0] && x[0][1] == y[0][1] 
               && x[1][0] == y[1][0] && x[1][1] == y[1][1]){
                f = 1;
                l.remove(j);
            }
        }        
    }
    return l.size();
}
