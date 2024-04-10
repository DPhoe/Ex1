package refactored.model.film;

import java.util.ArrayList;
import java.util.Arrays;

public class Film {

    private static int lastID = 0;

    private int id;
    private final String title;

    public MovieType getPriceCode() {
        return priceCode;
    }

    private final Film.MovieType priceCode;

    private ArrayList<String> filmGenre;

    private ArrayList<String> countryOfOrigin;

    private String description;

    private ArrayList<String> directors;

    private ArrayList<String> actors;

    public enum MovieType {
        REGULAR, NEW_RELEASE, CHILDREN, ADULT, DISCOUNT, FREE_WEEKEND
    }

    private Film(String title, Film.MovieType priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        this.id = ++lastID;
    }



    public static class Builder {
        private final String title;
        private final Film.MovieType priceCode;

        private ArrayList<String> filmGenre;

        private ArrayList<String> countryOfOrigin;

        private String description;

        private ArrayList<String> directors;

        private ArrayList<String> actors;

        public Builder(String title, Film.MovieType priceCode) {
            this.title = title;
            this.priceCode = priceCode;
        }

        public Builder filmGenre(String genres) {
            this.filmGenre = addInfo(genres);
            return this;
        }

        public Builder countryOfOrigin(String country) {
            this.countryOfOrigin = addInfo(country);
            return this;
        }

        public Builder directors(String directors) {
            this.directors = addInfo(directors);
            return this;
        }

        public Builder actors(String actors) {
            this.actors = addInfo(actors);
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        private ArrayList<String> addInfo (String info) {
            return new ArrayList<>(Arrays.asList(info.split(",")));
        }


        public Film build () {
            Film film = new Film(title, priceCode);
            film.filmGenre = filmGenre;
            film.countryOfOrigin = countryOfOrigin;
            film.actors = actors;
            film.directors = directors;
            film.description = description;
            return film;
        }
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priceCode=" + priceCode +
                ", filmGenre=" + filmGenre +
                ", countryOfOrigin=" + countryOfOrigin +
                ", description='" + description + '\'' +
                ", directors=" + directors +
                ", actors=" + actors +
                '}';
    }
}
