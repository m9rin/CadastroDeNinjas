package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude="missoes")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique=true)
    private String email;

    @Column(name="img_url")
    private String imgUrl;

    @Column(name="classe")
    private String classe;

    private int idade;

    @ManyToOne
    @JoinColumn(name="missao_id")
    private MissaoModel missao;

}
