package visaoveiculo;

import dominio.ClasseVeiculo;
import java.util.ArrayList;
import servico.ClasseVeiculoServico;

public class ClasseVeiculoVisao {
    //
    //
    //adicionado  ( private final)
   private  final  ClasseVeiculoServico srv;

    public ClasseVeiculoVisao(){
        this.srv = new ClasseVeiculoServico();
    }

    public void Exibir(){
        ArrayList<ClasseVeiculo> lista = this.srv.Navegar();
        System.out.println("===========================================================");
        for (ClasseVeiculo cp : lista) {
            this.Imprimir(cp);
        }
    }

    public void ExibirPorLinha(){
        ArrayList<ClasseVeiculo> lista = this.srv.Navegar();
        System.out.println("===========================================================");
        for (ClasseVeiculo cp : lista) {
            this.ImprimirPorLinha(cp);
        }
    }

    public void Imprimir(ClasseVeiculo cp){
        System.out.println("Vendas::");
        System.out.println("Codigo: " + cp.getCodigo());
        System.out.println("preco: " + cp.getPreco());
        System.out.println("Modelo: " + cp.getModelo());
        System.out.println("Data de Inclusão: " + cp.getDataInclusao());
        System.out.println("--------------------------------------------------------");
    }

    public void ImprimirPorLinha(ClasseVeiculo cp){
        String mensagem = "";
        mensagem += "Vendas: ";
        mensagem += "Codigo:  " + cp.getCodigo() + " | ";
        mensagem += "preco: " + cp.getPreco() + " | ";
        mensagem += "modelo  " + cp.getModelo() + " | ";
        mensagem += "Data de Inclusao: " + cp.getDataInclusao();
        System.out.println(mensagem);
    }

    public void ImprimirPorLinha(int chave){
        ClasseVeiculo cp = this.srv.Ler(chave);
        this.ImprimirPorLinha(cp);
    }


    public void Criar(ClasseVeiculo novo){
        this.srv.Adicionar(novo);
    }

    public void Editar(int chave, ClasseVeiculo alt){
        ClasseVeiculo cp = this.srv.Ler(chave);
        if (cp != null){
            cp.setPreco(alt.getPreco());
        }
        else{
            System.out.println("Item não localizado.");
        }
    }

    public void Remover(int chave){
        ClasseVeiculo cp = this.srv.Ler(chave);
        if (cp != null){
            this.srv.Remover(chave);
        }
        else{
            System.out.println("Item não localizado.");
        }

    }
}