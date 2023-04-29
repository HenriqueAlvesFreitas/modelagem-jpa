package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "GenreTrack")
public class GenreTrack {

    @Id
    private int genre_id;
    @Id
    private int track_id;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre Genre;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track Track;


}
