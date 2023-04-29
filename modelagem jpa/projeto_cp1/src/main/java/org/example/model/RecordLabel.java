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
@Entity(name = "RecordLabel")
public class RecordLabel {
    @Id
    @Column(name ="record_label_id")
    private int id;

    private String record_label_name;

    private String website;

    @OneToMany(mappedBy = "RecordLabel")
    private List<Album> Album;
}
