package com.dataarchiveunit.domain.data;

import com.dataarchiveunit.domain.core.BaseTimeStamp;
import com.dataarchiveunit.domain.core.TagAlbumMapping;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Album extends BaseTimeStamp {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String albumName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AlbumType albumType;

    @OneToMany(mappedBy = "album")
    private List<AlbumItem> items;

    @OneToMany(mappedBy = "album")
    private List<TagAlbumMapping> tagAlbumMapping;


}
