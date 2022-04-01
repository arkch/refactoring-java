package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {

  private String title;
  private MovieType type;
}
