public class permutation1 {

    public static void printp(String str , String t) {
        if(str.equals("")){
            System.out.println(t);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);//b
            String left=str.substring(0, i);//a
            String right=str.substring(i+1);//c
            String rem=left+right;
            printp(rem, t+ch);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        printp(str,"");
    }
}
