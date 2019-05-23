package Model;

/**
 *
 * @author Alexsander Rocha
 */
public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario() {
        nome = "Usuario Teste da Silva";
        email = "usuario@email.com";
        senha = "1234";
    }

    public Usuario(String email, String senha) {
        nome = "Usuario Teste da Silva";
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
