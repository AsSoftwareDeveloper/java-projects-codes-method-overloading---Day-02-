public class StrIn {
    void display (double a){
        System.out.println("double : ");
    }
    void display (String b){
        System.out.println("String ; ");
    }

    public static void main(String[] args) {
        StrIn si = new StrIn();
        si.display(32.56);
        si.display("ashen");
    }
}
