public class Main {
    public static void main(String[] args) {
        // Fábrica de Carros Elétricos
        FabricaDeCarros fabricaEletrica = new FabricaDeCarrosEletricos();
        Carro carroEletrico = fabricaEletrica.criarCarro();
        carroEletrico.exibirDetalhes();

        // Fábrica de Carros a Gasolina
        FabricaDeCarros fabricaGasolina = new FabricaDeCarrosGasolina();
        Carro carroGasolina = fabricaGasolina.criarCarro();
        carroGasolina.exibirDetalhes();
    }
}
