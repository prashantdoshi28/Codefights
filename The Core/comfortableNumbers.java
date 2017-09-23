int comfortableNumbers(int l, int r) {
    HashMap hm = new HashMap();
    
    //Mapping values from a-s(a) to a+s(a) for a number.
    for(int i = l ; i <= r ; i++){
        int sum = 0 , tempvar = i;
        
        while(tempvar != 0){
            sum += tempvar % 10;
            tempvar /= 10;
        }
        
        ArrayList al = new ArrayList();
        
        int pos = 0;
        for(int j = i - sum ; j <= i + sum ; j++){
            if(j != i){
                al.add(j);
                pos++;
            }
        }
        
        hm.put(i,al);
    }
    
    int totalpairs = 0;
    
    //Accessing values and checking if comfortable with each other or not.
    for(int i = l ; i <= r ; i++){
        int key = i;
        
        ArrayList al = new ArrayList();
        
        al = (ArrayList) hm.get(key);
        
        for(int j = 0 ; j < al.size() ; j++){
            if((int)al.get(j) >= l && (int)al.get(j) <= r){
                ArrayList temp = new ArrayList();
                
                temp = (ArrayList) hm.get((int)al.get(j));
                
                if(temp.contains(key))
                    totalpairs++;
            }
        }
    }
    return totalpairs/2;
}
