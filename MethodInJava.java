public class MethodInJava {

    // no return
    void showMe() {
        System.out.println("No parameter");
    }

    void showYou(String name) {
        System.out.println("My Name is " + name);
    }

    void whoAmI(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age :" + age);
    }

    // with return
    int square() {
        int n = 3;
        return n * n;
    }

    int square2(int n) {
        return n * n;
    }

    int multiple(int n, int m) {
        return n * m;
    }

    public static void main(String[] args) {

        MethodInJava j = new MethodInJava();

        j.showMe();
        j.showYou("Sanjukta");
        j.whoAmI("Sanjukta", 20);

        int t = j.square();
        System.out.println("Result : " + t);

        System.out.println(j.square2(5));
        System.out.println(j.multiple(8, 7));
    }
}