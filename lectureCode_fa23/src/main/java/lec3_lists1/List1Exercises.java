package lec3_lists1;


public class List1Exercises {



  public static void print_IntList(IntList input_List) {

    System.out.println("Begin print list " + input_List);
    for (int i=0; i<input_List.size(); i++){
      System.out.print(input_List.get(i) + " ");
    }
    System.out.println(" ");
    
  }




  /**
   * Returns an IntList identical to L, but with
   * each element incremented by x. L is not allowed
   * to change.
   */
  public static IntList incrList(IntList L, int x) {
    /* Your code here. */

    // 1. 递归版本
    L.first += x;
    if (L.rest != null) {
      L.rest = incrList(L.rest, x);
      return L;
    } else {
      return L;
    }


    // 2.写一个 while 版本的
    // L.first += x;
    // IntList L_reset = L.rest;
    // while (L_reset != null){
    //   L_reset.first += x;
    //   L_reset = L_reset.rest ;
    // }  

    // return L;
    
    
  }

  /**
   * Returns an IntList identical to L, but with
   * each element incremented by x. Not allowed to use
   * the 'new' keyword.
   */
  public static IntList dincrList(IntList L, int x) {

    /* Your code here. */
    return L;
  }

  public static void main(String[] args) {
    IntList L = new IntList(5, null);
    L.rest = new IntList(7, null);
    L.rest.rest = new IntList(9, null);
    print_IntList(L);
    // System.out.println(L.size());
    // System.out.println(L.iterativeSize());

    
    // Test your answers by uncommenting. Or copy and paste the
    // code for incrList and dincrList into IntList.java and
    // run it in the visualizer.
    // System.out.println(L.get(1));
    print_IntList(incrList(L, 3));
    print_IntList(incrList(L, 3));
    // System.out.println(dincrList(L, 3));
  }
}