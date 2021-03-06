package main.menu;

import model.Seller;

public class Print {

    public static void inicial() {
        // util.Print.title("Menu Inicial");

        System.out.printf(".1  - Area do Gerente de Loja   \n");
        System.out.printf(".2  - Area do Vendedor          \n");
        System.out.printf(".3  - Listar Vendas Realiazadas \n");
        System.out.printf(".4  - Listar Produtos           \n");
        System.out.printf(".5  - Listar Clientes           \n");
        System.out.printf(".6  - Listar Vendedores         \n");
        System.out.printf(".7  - Buscar Produtos           \n");
        System.out.printf(".8  - Buscar Clientes           \n");
        System.out.printf(".9  - Buscar Vendedores         \n");
        System.out.printf(".0  - Sair                      \n");

    }

    /**
     * Option 1 from Incial Menu
     */
    public static void storeManagerActions() {
        // util.Print.title("Area do Gerente de Loja");

        System.out.printf(".1  - Registrar Produto         \n");
        System.out.printf(".2  - Registrar Vendedor        \n");
        System.out.printf(".3  - Atualizar Produto         \n");
        System.out.printf(".4  - Atualizar Vendedor        \n");
        System.out.printf(".5  - Atualizar Gerente         \n");
        System.out.printf(".6  - Deletar Produto           \n");
        System.out.printf(".7  - Deletar Vendedor          \n");
        System.out.printf(".8  - Deletar Cliente           \n");
        System.out.printf(".9  - Listar Vendedores         \n");
        System.out.printf(".10 - Listar Produtos           \n");
        System.out.printf(".11 - Listar Clientes           \n");
        System.out.printf(".0  - Voltar ao Menu Inicial    \n");
    }

    /**
     * Option 2 from Incial Menu
     */
    public static void sellerActions(Seller selected) {
        // util.Print.title("Area do Vendedor");
        System.out.printf("Vendedor Selecionado\n");
        System.out.printf("ID : %d | Nome : %s\n\n", selected.getId(), selected.getName());

        System.out.printf("\t.1 - Registrar Venda        \n");
        System.out.printf("\t.2 - Registrar Cliente      \n");
        System.out.printf("\t.3 - Atualizar Cliente      \n");
        System.out.printf("\t.4 - Listar Clientes        \n");
        System.out.printf("\t.0 - Voltar ao Menu Inicial \n");
    }

    /**
     * Option 3 from Incial Menu
     */
    public static void listSalesOptions() {
        // util.Print.title("Listar Vendas Realiazadas");

        System.out.printf(".1 - Listar Todas as Vendas                    \n");
        System.out.printf(".2 - Listar Vendas Feitas por Vendedor (ID)    \n");
        System.out.printf(".3 - Listar Vendas Feitas por vendedor (Nome)  \n");
        System.out.printf(".0 - Voltar ao Menu Inicial                    \n");
    }
}
