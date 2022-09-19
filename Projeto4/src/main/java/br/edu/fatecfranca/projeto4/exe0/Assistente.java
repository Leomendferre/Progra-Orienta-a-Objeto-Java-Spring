package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author danielfacciolo
 */
public class Assistente extends Funcionario {
    private float extras;
    private String quemAssiste;

    public Assistente() {
    }

    public Assistente(float extra, String quemAssiste) {
        this.extras = extra;
        this.quemAssiste = quemAssiste;
    }

    public Assistente(float extras, String quemAssiste, int codigo, String nome, String cpf, float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria); // Chama construtor da superclasse
        this.extras = extras;
        this.quemAssiste = quemAssiste;
    }

    public float getExtras() {
        return extras;
    }

    public void setExtras(float extras) {
        this.extras = extras;
    }

    public String getQuemAssiste() {
        return quemAssiste;
    }

    public void setQuemAssiste(String quemAssiste) {
        this.quemAssiste = quemAssiste;
    }

    @Override
    public String toString() {
        return "Assistente{" + "extras=" + extras + ", quemAssiste=" + quemAssiste + 
                super.toString() + '}';
    }
    
    
}
