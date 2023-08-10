package br.com.lembretes.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Pessoas {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false, unique = true)
    private Long id;

    @Getter @Setter
    @Column(name = "nome",nullable = false , length = 100)
    private String nome;

    @Getter @Setter
    @OneToMany(mappedBy = "pessoa", fetch = FetchType.EAGER)
    private List<Lembretes> lembretes;






}
