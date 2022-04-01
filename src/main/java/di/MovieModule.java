package di;

import dagger.Module;
import dagger.Provides;
import dao.MovieRepo;
import javax.inject.Singleton;
import service.RentalService;

@Module
public class MovieModule {

  @Provides
  @Singleton
  public MovieRepo provideMovieRepo() {
    return new MovieRepo();
  }
}
