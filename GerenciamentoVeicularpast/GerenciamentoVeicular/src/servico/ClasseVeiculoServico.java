package servico;

import dominio.ClasseVeiculo;
import java.util.ArrayList;
import repositorio.ClasseVeiculoRepositorio;

public class ClasseVeiculoServico extends BaseServico<ClasseVeiculo> {

    private final ClasseVeiculoRepositorio repositorio;

    public ClasseVeiculoServico(){
        this.repositorio = new ClasseVeiculoRepositorio();
    }



    @Override
    public ClasseVeiculo Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public ClasseVeiculo Editar(ClasseVeiculo obj) {
        return this.repositorio.Edit(obj);
    }

    @Override
    public ClasseVeiculo Adicionar(ClasseVeiculo obj) {
        return this.repositorio.Add(obj);
    }

    @Override
    public ClasseVeiculo Remover(int chave) {
        return this.repositorio.Delete(chave);
    }

    @Override
    public ArrayList<ClasseVeiculo> Navegar() {
        return this.repositorio.Browse();
    }

}