public class Main {
    public static void main(String[] args) {
    int x=1;
    int y=0;
        System.out.println(divideby(x,y));
        System.out.println(dividetry(x,y));
    }
    private static int divideby(int x,int y){
        if(y!=0){
            return x/y;
        }
        else{
            return 0;
        }
    }
    private static int dividetry(int x,int y){
        try {
            return x/y;
        } catch (ArithmeticException e){
            return -1;
        }
        finally {
            System.out.println("Success");
        }
    }
}