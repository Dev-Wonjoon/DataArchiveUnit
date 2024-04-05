package com.dataarchiveunit.domain.media;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class MediaItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 128)
    private String fileName;

    @Column(nullable = false)
    private String filePath;

    @Column(nullable = false, length = 8)
    private String fileType;
}
