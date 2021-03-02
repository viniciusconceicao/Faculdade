import java.util.Scanner;

public class TesteCarrinho {

    public static void main(String[] args) {


        //Instanciando o Carrinho
        Carrinho carrinho1 = new Carrinho();


        //Criando Scanner
        Scanner input = new Scanner(System.in);


        //Atributos
        Integer inputNumber;


        //Iniciando Print
       do {
           System.out.println(String.format(
                   "\n\n1. Adicionar livro"+
                           "\n2. Adicionar DVD"+
                           "\n3.Adicionar Serviço"+
                           "\n4. Exibir itens do carrinho"+
                           "\n5. Exibir total de vendas"+
                           "\n6. Fim"
           ));

           inputNumber = input.nextInt();

           switch (inputNumber){
               case 1:
                   Integer codigoLivro = 0;
                   String isbn = null;
                   Double precoCustoLivro = 0.0;
                   String nome = null;
                   String autor = null;

                   System.out.println("Informe o código do livro: ");
                   codigoLivro = input.nextInt();

                   System.out.println("Informe o preço do livro:");
                   precoCustoLivro = input.nextDouble();

                   System.out.println("Informe o nome do livro:");
                   nome = input.next();

                   System.out.println("Informe o autor do Livro:");
                   autor = input.next();

                   System.out.println("Informe o ISBN do livro:");
                   isbn = input.next();

                   Livro livro1 = new Livro(codigoLivro, precoCustoLivro, nome, autor, isbn);

                   carrinho1.adicionaVendavel(livro1);

                   break;



               case 2:
                   Integer codigoDVD;
                   Double precoCustoDVD;
                   String nomeDVD;
                   String gravadoraDVD;

                   System.out.println("Informe o código do DVD:");
                   codigoDVD = input.nextInt();

                   System.out.println("Informe o preço de custo do DVD:");
                   precoCustoDVD = input.nextDouble();

                   System.out.println("Informe o nome do DVD:");
                   nomeDVD = input.next();

                   System.out.println("Informe a gravadora do DVD:");
                   gravadoraDVD = input.next();


                   DVD dvd1 = new DVD(codigoDVD, precoCustoDVD, nomeDVD, gravadoraDVD);

                   carrinho1.adicionaVendavel(dvd1);

                   carrinho1.exibeItensCarrinho();

                   break;


               case 3:

                   String descricaoServico = null;
                   Integer codigoServico = 0;
                   Double qtdHorasServico = 0.0;
                   Double valorHoraServico = 0.0;

                   System.out.println("Informe a descrição do serviço:");
                   descricaoServico = input.next();

                   System.out.println("Informe o código do serviço:");
                   codigoServico = input.nextInt();

                   System.out.println("Informe a quantidade de horas trabalhadas:");
                   qtdHorasServico = input.nextDouble();

                   System.out.println("Informe o valor da hora trabalhada:");
                   valorHoraServico = input.nextDouble();

                   Servico s1 = new Servico(descricaoServico, codigoServico, qtdHorasServico, valorHoraServico);

                   carrinho1.adicionaVendavel(s1);

                   break;

               case 4:
                   carrinho1.exibeItensCarrinho();

                   break;

               case 5:
                   System.out.println("R$ "+carrinho1.calculaTotalVenda());

                   break;

           }
       }while (!inputNumber.equals(6));



    }
}
