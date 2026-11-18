package model;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    private static final double LIMITE_MAXIMO_SAQUE = 2000.00;
    private static final double LIMITE_MAXIMO_BOLETO = 5000.00;
    private static final double TAXA_CHEQUE_ESPECIAL = 0.20;

    public ContaBancaria(double depositoInicial){
        // Regra de definição do cheque especial aqui
        this.saldo = depositoInicial;

        if(depositoInicial <= 500.00){
            this.chequeEspecial = 50.00;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }

    }

    public boolean estaUsandoChequeEspecial(){
        if(chequeEspecialUsado > 0){
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }


}
