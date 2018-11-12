package gmail.samonenko.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    public String getChuckNorrisJoke() {
        return (new ChuckNorrisQuotes()).getRandomQuote();
    }

}
