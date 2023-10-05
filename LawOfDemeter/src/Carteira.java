public class Carteira {
    private double valor;

    public Carteira(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void subtraiValor(double valorSubtrair) throws Exception {
        if(this.valor - valorSubtrair >= 0) {
            this.valor -= valorSubtrair;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }
}
