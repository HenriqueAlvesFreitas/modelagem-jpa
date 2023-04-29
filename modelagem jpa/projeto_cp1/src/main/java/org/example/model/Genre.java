package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Genre")
public class Genre {

    @Id
    @Column(name = "genre_id")
    private int id;

    private String genre_name;

    @OneToMany(mappedBy = "Genre")
    private List<GenreTrack> GenreTrack;
}
