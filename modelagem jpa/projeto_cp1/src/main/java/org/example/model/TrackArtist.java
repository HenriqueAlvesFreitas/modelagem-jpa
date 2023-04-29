package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TrackArtist")
public class TrackArtist {

    @Id
    private int track_id;

    @Id
    private int artist_id;

    private int featuring_artist_id;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track Track;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist Artist;
}
