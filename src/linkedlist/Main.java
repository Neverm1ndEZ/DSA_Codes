package linkedlist;

public class Main {
    public static void main(String[] args) {
//        CustomLL list = new CustomLL();
//
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(10);
//        list.insertFirst(13);
//        list.insertLast(99);
//        list.insert(100, 5);
//        list.deleteFirst();
//        list.deleteLast();
//        System.out.println(list.delete(3));
//        list.display();
        DLL list = new DLL();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertFirst(13);

        list.displayRev();
    }
}