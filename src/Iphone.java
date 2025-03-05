public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        private String modelo;
        private int armazenamento;

        // Construtor

        public Iphone(String modelo, int armazenamento) {
            this.modelo = modelo;
            this.armazenamento = armazenamento;
        }

        public String getModelo() {
            return modelo;
        }

        public int getArmazenamento() {
            return armazenamento;
        }

        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para " + numero);
        }

        @Override
        public void atender(String numero) {
            System.out.println("Atendendo chamada de " + numero);
        }

        @Override
        public void iniciarCorreioVoz(String mensagem, String destinatario) {
            System.out.println("Você recebeu uma mensagem de " + destinatario);
        }

        @Override
        public void exibirPagina(String url) {
            System.out.println("Acessando o site " + url);
        }

        @Override
        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando nova aba ao site.");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando a pagina.");
        }

        @Override
        public void tocar() {
            System.out.println("Musica tocando...");
        }

        @Override
        public void pausar() {
            System.out.println("Musica pausada.");
        }

        @Override
        public void selecionarMusica() {
            System.out.println("Musica selecionada.");
        }
    }