interface A { default void show(){ System.out.println("A"); } }
interface B { default void show(){ System.out.println("B"); } }

class Demo implements A, B {
    public void show() { System.out.println("Solved"); }
}
