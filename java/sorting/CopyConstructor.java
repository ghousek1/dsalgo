public class CopyConstructor {
    private static Box boxes[]=new Box[3];
    public static void main(String[] args) {
      boxes[0]=new Box(9,8);
      boxes[1]=new Box(29,28);
      boxes[2]=new Box(39,38);
      test();
      
    }
    public static void test(){
    
    Box dest[]=new Box[3];
    for(int i=0;i<dest.length;i++){
      dest[i]=new Box(boxes[i]);
    }
    }
}

class Box{
  int l;
  int m;
  Box(){
    super();
  }
  Box(int l,int m){
    this.l=l;
    this.m=m;
  }
  Box(Box selfobj){
    this.l=selfobj.l;
    this.m=selfobj.m;
    
}
}

