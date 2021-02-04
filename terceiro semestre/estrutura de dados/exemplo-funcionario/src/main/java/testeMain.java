public class testeMain {
    public static void main(String[] args) {
        Engenheiro e1 = new Engenheiro("011","Vinicius", 15000.00 );
        Vendedor v1 = new Vendedor("012", "Celia", 10000.00, 0.70);
        Horista h1 = new Horista("013", "Amandinha", 22, 350.00);

        Empresa em1 = new Empresa();


        System.out.println(e1);
        System.out.println(v1);
        System.out.println(h1);

        em1.addFuncionario(e1);
        em1.addFuncionario(v1);
        em1.addFuncionario(h1);

        em1.exibirTodos();

        em1.exibirTotalSalario();

        em1.exibirHoristas();
    }
}
