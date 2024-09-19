public class Moto extends Veiculo {
    public boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public void empinar(){
        System.out.println("Empinado a moto");
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        System.out.println("Possui carenagem: " + temCarenagem);
    }
}
