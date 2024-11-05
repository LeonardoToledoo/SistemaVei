package dominio;

import java.time.LocalDate;

public class SubclasseVeiculo extends BaseDoVeiculo {
    private int codigoClasse;

    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public SubclasseVeiculo() {
        super();
    }

    public SubclasseVeiculo(int codigo , String Marca, String Modelo, int AnoFabricacao, Double Preco, int codigoClasse, LocalDate dataInclusao) {
        super(codigo, Marca, Modelo, AnoFabricacao, Preco, dataInclusao);
        this.codigoClasse = codigoClasse;
    }

}