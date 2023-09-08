package com.movies.collection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
@Table(name = "tblmovies")
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String director;

    @Column(length = 100)
    private String summary;

    @Column(length = 100)
    private String genres;





}
