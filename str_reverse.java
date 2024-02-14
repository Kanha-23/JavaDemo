public class str_reverse {
    public static void main(String[] args) {

        //1.....................................................
        // String s="kanha";
        // String s2="";
        // System.out.println(s);
        // System.out.println("reverse of the string is=");
        // for(int i=s.length()-1;i>=0;i--){
        //     s2=s2+s.charAt(i);
        // }
        // System.out.println(s2);
        
        // 2.....................................................
        // String s="kanha mevada";
        // System.out.println(s);
        // String s1[]=s.split(" ");
        // for(int i=s1.length-1;i>=0;i--){
        //     System.out.print(s1[i]+" ");
        // }

        //3.....................................................
        String s="kanha mevada";
        String s2="";
        System.out.println(s);
        String s1[]=s.split(" ");
        for(int i=s1.length-1;i>=0;i--){
            for(int j=s1[i].length()-1;j>=0;j--){
                s2=s2+s1[i].charAt(j);
                
            }
            System.out.print(s2+" ");
            s2="";
        }
        
    }
}
