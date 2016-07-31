package com.ponikarchuk.controller.builder;

import com.ponikarchuk.model.knight.Knight;

public class Builder {
    private Director director;

    public Builder(Director director) {
        this.director = director;
    }

    /**
     * Build knight by director
     * @return knight after build
     */
    public Knight buildKnight() {
        Knight knight = new Knight();
        director.build(knight);
        return knight;
    }
}
