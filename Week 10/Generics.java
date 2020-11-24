class gen<T, V>{
  T ob1;
  V ob2;
  
  gen(T a, V b){
    ob1=a;
    ob2=b;
  }
  void showtypes(){
    System.out.println("Type of T:"+ob1.getClass().getName());
    System.out.println("Type of V:"+ob2.getClass().getName());
  }
  T getob1(){
    return ob1;
  }
  V getob2(){
    return ob2;
  }
  
}
class genMain{
  public static void main(String ss[]){
    gen<Integer, String> i=new gen<Integer, String>(75,"bms");
    i.showtypes();
    int v= i.getob1();
    System.out.println("value:"+v);
    String str= i.getob2();
    System.out.println("value:"+str);
    
  }
}
