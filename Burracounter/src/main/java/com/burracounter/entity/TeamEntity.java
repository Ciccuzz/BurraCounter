package com.burracounter.entity;

import com.burracounter.model.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "team")

public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "teamName", nullable = false, length = Integer.MAX_VALUE)
    private String teamName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private List<PlayerEntity> players;

    @Column(name = "score", nullable = false, length = Integer.MAX_VALUE)
    private int score;
}