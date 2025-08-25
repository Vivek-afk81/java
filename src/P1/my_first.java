package P1;

public class my_first {
    final public static void main(String[] args) {
        System.out.println("A");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
class aA{
    public static void main(String[] args) {
        System.out.println("Aa data");
        my_first.main(new String[]{"HELLO","A","bye"});
    }
}