package fakedb;

import dominio.ClasseVeiculo;
import java.time.LocalDate;
import java.util.ArrayList;

public class ClasseVeiculoFakeDB 
    extends BaseFakeDB<ClasseVeiculo>{

    @Override
    public void preencherDados() {
        this.tabela = new  ArrayList<>();
        
        this.tabela.add(new ClasseVeiculo(1, "Volkswagem","Onix", 2016, 47.999,LocalDate.now()));
        this.tabela.add(new ClasseVeiculo(2, "Ford"," Fiesta",2012, 29.999, LocalDate.now()));
        this.tabela.add(new ClasseVeiculo(3, "Nissan","C4",2020, 72.999, LocalDate.now()));
        this.tabela.add(new ClasseVeiculo(4, "kawasaki","ninja 600",2024, 44.999, LocalDate.now()));
    }    
}