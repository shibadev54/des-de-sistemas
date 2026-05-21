class Funcionario extends Pessoa {
    protected int registro;

    Funcionario(String nome, int cpf, int registro) {
        super(nome, cpf);
        this.registro = registro;
    }

    void mostrarFuncionario() {
        mostrarPessoa();
        System.out.println("Registro: " + registro);
    }
}
