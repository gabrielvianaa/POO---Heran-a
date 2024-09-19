public class Carro extends Veiculo{
    private int portas;

    public int getPortas(){
        return portas;
    }
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca,modelo,ano);
        this.portas = portas;

    }

    public void abrirPortMala(){
        System.out.println("Abrindo porta Mala");
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        System.out.println("Portas: " + portas);
    }
}
