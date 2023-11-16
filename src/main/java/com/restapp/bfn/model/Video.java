package com.restapp.bfn.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "TEXT")
    @NotNull(message = "Must not null")
    @NotBlank(message = "Must not blank")
    private String name;
    @Column(name = "description", columnDefinition = "LONGTEXT")
    @NotNull(message = "Must not null")
    @NotBlank(message = "Must not blank")
    private String description;
    @Column(name = "url", columnDefinition = "TEXT")
    @NotNull(message = "Must not null")
    @NotBlank(message = "Must not blank")
    private String url;
    @Column(name = "image", columnDefinition = "TEXT")
    @NotNull(message = "Must not null")
    @NotBlank(message = "Must not blank")
    private String image;

    public Video() {
    }

    public Video(String name, String description, String url, String image) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
