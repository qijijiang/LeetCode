import java.util.*;
public class MapSoultion {

    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
        public static int MoreThanHalfNum_Solution(int [] array) {
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<array.length;i++){
                if(map.get(array[i])==null){
                    map.put(array[i],1);
                }else{
                    map.put(array[i],map.get(array[i])+1);
                }
            }
            int i=0;
            int index=0;
            for(Map.Entry<Integer,Integer> entry: map.entrySet() ) {
                if (entry.getValue() > i) {
                    i = entry.getValue();
                    index = entry.getKey();
                }
            }
            return index;
        }
    }