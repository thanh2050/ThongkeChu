import java.util.*;
import java.lang.*;
import java.io.*;
public class ThongkeChu {
        public static void main(String[] args){
                System.out.println("Thống kê tần số xuất hiện của 1 chữ trong câu.");
                Scanner sc= new Scanner(System.in);
                String s=sc.nextLine();
                System.out.println(s);
                String [] arr=s.split("\\s+");

                Map<String,Integer> map=new HashMap<String,Integer>();
                for(String x: arr){
                        if(map.containsKey(x)){
                                map.put(x,map.get(x)+1);
                        }else{
                                map.put(x,1);
                        }
                }
                for(Map.Entry<String,Integer> entry: map.entrySet()){
                        System.out.println(entry.getKey()+" "+entry.getValue());
                }
        };
}