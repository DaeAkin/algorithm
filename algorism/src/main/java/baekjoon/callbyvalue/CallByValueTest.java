package baekjoon.callbyvalue;

public class CallByValueTest {

     public static void main(String[] args) {
         Pencil redPencil = new Pencil("Red");
         Pencil yellowPencil = new Pencil("Yellow");
         System.out.println("redPencil : " +redPencil.getColor() +"\nyellowPencil : " +yellowPencil.getColor());
         swap(redPencil,yellowPencil);
         System.out.println("redPencil : " +redPencil.getColor() +"\nyellowPencil : " +yellowPencil.getColor());
         foo(redPencil);
         System.out.println("redPencil : " +redPencil.getColor() +"\nyellowPencil : " +yellowPencil.getColor());
      }

    private static void foo(Pencil pencil) {
        System.out.println(pencil.hashCode());
        pencil.setColor("Pink");
        pencil = new Pencil("Green");
        pencil.setColor("Blue");
    }

    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1=o2;
        o2=temp;
    }
}
