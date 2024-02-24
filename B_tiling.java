public class B_tiling {

    static int Gateways(int n){
        if(n<=3){
            return n;
        }
        return Gateways(n-1)+Gateways(n-2);
    }

    public static void main(String[] args){
        System.out.println("for n=1     "+ Gateways(1));
        System.out.println("for n=2     "+ Gateways(2));
        System.out.println("for n=3     "+ Gateways(3));
        System.out.println("for n=4     "+ Gateways(4));
        System.out.println("for n=5     "+ Gateways(5));

    }
}
