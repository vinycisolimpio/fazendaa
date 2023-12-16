class Gado extends Animal implements AnimalAbate {
    private static final double PRECO_QUILO_ABATE = 5;
    private static final double LIMITE_PESO_ABATE = 300;

    public Gado(int id, double peso, int idade) {
        super(id, peso, idade);
    }

    @Override
    public void alimentar() {
        super.alimentar();
        // Lógica específica para gado após se alimentar
        peso += 10; // Aumento de peso específico para gado
    }

    @Override
    public boolean estaProntoParaAbate() {
        return peso >= LIMITE_PESO_ABATE;
    }

    @Override
    public double calcularPreco() {
        return peso * PRECO_QUILO_ABATE;
    }
}