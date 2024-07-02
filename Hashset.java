// The main difference between them is that HashSet stores unique elements without any associated values, 
// while HashMap stores key-value pairs where the keys are unique identifiers and the values are associated data.
//  Developers need to choose the appropriate data structure based on the specific needs of their program.

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("kanha the great");
        st.add("Mevada");
        st.add("kanha"); 
        System.out.println(st);
        System.out.println(st.contains("kanha the"));
        System.out.println(st.size());
        st.remove("kanha");
        System.out.println(st.size()); 
        st.add("Yug");
        st.add("Neel");
        //to traverse here we dont need entryset as we only have keys here
        //no value this can directly write it as:
        for(String s:st){
            System.out.println(s);
        }
    }
}
