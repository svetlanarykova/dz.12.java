package ru.netology;

public class FilmsManager {
    private int filmLimit = 10;
    private String[] film = new String[0];

    public void addFilm(String films) {
        String[] tmp = new String[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = films;
        film = tmp;
    }

    public FilmsManager() {
    }

    public FilmsManager(int filmLimit) {
        this.filmLimit = filmLimit;

    }

    public String[] findAll() {
        return film;
    }

    public String[] findLast() {
        int result;
        if (film.length < filmLimit) {
            result = film.length;
        } else {
            result = filmLimit;
        }
        String[] List = new String[result];
        for (int i = 0; i < List.length; i++) {
            List[i] = film[film.length - i - 1];
        }
        return List;
    }

}
