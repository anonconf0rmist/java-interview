import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExample {

    static void ArrayListExample(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); //1,2,3
        System.out.println(list.get(0)); // index based => 1

        list.set(1, 20); //1,20,3
        System.out.println(list);

        System.out.println(list.contains(20));

    }

    static void LinkedListExample(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); //1,2,3
        System.out.println(list.get(0)); // index based => 1

        list.set(1, 20); //1,20,3
        System.out.println(list);

        System.out.println(list.contains(20));

    }

    static void StackExample(){
        Stack<String> stack = new Stack<>();
        stack.push("tahir");
        stack.push("faiz");
        stack.push("marham");

        System.out.println(stack);
        System.out.println(stack.peek()); // marham
        System.out.println(stack.pop()); // marham
        System.out.println(stack);
        System.out.println(stack.peek()); // faiz
        System.out.println(stack.size()); // 2

    }
    public static void main(String[] args){
        ArrayListExample();
        LinkedListExample();
        StackExample();
    }
}
