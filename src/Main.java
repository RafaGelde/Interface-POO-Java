public class Main {
    public static void main(String[] args) {

        Cachorro rex = new Cachorro(4);

        System.out.println(rex.comer());
        System.out.println(rex.dormir());
        System.out.println(rex.amamentar());
        System.out.println(rex.idade);
    }
}