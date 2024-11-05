package dominio;

import java.time.LocalDate;

public class ClasseVeiculo extends BaseDoVeiculo {
    
    public ClasseVeiculo(){
        super();
    }

    public ClasseVeiculo(int codigo, String Marca,String Modelo,int AnoFabricacao, Double Preco,LocalDate dataInclusao){
        super(codigo,Marca,Modelo,AnoFabricacao,Preco,dataInclusao);        
    }
}