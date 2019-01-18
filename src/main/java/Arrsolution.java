import java.util.*;

public class Arrsolution {
    public static void main(String[] args) {
        Arrsolution arrsolution=new Arrsolution();
        String s="abcde";
        System.out.println(arrsolution.Permutation(s).toString());

    }
        public ArrayList<String> Permutation(String str) {
            ArrayList<String> list=new ArrayList<String>();
            if(str.length()==0){
                return list;
            }
            if(str.length()==1){
                list.add(str);
                return list;
            }

        String[] strs=str.split("");
            Arrays.sort(strs);
            int index=0;

            while(index<strs.length) {
                String[] strss = new String[strs.length];
                for (int x = 0; x < strs.length; x++) {
                    strss[x] = strs[x];
                }
                String[] newStrs = getarr(strss, index);
                int preindex = 0;
                while (preindex < str.length()) {
                    for (int i = 0; i < strs.length ; i++) {
                        if (i == preindex) {
                            continue;
                        }
                        for (int j = 0; j < strs.length; j++) {

                            String[] secondStr = new String[strs.length];
                            for (int x = 0; x < strs.length; x++) {
                                secondStr[x] = newStrs[x];
                            }
                            swap(secondStr, i, j);
                            String x="";
                            if(preindex==0){
                                 x =  secondStr[preindex];
                            }else{
                            x = secondStr[0] + secondStr[preindex];}
                            for (int m = 1; m < secondStr.length; m++) {
                                if (m == preindex) {
                                    continue;
                                }
                                x += secondStr[m];
                            }
                            if (!list.contains(x)) {
                                list.add(x);

                            }

                        }
                    }


                    preindex++;
                }
                index++;
            }
            Collections.sort(list);
            return list;
        }

        public String[] getarr(String[] arr ,int index){
            String temp=arr[index];
            for(int i=index-1;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            return arr;
        }
        public void swap(String[] arr,int i,int j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }

