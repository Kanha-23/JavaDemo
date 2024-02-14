// class encap{
// String name;
// int age;
//     public void show(){
        
//         System.out.println("age is="+age+" and i am " + name);
//     }
// }
// public class encapsulation {

//     public static void main(String[] args){

//         encap obj=new encap();
//         obj.name="kanha";
//         obj.age=21;
//         obj.show();

//     }
    
// }


//to perform encapculation u can make variable private u wont able to access those utill u st their value in a methong and call it before calling needed method


class encap{
private String name;
private int age;

    public void setdata(){
        name="kanha";
        age=21;
    }
    public void show(){
        
        System.out.println("age is="+age+" and i am " + name);
    }
}
public class encapsulation {

    public static void main(String[] args){

        encap obj=new encap();
        obj.setdata();
        // obj.name="kanha";
        // obj.age=21;
        obj.show();

    }
    
}