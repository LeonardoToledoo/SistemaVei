package repositorio;

import dominio.ClasseVeiculo;
import fakedb.ClasseVeiculoFakeDB;

public class ClasseVeiculoRepositorio extends BaseRepositorio<ClasseVeiculo> {

    private final ClasseVeiculoFakeDB db;

    public ClasseVeiculoRepositorio(){
        this.db = new ClasseVeiculoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public ClasseVeiculo Read(int chave) {
        for (ClasseVeiculo cp : dados) {
            if (chave == cp.getCodigo()){
                return cp;
            }
        }
        return null;
    }

    @Override
    public ClasseVeiculo Edit(ClasseVeiculo instancia) {
        ClasseVeiculo cp = this.Read(instancia.getCodigo());
        if (cp != null){
            cp.setPreco(instancia.getPreco());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseVeiculo Add(ClasseVeiculo instancia) {
        ClasseVeiculo cp = this.dados.getLast();
        int proxChave = cp.getCodigo() + 1;
        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public ClasseVeiculo Delete(int chave) {
        ClasseVeiculo cp = this.Read(chave);
        if (cp != null){
            this.dados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
        
    }
}