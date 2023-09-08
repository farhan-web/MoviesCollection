package com.movies.collection.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoviesRequest {

    private Long id;
    @NotNull(message = "Title is Required.")
    @NotEmpty(message = "Title is Required.")
    private String title;
    @NotNull(message = "Director is Required.")
    @NotEmpty(message = "Director is Required.")
    private String director;
    @Size(max = 100, message = "You can't use more than 100 characters.")
    private String summary;
    @NotEmpty(message = "Genres is Required.")
    @NotNull(message = "Genres is Required.")
    private String genres;

}
