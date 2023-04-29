package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Album")
public class Album {
   @Id
   @Column(name = "album_id")
   private int id;
   private String album_name;
   private String album_type;
   private LocalDateTime album_released;
   private LocalDateTime album_recorded;

   @OneToMany(mappedBy = "Album")
   private List<AlbumTrack> AlbumTrack;

   @ManyToOne
   @JoinColumn(name = "artist_id")
   private Artist Artist;

   @ManyToOne
   @JoinColumn(name = "record_label_id")
   private RecordLabel RecordLabel;
}

