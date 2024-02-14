public class string {
    public static void main(String[] args){

        String st= "kanha";
        System.out.println(st);
        st.concat(" Mevada");
        System.out.println(st);//immutable ....

        StringBuffer sb= new StringBuffer("Kanha");
        System.out.println(sb);
        sb.append(" Mevada");
        System.out.println(sb);//mutuble....similar for string builder
    }
}
