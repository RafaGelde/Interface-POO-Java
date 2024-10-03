public class Cachorro extends Animal  implements Mamifero{

    Cachorro(int idade) {
        super(idade);
    }
    String comer() {
        return "Estou comendo";
    }
    String dormir() {
        return "Estou dormindo";
    }
    public String  amamentar() {
        return "Estou amamentando";
    }
}
