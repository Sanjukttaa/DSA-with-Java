public class ConstructorInJava{
    int a, t;
    ConstructorInJava(){  // default
        System.out.println("It is default contructor..!");
    }
    ConstructorInJava(int a, int b){ // paramer
        this.a=a;
        t=b;
    }
    void show(){
        System.out.println(a);
        System.out.println(t);
    }
    public static void main(String[] args) {
        ConstructorInJava c1=new ConstructorInJava(7,9);
        ConstructorInJava c2=new ConstructorInJava(5, 8);
        c1.show();
        c2.show();
    }
}