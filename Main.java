public class Main {

    public static void main(String[] args) {

        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        // Acelerar várias vezes
        for (int i = 0; i < 7; i++) {
            carro.acelerar();
        }

        // Tentar carregar em movimento
        carro.carregarBateria();

        // Frear até parar
        while (carro.getVelocidadeAtual() > 0) {
            carro.frear();
        }

        // Carregar parado
        carro.carregarBateria();

        // Exibir estado final
        System.out.println("\nModelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Bateria: " + carro.getCargaBateria() + "%");
    }
}