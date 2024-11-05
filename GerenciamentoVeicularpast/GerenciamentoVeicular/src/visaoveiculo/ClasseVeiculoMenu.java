package visaoveiculo;

import dominio.ClasseVeiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import servico.ClasseVeiculoServico;

public class ClasseVeiculoMenu extends BaseMenuDoVeiculo {

    private  final ClasseVeiculoServico srv;

    public ClasseVeiculoMenu(){
        super();
        this.srv = new ClasseVeiculoServico();
    }

    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while(opcao != 9){
            ConsoleUtilitarios.LimparConsole();
            System.out.println("|==================================================|");
            System.out.println("|     SISTEMA DE GERENCIAMENTO DE VEÍCULO          |");
            System.out.println("|==================================================|");
            System.out.println("|  Seja bem vindo! Selecione a opcão desejada:     |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 1 - Mostrar todos os veiculos                    |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 2 - Localizar veiculos no sistema                |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 3 - Adicionar veiculos ao sistema                |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 4 - Editar informacoes do veiculo                |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 5 - Remover veiculos do sistema                  |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 9 - Sair das opcões                              |");
            System.err.println("|==================================================|");
            System.out.print("| Selecione uma opção: ");  
            opcao = this.scanner.nextInt();        
            
            switch (opcao) {
                case 1 -> this.Listar();
                case 2 -> this.Localizar();
                case 3 -> this.Adicionar();
                case 4 -> this.Atualizar();
                case 5 -> this.Remover();
                case 9 -> System.out.println("Saindo");
                default -> System.out.println("Opção Inválida");
            }
        }
    }

    @Override
    public void Listar() {
        ConsoleUtilitarios.LimparConsole();
        System.out.println("VEÍCULOS");

        ArrayList<ClasseVeiculo> lista = this.srv.Navegar();
        for (ClasseVeiculo cp : lista) {
            this.ImprimirPorLinha(cp);
        }        

        System.out.println("\nClique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        ConsoleUtilitarios.LimparConsole();
        System.out.println("Localizando");
    
        System.out.print("Informe o código do veículo: ");
        int cod = this.scanner.nextInt();
        ClasseVeiculo cp = this.srv.Ler(cod);
        
        if (cp != null) {
            this.ImprimirPorLinha(cp);
        }
                else{
                System.out.println("\nProblema - Codigo do veiculo nao localizado.");
            }
        System.out.println("\nClique <ENTER> para voltar ao  menu...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        ConsoleUtilitarios.LimparConsole();
        System.out.println(" Adicionando");

        System.out.print("| Informe a marca do veiculo: ");
        String marca = this.scanner.next();
        System.out.print("| Informe o modelo do veiculo: "); 
        String modelo = this.scanner.next();
        System.out.print("| Ano de fabricação: ");
        int Ano = this.scanner.nextInt();
        System.out.print("| Valor atual do veiculo: ");
        Double preco = this.scanner.nextDouble();
        ClasseVeiculo cp = new ClasseVeiculo();

        cp.setMarca (marca);
        cp.setModelo(modelo);
        cp.setAnoFabricacao( Ano);
        cp.setPreco(preco);
        cp.setDataInclusao(LocalDate.now());
        if (this.srv.Adicionar(cp) != null){
            System.out.println("\nNovo veiculo adicionado com sucesso");
        }
        else{
            System.out.println("Problema - Erro ao implementar o veiculo no sistema");
        }


        System.out.println("\nClique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        ConsoleUtilitarios.LimparConsole();
        System.out.println("| Editar informacoes ");

        System.out.print("| Informe o código do veiculo: ");
        int cod = this.scanner.nextInt();

        ClasseVeiculo cp = this.srv.Ler(cod);
        if (cp != null){
            System.out.print("| Informe a marca do veiculo: ");
            String marca = this.scanner.next();
            System.out.print("| Informe o novo modelo do veiculo modificado: "); 
            String modelo = this.scanner.next();
            System.out.print("| Ano de fabricação: ");
            int Ano = this.scanner.nextInt();
            System.out.print("| Valor atual do veiculo: ");
            Double preco = this.scanner.nextDouble();

            cp.setMarca (marca);
            cp.setModelo(modelo);
            cp.setAnoFabricacao( Ano);
            cp.setPreco(preco);
                
            
            if (this.srv.Editar(cp) != null){
                System.out.println("| Alteração realizada com sucesso");
            }
            else{
                System.out.println("| Problema - alteração não foi realizada");
            }
        }
        else{
            System.out.println("| Problema - Veículo não encontrado");
        }

        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        ConsoleUtilitarios.LimparConsole();
        System.out.println("Removendo");

        System.out.print("Informe o código do veículo: ");
        int cod = this.scanner.nextInt();
        ClasseVeiculo cp = this.srv.Ler(cod);
        if (cp != null){
            if (this.srv.Remover(cod) != null){
                System.out.println("Veículo excluido com sucesso");
            }
            else{
                System.out.println("Problema - Codigo do veículo não encontrado!");
            }
        }
        else{
            System.out.println("Problema - Veiculo nao encontrado!");
        }


        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }




    private void ImprimirPorLinha(ClasseVeiculo cp){
        String mensagem = "";
        mensagem += "Código: " + cp.getCodigo() + " | ";
        System.out.println("===============================================");
        mensagem += "Marca: " + cp.getMarca() + " | ";
        mensagem += "Modelo: " + cp.getModelo() + " | ";
        mensagem += "Ano fabricado: " + cp.getAnoFabricacao() + " | ";
        mensagem += "Preco: " + cp.getPreco() + " | ";
        mensagem += "Data de Inclusão: " + cp.getDataInclusao();
        System.out.println(mensagem);
    }    
}