public class FabricaDeCarrosEletricos implements FabricaDeCarros {
    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }
}
