package dominio;

import java.time.LocalDate;

public abstract class BaseDoVeiculo {
    protected int codigo;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected Double preco;
    protected LocalDate dataInclusao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public BaseDoVeiculo() {
    }

    public BaseDoVeiculo(int codigo, String marca, String modelo, int anoFabricacao, double preco, LocalDate dataInclusao) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;  
        this.dataInclusao = dataInclusao;
    }
}
