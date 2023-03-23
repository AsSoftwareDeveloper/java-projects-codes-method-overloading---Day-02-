public class sum {
    void sum (int a , String b){
        System.out.println( a + b);
    }
    void sum ( int x , int y){
        System.out.println( x + y);
    }

    public static void main(String[] args) {
        sum s = new sum();
        s.sum(10, "ashen");
        s.sum(3, 456);
    }
}
