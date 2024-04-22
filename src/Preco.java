public class Preco {
    public static void main(String[] args) {

        double precoOriginal = 19.9;
        double percentualDesconto = 15;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("O preço do produto com desconto de " + percentualDesconto + "% é de R$" + precoComDesconto);


    }
}
