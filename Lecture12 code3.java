
class L12C3 {
    L12C3(){
        System.out.println("Constructor");
    }
    L12C3(int num){
        System.out.println(num);
    }
}
public class Test2 extends L12C3{

    Test2(int num) {
        super();
        System.out.println("Constructor of Test2");
    }
    public static void main(String[] args){
        new Test2();
    }
}
