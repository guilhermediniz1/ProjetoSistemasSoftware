import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(new Carteira(245.30));
        Cliente c2 = new Cliente(new Carteira(320.80));
        Cliente c3 = new Cliente(new Carteira(5.30));

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        PagamentoService pgtService = new PagamentoService();

        Jornaleiro j = new Jornaleiro(clientes, 7.50, pgtService);

        try {
            j.coletarPagamento();
            System.out.println("Pagamentos coletados com sucesso!");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}