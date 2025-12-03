@FunctionalInterface
interface Op { int calc(int a,int b); }

class Test {
    public static void main(String[] args) {
        Op add = (a,b)->a+b;
        System.out.println(add.calc(2,3));
    }
}
