public class Cliente {
    private Carteira minhaCarteira;

    public Cliente(Carteira minhaCarteira) {
        this.minhaCarteira = minhaCarteira;
    }

    public Carteira getMinhaCarteira() {
        return this.minhaCarteira;
    }
}
