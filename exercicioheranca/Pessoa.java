class Pessoa {
    protected String nome;
    protected int cpf;

    Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void mostrarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
