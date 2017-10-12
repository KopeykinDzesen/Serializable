public class Main {

    public static void main(String[] args) {

       A a = new A();
       B b = new B();
       C c = new C();
       D d = new D();

       printCheckType(a);
       printCheckType(b);
       printCheckType(c);
       printCheckType(d);

    }

    static <T> boolean checkTypeA(T sometype){
        return sometype instanceof A;
    }

    static <T> boolean checkTypeB(T sometype){
        return sometype instanceof B;
    }

    static <T> boolean checkTypeC(T sometype){
        return sometype instanceof C;
    }

    static <T> boolean checkTypeD(T sometype){
        return sometype instanceof D;
    }

    static <T> void printCheckType(T sometype){
        System.out.println(sometype.getClass() + " instanceof A, B, C, D: " +
                checkTypeA(sometype) + " " +
                checkTypeB(sometype) + " " +
                checkTypeC(sometype) + " " +
                checkTypeD(sometype));
    }

}

class A{}
class B extends A{}
class C extends A{}
class D extends B{}