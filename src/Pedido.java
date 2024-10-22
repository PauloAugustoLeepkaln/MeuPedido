import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numeroPedido;
    public int codigoCliente;
    public double valor;

    public List<ItemPedido> itensPedido;

    public void criarPedido(){

        this.numeroPedido = 1;
        this.valor = 50;
        this.itensPedido = new ArrayList<>();

    }

    public void adicionarItem(int codigo, int quantidade, double valor){

        ItemPedido item = new ItemPedido();
        item.sequenciaItem = this.itensPedido.size() + 1;
        item.codigoItem = 0;
        item.quantidade = 0;
        item.valor = 0;

        //Adiciona o valor total do item no pedido
        this.valor += item.quantidade * item.valor;

        this.itensPedido.add(item);

    }

}
