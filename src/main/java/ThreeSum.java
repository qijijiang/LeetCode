import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {3,-9,3,9,-6,-1,-2,8,6,-7,-14,-15,-7,5,2,-7,-4,2,-12,-7,-1,-2,1,-15,-13,-4,0,-9,-11,7,4,7,13,14,-7,-8,-1,-2,7,-10,-2,1,-10,6,-9,-1,14,2,-13,9,10,-7,-8,-4,-14,-5,-1,1,1,4,-15,13,-12,13,12,-11,12,-12,2,-3,-7,-14,13,-9,7,-11,5,-1,-2,-1,-7,-7,0,-7,-4,1,3,3,9,11,14,10,1,-13,8,-9,13,-2,-6,1,10,-5,-6,0,1,8,4,13,14,9,-2,-15,-13
};
        List<List<Integer>> x = threeSum(nums);
        System.out.println(x.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ArrList = new ArrayList<List<Integer>>();
        // Set<List<Integer>> set=new Hashset<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
//                        System.out.println(list.toString());
                        if (ArrList.size() == 0) {
                            ArrList.add(list);
                        } else {
                            boolean decide = true;
                            for (int m = 0; m < ArrList.size(); m++) {
                                decide = decide && decideInclude(ArrList.get(m), list);
                            }
                            if (decide) {
                                ArrList.add(list);
                            }
                        }
                    }
                }
            }
        }
        return ArrList;
    }

    public static boolean decideInclude(List<Integer> A, List<Integer> B) {
        Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mapB = new HashMap<Integer, Integer>();
        for (int i = 0; i < B.size(); i++) {
            if (!mapA.containsKey(A.get(i))) {
                mapA.put(A.get(i), 1);
            } else {
                mapA.put(A.get(i), mapA.get(A.get(i)) + 1);
            }

        }
        for (int i = 0; i < B.size(); i++) {
            if (!mapB.containsKey(B.get(i))) {
                mapB.put(B.get(i), 1);
            } else {
                mapB.put(B.get(i), mapB.get(B.get(i)) + 1);
            }

        }
        boolean decide = false;

        for (int i = 0; i < A.size(); i++) {
            if (!mapA.containsKey(B.get(i)) || mapA.get(B.get(i)) != mapB.get(B.get(i))) {
                decide = true;
            }

        }
        return decide;
    }
}