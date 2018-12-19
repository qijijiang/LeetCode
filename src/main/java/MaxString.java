import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;

public class MaxString {
    public static void main(String[] args) {
        String s="ababaab!bb";
        int x=maxString(s);
        System.out.println(x);
    }
    public static int maxString(String s){

        if(s==null){
       return  0;
        }else {if(s.equals(" ")){

        }
        else {
        int j=0;
        ArrayList arrayList=new ArrayList();
        int i=0;
       while(i<s.length()){
            if(!arrayList.contains(s.charAt(i))){
                arrayList.add(s.charAt(i));
                i++;
                if(j<arrayList.size()){
                    j=arrayList.size();
                }
            }else{
                if(j<arrayList.size()){
                j=arrayList.size();}
                int temp=arrChar(arrayList,s.charAt(i));
                int m=0;
                while(m<=temp){
                    arrayList.remove(0);
                    m++;
                }
               arrayList.add(s.charAt(i));
                i++;
            }
        }
            System.out.println(arrayList.toString());
        return  j;
            }}
    return  0;}
    public static int arrChar(ArrayList arrayLists,char c){
        for(int i=0;i<arrayLists.size();i++){
            if(c == (Character) arrayLists.get(i)){
                return i;
            }
        }
        return  0;
    }}

