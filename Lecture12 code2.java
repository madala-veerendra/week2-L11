public class Dpoly {
    int arg = 5;
    Dpoly(){
       System.out.println("Hi! i am default constructor");
}
    Dpoly(int arg){
        this.arg = arg;
    }
    public static void main(String[] args){
        int arg=10;
        Dpoly obj = new Dpoly(10);
        System.out.println(obj.arg);
    }
}
