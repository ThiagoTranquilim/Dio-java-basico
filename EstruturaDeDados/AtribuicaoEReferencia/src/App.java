public class App {
    public static void main(String[] args) throws Exception {

        int intA = 1, intB = intA;

        System.out.println("Int A: " +intA +" Int B: " +intB);

        intA = 2;
        System.out.println("Int A: " +intA +" Int B: " +intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("Obj A: " +objA +" Obj B: " +objB);

        objA.setNum(2);
        System.out.println("Obj A: " +objA +" Obj B: " +objB);
    }
}
