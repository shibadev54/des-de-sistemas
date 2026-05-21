class Supervisor extends Funcionario {
    private String departamento;

    Supervisor(String nome, int cpf, int registro, String departamento) {
        super(nome, cpf, registro);
        this.departamento = departamento;
    }

    void mostrarSupervisor() {
        mostrarFuncionario();
        System.out.println("Departamento: " + departamento);
    }
}
