package madstodolist.model;

import madstodolist.model.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "contenido")
public class Contenido {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "plan_id", nullable = false)
    private PlanesEntrenamiento plan;

    @Lob
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Lob
    @Column(name = "url", nullable = false)
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlanesEntrenamiento getPlan() {
        return plan;
    }

    public void setPlan(PlanesEntrenamiento plan) {
        this.plan = plan;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}