import java.util.*;

public class romanToInt {
    public static void main(String[] args) {
        String s="MCMD";
       System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s){
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        List<String> list=new ArrayList<String>();
        String[] chars=s.split("");
        int sums=0;
        for(int i=0;i<chars.length-1;i++){
            if(map.get(chars[i])<map.get(chars[i+1])){
                sums=sums-map.get(chars[i]);
            }else{
                sums=sums+map.get(chars[i]);
            }
        }
        sums=sums+map.get(chars[chars.length-1]);
//        Map<String,Integer> map=new HashMap<String, Integer>();
//        String[] key={"M", "D", "C", "L", "X", "V", "I"};
//        int[] values={1000, 500, 100, 50,10, 5, 1};
//        String[] chars=s.split("");
//        for(int i=0;i<key.length;i++){
//            map.put(key[i],i);}
//            int[] temp=new int[chars.length];
//            for(int i=0;i<chars.length;i++){
//                temp[i]=map.get(chars[i]);
//            }
//        List<Integer> list=new ArrayList<Integer>();
//        for(int i=0;i<temp.length-1;i++){
//                if(temp[i]>temp[i+1]){
//                    list.add(temp[i]);
//                }
//        }
//                int sums=0;
//                for(int i=0;i<temp.length;i++){
//
//                    if(i<list.size()){
//                       int  mus=list.get(i);
//                    sums=sums+values[temp[i]]-2*values[mus];}else {
//                        sums=sums+values[temp[i]];
//                    }
//
//        }
        return sums;
    }
}
