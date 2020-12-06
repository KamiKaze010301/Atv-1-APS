
package model;

public class Produto {
    private int cod;
    private String descricao;
    private double valor_compra;
    private double custo;
    private double margem_lucro;
    private int estoque;
    
    public Produto(){}

    public Produto(int cod, String descricao, double valor_compra, double custo, double margem_lucro, int estoque) {
        this.cod = cod;
        this.descricao = descricao;
        this.valor_compra = valor_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.estoque = estoque;
    }

    public Produto(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    
    public Produto(int cod, String descricao, double valor_compra, double custo, double margem_lucro) {
        this.cod = cod;
        this.descricao = descricao;
        this.valor_compra = valor_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargem_lucro() {
        return margem_lucro;
    }

    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    public void compra(int quant){
        this.estoque = estoque + quant;
    }
    
    public void venda(int quant){
        this.estoque = estoque - quant;
    }
    
    public double calculaPrecoVenda(){
        return valor_compra+custo+margem_lucro*(valor_compra+custo);
    }   
}
