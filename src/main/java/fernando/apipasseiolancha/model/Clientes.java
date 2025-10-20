package fernando.apipasseiolancha.model;


import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Clientes {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDoCliente ;
    private String emailDoCliente;
    private String numeroDoCliente;
    @OneToMany(mappedBy = "clientes")
    List<Reservas> reservas =  new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getEmailDoCliente() {
        return emailDoCliente;
    }

    public void setEmailDoCliente(String emailDoCliente) {
        this.emailDoCliente = emailDoCliente;
    }

    public String getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public void setNumeroDoCliente(String numeroDoCliente) {
        this.numeroDoCliente = numeroDoCliente;
    }
}
