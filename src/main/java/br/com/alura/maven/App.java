package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Produto produto = new Produto("Livro", 45);

        System.out.println(produto.getNome() + " R$" + produto.getPreco());
    }
}
