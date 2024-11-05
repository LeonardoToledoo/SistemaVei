package visaoveiculo;

import java.util.Scanner;

public abstract class BaseMenuDoVeiculo {
    
    protected Scanner scanner;

    public BaseMenuDoVeiculo(){
        this.scanner = new Scanner(System.in);
    }

    public abstract void ExibirMenu();
    public abstract void Listar();
    public abstract void Localizar();
    public abstract void Adicionar();
    public abstract void Atualizar();
    public abstract void Remover();
}