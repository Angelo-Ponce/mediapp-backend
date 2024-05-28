package com.mitocode.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "user_data")
public class User {

    @Id
    @EqualsAndHashCode.Include
    private Integer idUser;

    @Column(nullable = false, length = 60, unique=true)
    private String username;

    @Column(nullable = false, length = 60) // 123 | Bcrypt
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    // Tabla intermedia se crea user_role
    // FetchType.EAGER = ansioso, alcance más temprano, los traes cargados
    // FetchType.LAZY = tardio o perezoso, no carga los datos relacionados
    // Usar depende del uso
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
    private List<Role> roles;
}
