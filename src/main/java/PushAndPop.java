import java.util.*;

public class PushAndPop {
    public static void main(String[] args) {
//        int[] popA=new int[]{2,1};
//        int[] pushA={2,1};
        String popA=new String("a");
//        String pushA=new String("a");
        String pushA=popA;
        boolean flag=true;
        popA="s";
//        for(int i=0;i<pushA.length;i++){
//            list.add(popA[i]);
//        }
//        for(int i=0;i<pushA.length;i++){
//            if(!list.contains(pushA[i]))
//                flag=false;
//        }
        System.out.println(pushA);

        System.out.println(popA.equals(pushA));
        System.out.println(popA==pushA);
    }

}
