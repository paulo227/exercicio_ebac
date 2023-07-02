package br.com.mod07;

public class ExercicioDoc {

    protected int idade;

    protected String nome;


    public void suaIdade(){
        this.setIdade(this.getIdade());
        System.out.println("Você tem: " + idade + " anos");
    }
    public void seuNome(){
        this.setNome(this.getNome());
        System.out.println("Seu nome é: " + nome);
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
