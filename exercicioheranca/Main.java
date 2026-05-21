public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Julio", 123456);

        Funcionario f = new Funcionario("Carlos", 789101, 55);

        Supervisor s = new Supervisor("Ana", 112233, 99, "TI");

        System.out.println("=== Pessoa ===");
        p.mostrarPessoa();

        System.out.println("\n=== Funcionario ===");
        f.mostrarFuncionario();

        System.out.println("\n=== Supervisor ===");
        s.mostrarSupervisor();
    }
}
