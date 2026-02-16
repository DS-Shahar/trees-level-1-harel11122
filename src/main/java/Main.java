ublic static void ex11a(BinNode<Integer> T)
{
        if (T == null)
            return;
           
        boolean even = T.getValue() % 2 == 0;
        boolean leftOk = !T.hasLeft() || T.getLeft().getValue() % 2 == 0;
        boolean rightOk = !T.hasRight() || T.getRight().getValue() % 2 == 0;
       
        if (even && leftOk && rightOk)
            System.out.println(T.getValue());
           
        ex11a(T.getLeft());
        ex11a(T.getRight());
    }
   
    public static int ex11b(BinNode<Integer> T)
{
        if (T == null)
            return 0;
           
        boolean even = T.getValue() % 2 == 0;
        boolean leftOk = !T.hasLeft() || T.getLeft().getValue() % 2 == 0;
        boolean rightOk = !T.hasRight() || T.getRight().getValue() % 2 == 0;
       
        if (even && leftOk && rightOk)
            return ex11b(T.getLeft()) + ex11b(T.getRight()) + 1;
        else    
            return ex11b(T.getLeft()) + ex11b(T.getRight());
    }
   
    public static boolean ex11c(BinNode<Integer> T)
{
        if (T == null)
            return false;
           
        boolean even = T.getValue() % 2 == 0;
        boolean leftOk = !T.hasLeft() || T.getLeft().getValue() % 2 == 0;
        boolean rightOk = !T.hasRight() || T.getRight().getValue() % 2 == 0;
       
        if (even && leftOk && rightOk)
            return true;
           
        if (ex11c(T.getLeft()) || ex11c(T.getRight()))
            return true;
        else    
            return false;
    }
   
    public static boolean ex11d(BinNode<Integer> T)
{
        if (T == null)
            return true;
           
        boolean even = T.getValue() % 2 == 0;
        boolean leftOk = !T.hasLeft() || T.getLeft().getValue() % 2 == 0;
        boolean rightOk = !T.hasRight() || T.getRight().getValue() % 2 == 0;
       
        if (!(even && leftOk && rightOk))
            return false;
           
        if (!(ex11d(T.getLeft()) || ex11d(T.getRight())))
            return false;
        else    
            return true;
}
//////////////////////////////////////////////////////////////////////////
    public static int ex12(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (10<=T.getValue()&&T.getValue()<100&&T.hasRight()&&T.hasLeft()){
            return ex12(T.getLeft()) + ex12(T.getRight())+1;}
        else{    
            return ex12(T.getLeft()) + ex12(T.getRight());}
    }
///////////////////////////////////////////////////////////////////////////

    public static int ex14(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (!T.hasRight()&&!T.hasLeft()){
            return ex14(T.getLeft()) + ex14(T.getRight())+1;}
        else{    
            return ex14(T.getLeft()) + ex14(T.getRight());}
    }
   
 //////////////////////////////////////////////////////////////////////  
     public static int ex16(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (T.hasRight()&&T.hasLeft()){
            return ex16(T.getLeft()) + ex16(T.getRight())+T.getValue();}
        else{    
            return ex16(T.getLeft()) + ex16(T.getRight());}
    }
   
 ////////////////////////////////////////////////////////////////////  
     public static int ex17(BinNode<Integer> T)
{
        if (T == null)
            return 0;
       
        int Count = 0;

      if (T.hasRight()&&T.hasLeft()){

       boolean leftOk =T.getLeft().hasRight()||T.getLeft().hasLeft();
       boolean rightOk=T.getRight().hasRight()||T.getRight().hasLeft();
       
        if (leftOk&&rightOk){
            Count=1;}}
         
           
    return Count+ex17(T.getLeft()) + ex17(T.getRight());}
   
     ///////////////////////////////////////////////////////////////////  
    public static boolean ex18(BinNode<Integer> T1, BinNode<Integer> T2){
        if(T1==null&&T2==null){
            return true;}
       
         if (T1 == null || T2 == null) {
        return false;}
       
        if(T1.getValue()!=T2.getValue()){
            return false;
    }
    return ex18(T1.getLeft(), T2.getLeft()) && ex18(T1.getRight(), T2.getRight());}
    //////////////////////////////////////////////////////
        public static int count(BinNode<Integer> T,int n) {
    if (T == null)
    return 0;
   
    if(t.getValue()==n)
    return 1 + count(T.getLeft()) + count(T.getRight());
   
    return  count(T.getLeft()) + count(T.getRight());
}

  public static boolean ex20(BinNode<Integer> T,int n) {
      if(n<1)
      return true;
     
      if(count(T,n)!=1)
      return false;
     
     return ex20(T,n-1);}
