package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Track")
public class Track {
    @Id

    @Column(name = "track_id")
    private int id;
    private String track_name;

    private String track_length;
    private String track_size;
    private String track_price;
    private String track_language;
    private String track_produce;
    private String track_songwriters;

    private LocalDateTime track_release;

    @OneToMany(mappedBy = "Track")
    private List<AlbumTrack> AlbumTrack;

    @OneToMany(mappedBy = "Track")
    private List<GenreTrack> GenreTrack;

    @OneToMany(mappedBy = "Track")
    private List<TrackArtist> TrackArtist;

    @OneToMany(mappedBy = "Track")
    private List<Purchase> Purchase;
}
