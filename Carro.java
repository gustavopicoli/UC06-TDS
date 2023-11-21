public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto carro sem usar um construtor explícito
        Carro meuCarro = new Carro();

        // Atribuindo valores aos atributos
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Fiesta";
        meuCarro.ano = 2022;
        meuCarro.cor = "Azul";
        meuCarro.ligado = false;

        // Exibindo informações do carro
        meuCarro.exibirInformacoes();
    }
}
