package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AlbumTrack")
public class AlbumTrack {

    @Id
    private int album_id;

    @Id
    private int track_id;



    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album Album;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track Track;
}
