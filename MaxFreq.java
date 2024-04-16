import java.util.*;
public class MaxFreq {
    public static void main(String[] args) {
        int max=-1;
        int ans=-1;
        int[] arr={1,4,2,5,1,4,4,6,4,6,4,6,6,6,6};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int el:arr){
            if(mp.containsKey(el)){
                mp.put(el, mp.get(el)+1);
            }else{
                mp.put(el,1);
            }
        }
        for(var e: mp.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());

        }
        System.out.print("max Key is = ");
        for(var e: mp.entrySet()){
                    if(e.getValue()>max){
                        max=e.getValue();
                        ans=e.getKey();
                    }
                    
                }
                System.out.println(ans);
    }
}
