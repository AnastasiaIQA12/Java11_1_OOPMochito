package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldOut10MoviesFromAllList() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie("1", "https://1", "bladshot", "ActionMovie");
        Movie second = new Movie("2", "https://2", "bladshot", "ActionMovie");
        Movie third = new Movie("3", "https://3", "bladshot", "ActionMovie");
        Movie fourth = new Movie("4", "https://4", "bladshot", "ActionMovie");
        Movie fifth = new Movie("5", "https://5", "bladshot", "ActionMovie");
        Movie sixth = new Movie("6", "https://6", "bladshot", "ActionMovie");
        Movie seventh = new Movie("7", "https://7", "bladshot", "ActionMovie");
        Movie eighth = new Movie("8", "https://8", "bladshot", "ActionMovie");
        Movie ninth = new Movie("9", "https://9", "bladshot", "ActionMovie");
        Movie tenth = new Movie("10", "https://10", "bladshot", "ActionMovie");
        Movie eleventh = new Movie("11", "https://11", "bladshot", "ActionMovie");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldOut5MoviesFromAllList() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie("1", "https://1", "bladshot", "ActionMovie");
        Movie second = new Movie("2", "https://2", "bladshot", "ActionMovie");
        Movie third = new Movie("3", "https://3", "bladshot", "ActionMovie");
        Movie fourth = new Movie("4", "https://4", "bladshot", "ActionMovie");
        Movie fifth = new Movie("5", "https://5", "bladshot", "ActionMovie");
        Movie sixth = new Movie("6", "https://6", "bladshot", "ActionMovie");
        Movie seventh = new Movie("7", "https://7", "bladshot", "ActionMovie");
        Movie eighth = new Movie("8", "https://8", "bladshot", "ActionMovie");
        Movie ninth = new Movie("9", "https://9", "bladshot", "ActionMovie");
        Movie tenth = new Movie("10", "https://10", "bladshot", "ActionMovie");
        Movie eleventh = new Movie("11", "https://11", "bladshot", "ActionMovie");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }
}