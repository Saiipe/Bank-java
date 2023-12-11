package Usuario;

public class Novoclient {
    public int numberConta;
    public String nome;
    private int senha1;

    private int senha2;

    public int getNumberConta() {
        return numberConta;
    }

    public void setNumberConta(int numberConta) {
        this.numberConta = numberConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha1() {
        return senha1;
    }

    public void setSenha1(int senha1) {
        this.senha1 = senha1;
    }

    public int getSenha2() {
        return senha2;
    }

    public void setSenha2(int senha2) {
        this.senha2 = senha2;
    }

    public boolean confsenha(){
       if (senha1 == senha2){
           return true;
       } else {
           return false;
       }

    }

}