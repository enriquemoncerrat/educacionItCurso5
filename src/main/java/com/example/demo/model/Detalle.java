package com.example.demo.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(schema = "curso5", name = "detalle")
public class Detalle {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  long id;

    private String clase;

}
