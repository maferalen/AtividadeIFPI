public class ProgramaConta {
    public static void main(String[] args) {

        Conta conta = new Conta(123, "Maria Fernanda", 1200);

        System.out.println(conta.getTitular());
        System.out.println(conta.getNumero());
        System.out.println(conta.getSaldo());

        conta.setNumero(456);
        conta.setTitular("Mafe");

        conta.depositar(100);

        System.out.println(conta.getTitular());
        System.out.println(conta.getNumero());
        System.out.println(conta.getSaldo());

        conta.sacar(400);

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}