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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Short amount;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
