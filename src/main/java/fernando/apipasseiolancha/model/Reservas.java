package fernando.apipasseiolancha.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime  dataReserva;
    Integer numeroDePessosas;

    private String StatusReserva;

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Passeios getPasseios() {
        return passeios;
    }

    public void setPasseios(Passeios passeios) {
        this.passeios = passeios;
    }

    public Integer getNumeroDePessosas() {
        return numeroDePessosas;
    }

    public void setNumeroDePessosas(Integer numeroDePessosas) {
        this.numeroDePessosas = numeroDePessosas;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusReserva() {
        return StatusReserva;
    }

    public void setStatusReserva(String statusReserva) {
        StatusReserva = statusReserva;
    }

    @ManyToOne
    @JoinColumn( name = "clientes_id")
    private Clientes clientes;

    @ManyToOne
    @JoinColumn(name = "passeios_id")
    private Passeios passeios;





}
