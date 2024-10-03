public abstract class Animal {

    //Atributos
    int idade;

    Animal(int idade){
        this.idade = idade;
    }

    // Metodos Abstratos
    abstract String comer();
    abstract String dormir();
}
