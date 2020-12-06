
package model;

public class RevendaComArray extends Produto{
    private Produto[] produtos;
    private int indice;
    
    public RevendaComArray(){}
    
    public RevendaComArray(int quant_produtos){
        this.produtos = new Produto[quant_produtos];
    }
    
    public void inserirProduto(Produto p){
        int i;
        for(i=0;i<produtos.length;i++){
            if(produtos[i] == null ) { 
                produtos[i] = p;
                break;
            }
        }
    }

    public void comprar(int cod,int quant){
        int i;
        boolean x = true;
        for(i=0;i<produtos.length;i++){
            if(produtos[i].getCod() == cod){
                produtos[i].compra(quant);
                x=false;
            }
        }
        if(x) System.out.println("Produto não Existe");
    }
    public void vender(int cod,int quant){
        int i;
        boolean x = true;
        for(i=0;i<produtos.length;i++){
            if(produtos[i].getCod() == cod){
                produtos[i].venda(quant);
                x=false;
            }
        }
        if(x) System.out.println("Produto não Existe");
    }
    public void consultaPrecoVenda(int cod){
        int i;
        boolean x = true;
        for(i=0;i<produtos.length;i++){
            if(produtos[i].getCod() == cod){
                System.out.println(produtos[i].calculaPrecoVenda());
                x=false;
            }
        }
        if(x) System.out.println("Produto não Existe");
    }
    public void listaPrecos(){
        int i;
        for(i=0;i<produtos.length;i++){
            System.out.println("cod:"+produtos[i].getCod()+"\n");
            System.out.println("descrição:"+produtos[i].getDescricao()+"\n");
            System.out.println("valor de venda:"+produtos[i].calculaPrecoVenda()+"\n");
        }
    }
}
