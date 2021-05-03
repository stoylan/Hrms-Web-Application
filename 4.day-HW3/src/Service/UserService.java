package Service;

import Entity.Game;
import Entity.Player;

import java.util.HashSet;
import java.util.Set;

public interface UserService {
    Set<Player> players = new HashSet<>();
    void addPlayer(Player player);
    void deletePlayer(Player player);
    void updatePlayer(Player player,int price);
    void printOwnedGames(Player player);
    public Set<Player> getPlayers();
}
