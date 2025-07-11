import java.util.*;
class RevStack{
public static void main(String[] args){
String s="venky";
Stack<Character> stack = new Stack<>();
        // Push all characters onto the stack
        for (char c : s.toCharArray())
            stack.push(c);
        // Pop characters to form reversed string
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        System.out.println(res.toString());
    }
}