package negocio;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;





    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "\nProduto: " +this.nome+ " codigo: " +this.codigo+ ", quantidade: " +this.quantidade+ " unidade(s)";
    }
}
