public static boolean isin(BinNode <Integer> t,BinNode <Integer> g){
       if (t==null){
           return true;
       }
       if(g==null){
           return false;
       }
       if(t.hasRight()&&g.hasRight()){
           if(t.hasleft()&&g.hasleft()){
               return isin(t.getright(), g.getright())&&isin(t.getleft(), g.getleft());}
            else{
                return isin(t.getright(), g.getright());
            }
           }
        if(t.hasleft()&&g.hasleft()){
            return isin(t.getleft(), g.getleft());}
       if !(t.hasRight()&&t.hasleft()){
           return true;
       }
       return false;
    }

public static int countNodes(BinNode<Integer> t) {
    if (t == null) {
        return 0;
    }

    int count = 0;

    if (t.hasLeft() && t.hasRight()) {
        BinNode<Integer> left = t.getLeft();
        BinNode<Integer> right = t.getRight();

        if ((left.hasLeft() || left.hasRight()) &&
            (right.hasLeft() || right.hasRight())) {
            count = 1;
        }
    }

    return count
         + countNodes(t.getLeft())
         + countNodes(t.getRight());
}
