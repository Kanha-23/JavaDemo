class vehical{

    String color;

    void about(){

        color="purple";
        System.out.println(color);

    }
}

class bike extends vehical{



}

public class inheritence {
    public static void main(String[] args) {

        bike b=new bike();                       

        b.about();

    }
}
