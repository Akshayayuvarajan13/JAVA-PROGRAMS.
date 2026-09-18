
import java.util.ArrayList;
public class StackUsingArrayList {
    ArrayList <Integer> Stack = new ArrayList<>();
    void push(int value){
        Stack.add(value);
        System.out.println(value + "pushed into stack");
    }
    void pop(){
        if(Stack.isEmpty()){
            System.out.println("Stack is empty");
        } else{
            int value = Stack.remove(Stack.size() - 1);
            System.out.println(value + "popped from stack");
        }
    }
    void peek(){
        if(Stack.isEmpty()){
            System.out.println("Stack is empty");
        } else{
            System.out.println("Top element:" + Stack.get(Stack.size() - 1));
        }
    }
    void display(){
        System.out.println("Stack: " + Stack);
    }
    void isEmpty(){
        if(Stack.isEmpty()){
            System.out.println("Stack is empty");
        } else{
            System.out.println("Stack is not empty");
        }
    }
    public static void main(String[] args) {
        StackUsingArrayList s = new StackUsingArrayList();
        s.push(10);
        s.push(20);
        s.display();
        s.peek();
        s.pop();
        s.display();
        s.isEmpty();
    }
}
