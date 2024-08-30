package com.devsuperior.dsmovie.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_score")
public class Score {

    private Double value;

    @EmbeddedId
    private ScorePK id = new ScorePK();

    public Score() {
    }

    public void setMovie(Movie movie) {
        this.id.setMovie(movie);
    }

    public void setUser(User user) {
        this.id.setUser(user);
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ScorePK getId() {
        return id;
    }
}
