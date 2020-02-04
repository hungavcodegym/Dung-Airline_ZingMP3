package com.zingmp3.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class PlayListLike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "playlist_id", referencedColumnName = "id")
    private PlayList playList;

}