public class FabricaDeCarrosGasolina implements FabricaDeCarros {
    @Override
    public Carro criarCarro() {
        return new CarroGasolina();
    }
}
