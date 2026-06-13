public class MethodInJava {
    void showMe(){
        System.out.println("No paramater");
    }
    void showYou(String name){
        System.out.println("My Name is "+name);
    }
    void whoAmI(String name, String Addr){
        System.out.println("Name :"+name);
        System.out.println("Address : "+Addr);
    }
    public static void main(String[] args) {
        MethodInJava j=new MethodInJava();
        j.showMe();
        j.showYou("Om");
        j.whoAmI("om prakash", "LPU");
    }
}