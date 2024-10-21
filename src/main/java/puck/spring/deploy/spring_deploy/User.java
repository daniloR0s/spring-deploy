package puck.spring.deploy.spring_deploy;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "tab_user")
public class User {
    @Id 
    private String email;

    private String nome;
    private String cargo;
    private String senha;
    private String adm;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getAdm() {
        return adm;
    }
    public void setAdm(String adm) {
        this.adm = adm;
    }

    
    
}
