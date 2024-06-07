package com.leandro.springBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
@Entity
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
private Long id;

    private String nome;
    private String sobrenome;


}
