package servico;

import java.util.ArrayList;

public abstract class BaseServico <Tdominio>{
    public abstract ArrayList<Tdominio>Navegar();
    public abstract Tdominio Ler(int chave);
    public abstract Tdominio Editar(Tdominio obj);
    public abstract Tdominio Adicionar(Tdominio obj);
    public abstract Tdominio Remover  (int chave);
}
