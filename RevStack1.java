import java.util.*;
class RevStack1{
public static void main(String[] args){
String s="venky";
Stack<Character> stack=new Stack<>();
for(char c:s.toCharArray()){
stack.push(c);
}
StringBuilder res= new StringBuilder();
while(!stack.isEmpty()){
res.append(stack.pop());
}
System.out.println(res.toString());
}
}
