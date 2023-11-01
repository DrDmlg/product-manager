package ru.dorokhov.spring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
}
