
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class MovieManagerTest {

    @Test
    public void test1 () {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
    }
        @Test
        public void test2 () {
            MovieManager manager = new MovieManager ();

            String[] expected = {};
            String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
        }

    @Test
    public void test3 () {
        MovieManager manager = new MovieManager ();

        manager.add("Film III");

        String[] expected = { "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void test4 () {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

