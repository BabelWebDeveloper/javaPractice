package com.BWD.movieLibrary2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//adnotacje Lombokwe zamiast geterów i seterów
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private int id;
    private String name;
    private int rating;
}
