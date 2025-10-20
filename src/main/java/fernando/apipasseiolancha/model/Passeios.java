package fernando.apipasseiolancha.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Passeios {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    BigDecimal preco;
    int capacidade;

    @OneToMany(mappedBy = "passeios")
    List<Reservas> reservas = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservas> reservas) {
        this.reservas = reservas;
    }
}
