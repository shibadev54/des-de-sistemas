public class Main {
    public static void main(String[] args) {
        int maior = Math.max(10, 25);
        String texto = "java".toUpperCase();
        String numeroEmTexto = String.valueOf(maior);
        System.out.println("Texto formatado: " + texto + " | Maior valor: " + numeroEmTexto);
        Cachorro meuCachorro = new Cachorro("Rex");
        meuCachorro.fazerSom();
        int[] numeros = {2, 8, 15, 4};
        System.out.println("--- Percorrendo o Array ---");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 5) {
                System.out.println("O número " + numeros[i] + " é maior que 5.");
            } else {
                System.out.println("O número " + numeros[i] + " é menor ou igual a 5.");
            }
        }
    }
}
