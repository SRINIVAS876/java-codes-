import java.util.*;
class NonRep{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int[] arr={2,3,4,5,6,7,6,6};
Map<Integer,Integer> map=new LinkedHashMap<>();
for(int num:arr){
map.put(num,map.getOrDefault(num,0)+1);
}
List<Integer> non=new ArrayList<>();
for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//if(entry.getValue()>1){
//non.add(entry.getKey());
//}
System.out.println(entry.getKey() + ":" +entry.getValue());
}
//System.out.println(non);
}
}