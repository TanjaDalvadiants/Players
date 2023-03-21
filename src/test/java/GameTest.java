import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameTest {
    @Test
    public void ShouldFindWhenFirstWin() {
        Game game = new Game();
        Player player1 = new Player(1, "Vasya", 20);
        Player player2 = new Player(2, "Petya", 30);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Petya", "Vasya");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldFindWhenNobodyWin() {
        Game game = new Game();
        Player player1 = new Player(1, "Vasya", 20);
        Player player2 = new Player(2, "Petya", 20);

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Petya", "Vasya");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldFindWhenSecondWin() {
        Game game = new Game();
        Player player1 = new Player(1, "Vasya", 30);
        Player player2 = new Player(2, "Petya", 20);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Vasya", "Petya");
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldFindWhenNotExist() {
        Game game = new Game();
        Player player1 = new Player(1, "Vasya", 20);
        Player player2 = new Player(2, "Petya", 30);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Petya", "Vasya");
        Assertions.assertThrows(NotFoundException.class,
                () -> game.round("Ilia", "Vasya")
        );
    }

}
