public class PagamentoService {
    public void coletarPagamento(Cliente cliente, double valor) throws Exception {
        cliente.getMinhaCarteira().subtraiValor(valor);
    }
}
