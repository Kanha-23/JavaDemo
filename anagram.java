import java.util.Arrays;

public class anagram {
   
    public static void main(String[] args) {
        String s1="School Master";
        String s2="The Classroom";
        s1=s1.replace(" ", "");
        s2=s2.replace(" ", "");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char ar1[]=s1.toCharArray();
        char ar2[]=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int flag=0;
        for(int i=0;i<=ar1.length-1;i++){
            if(ar1[i]==ar2[i]){
                flag++;
               
            }
            else{
                flag--;
            }

        }
      
        
        if(flag==ar1.length){
            System.out.println("is anagram");
        }
        else{
            System.out.println("not anagram");
        }
}
}
