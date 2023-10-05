import java.util.List;

public class Jornaleiro {
    private List<Cliente> clientes;
    private double totalCobranca;
    private double totalRecebido;
    private PagamentoService pagamentoService;

    public Jornaleiro(List<Cliente> clientes, double totalCobranca, PagamentoService pagamentoService) {
        this.clientes = clientes;
        this.totalCobranca = totalCobranca;
        this.totalRecebido = 0;
        this.pagamentoService = pagamentoService;
    }

    public void coletarPagamento() throws Exception {
        for(Cliente cliente : clientes) {
            pagamentoService.coletarPagamento(cliente, totalCobranca);
        }
    }
}
