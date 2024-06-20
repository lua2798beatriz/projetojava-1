package anabeatrizfreitasStore;

public class Produto {
    //atributos
    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;

    //métodos construtores
    public Produto(String nomeProduto, int quantidadeProduto, double preco) {
        this.nome = nomeProduto;
        this.quantidade = quantidadeProduto;
        this.preco = precoProduto;
    }

    public Produto(String nome, double precoproduto) {
        this.nome = nomeProduto;
        this.preco = precoProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nome = nomeProduto;
    }

    public int getQuantidadeProduto(){
        return quantidadeProduto;
    }

    public void Produto(int quantidade) {
        this.quantidade = Produto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public void setPreco(double precoProduto) {
        this.preco = Produto;
    }
}