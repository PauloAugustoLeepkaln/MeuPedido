public class MainRefactory {

    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();
        novoPedido.criarPedido();

        System.out.println(novoPedido.valor);

        novoPedido.adicionarItem(1,10,20);
        novoPedido.adicionarItem(2,10,20);
        novoPedido.adicionarItem(3,10,20);
        System.out.println("Total pedido :" + novoPedido.valor);



    }

}
