import java.math.BigDecimal;


public class Gerente extends Funcionario{

    public Gerente(String nome, String cargo, String setor, int Horasmês, double salario){
        super(nome, cargo, setor, Horasmês, salario);
    }

    public BigDecimal calculoPLR() {
        return salario * 4;
    }
}

