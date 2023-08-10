package br.com.lembretes.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Lembretes {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false, unique = true)
    private Long id;



    @Getter @Setter
    @Column(name = "lembrete",nullable = false , length = 100)
    private String lembrete;

    @Setter
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoas pessoa;











}
