package dominio;

import java.time.LocalDate;

public class Veiculo extends BaseDoVeiculo {
    private int codigoSubclasse;
    private double valor;

    public int getCodigoSubclasse() {
        return codigoSubclasse;
    }

    public void setCodigoSubclasse(int codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Default constructor
    public Veiculo() {
        super();
    }

    // Parameterized constructor
    public Veiculo(int codigo, String marca, String modelo, int anoFabricacao, Double preco, LocalDate dataInclusao, int codigoSubclasse, double valor) {
        super(codigo, marca, modelo, anoFabricacao, preco, dataInclusao);
        this.codigoSubclasse = codigoSubclasse;  
        this.valor = valor;                      
    }
}