//////////////////////////////////////////////////////
  public static boolean ex21(BinNode<Integer> T) {
      if(T==null)
         return true;
         
      if(T.hasRight()&&T.hasLeft()){
          if(!(ex27(T.getLeft())-ex27(T.getRight())<=1))
            return false;
      }
     
     return ex21(T.getLeft())&&ex21(T.getRight());}
    ///////////////////////////////////////////////////
       public static boolean ex22(BinNode<Integer> T) {
          if (T == null)
            return true;


        if (T.hasRight()&&!T.hasLeft()||T.hasLeft()&&!T.hasRight()){
            return false;}
        else{    
            return ex22(T.getLeft())&&ex22(T.getRight());}
    }
   
   
    ////////////////////////////////////////////////////
   public static int ex23Max(BinNode<Integer> T) {
    int max = T.getValue();

    if (T.hasLeft()) {
        int leftMax = ex23Max(T.getLeft());
        if (leftMax > max) {
            max = leftMax;
        }
    }

    if (T.hasRight()) {
        int rightMax = ex23Max(T.getRight());
        if (rightMax > max) {
            max = rightMax;
        }
    }

    return max;
}
 
    public static int ex23Min(BinNode<Integer> T) {
    int min = T.getValue();

    if (T.hasLeft()) {
        int leftMin = ex23Min(T.getLeft());
        if (leftMin < min) {
            min = leftMin;
        }
    }

    if (T.hasRight()) {
        int rightMin = ex23Min(T.getRight());
        if (rightMin < min) {
            min = rightMin;
        }
    }

    return min;
}

 public static int ex23(BinNode<Integer> T) {
     if(T==null)
      return 0;
     
      int diff=ex23Max(T)- ex23Min(T);
      return diff;}
 //////////////////////////////////////////////
  public static boolean ex26(BinNode<Integer> T,int n) {
      if(T==null)
      return true;
     
      if(!(ex14(T)==Math.pow(2,n)))
        return false;
       
     return true;}
     
   /////////////////////////////////////////////////
   public static int ex27(BinNode<Integer> T) {
       if(T==null)
      return 0;

   
       int leftHight=ex27(T.getLeft());
       
   

       int rightHight=ex27(T.getRight());
       
   

    return Math.max(leftHight,rightHight)+1;
}
////////////////////////////////////////////////
   
    public static int count(BinNode<Integer> T) {
    if (T == null)
    return 0;
    return 1 + count(T.getLeft()) + count(T.getRight());
}


   public static int sum(BinNode<Integer> T) {
    if (T == null)
    return 0;
    return T.getValue() + sum(T.getLeft()) + sum(T.getRight());
}

   


   
        public static boolean isEven(BinNode<Integer> T)
{
        if (T == null)
            return true;


        if (!T.hasRight()&&!T.hasLeft()&& T.getValue()%2==1){
            return false;}
        else{    
            return isEven(T.getLeft())&&isEven(T.getRight());}
    }
   
   
   
   
   
         public static boolean hasRightSon(BinNode<Integer> T)
{
        if (T == null)
            return true;


        if (T.hasRight()&&!T.hasLeft()){
            return false;}
        else{    
            return hasRightSon(T.getLeft())&&hasRightSon(T.getRight());}
    }
 
   
     
         public static int numNodes(BinNode<Integer> T)
     {
        if (T == null)
            return 0;
       
        else{
            return numNodes(T.getLeft())+numNodes(T.getRight())+1;}
        }
}
public static int count(BinNode<Integer> t) {

    if (t == null)
        return 0;

    if (!t.hasLeft() && !t.hasRight())
        return 0;

    if (t.hasLeft() && t.hasRight()) {
        int x = t.getLeft().getValue();
        int y = t.getRight().getValue();
        int z = x + y;

        if (isPrime(z)) {
            return count(t.getLeft()) + count(t.getRight()) + 1;
        }
    }

    if (t.hasRight() && !t.hasLeft()) {
        int x = t.getRight().getValue();
        if (isPrime(x)) {
            return count(t.getRight()) + 1;
        }
    }

    if (t.hasLeft() && !t.hasRight()) {
        int x = t.getLeft().getValue();
        if (isPrime(x)) {
            return count(t.getLeft()) + 1;
        }
    }

    return count(t.getLeft()) + count(t.getRight());
}

