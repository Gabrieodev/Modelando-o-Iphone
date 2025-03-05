public class Main {
    public static void main (String[] args) {
        Iphone meuIphone = new Iphone("Iphone 15", 256);

        System.out.println("Modelo: " + meuIphone.getModelo());
        System.out.println("Armazenamento: " + meuIphone.getArmazenamento());

        meuIphone.atender("+ 55(11) 94350 - 3438");
        meuIphone.exibirPagina("www.google.com.br");
        meuIphone.adicionarNovaAba("www.mercado.com.br");
        meuIphone.selecionarMusica();
        meuIphone.tocar();
    }
}
