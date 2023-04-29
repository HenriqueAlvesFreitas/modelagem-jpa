package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Artist")
public class Artist {
    @Id
    @Column(name ="artist_id")
    private int id;

    private String artist_name;
    private String artist_type;

    @OneToMany(mappedBy = "Artist")
    private List<Album> Album;

    @OneToMany(mappedBy = "Artist")
    private List<TrackArtist> TrackArtist;


}
