package Service;

import Entity.Game;
import Entity.Player;

import java.util.Set;

public class UserServiceImpl implements UserService {
    @Override
    public void addPlayer(Player player) {
        System.out.println(player.getName() + " has added to system.");
    }

    @Override
    public void deletePlayer(Player player) {
        System.out.println(player.getName() + " removed from system.");
    }

    @Override
    public void updatePlayer(Player player,int price) {
        player.setOwnMoney(price+player.getOwnMoney());
        System.out.println("$"+price + " has added to " +player.getName()+" new balance is $" + player.getOwnMoney());
    }

    @Override
    public void printOwnedGames(Player player) {
        System.out.println(player.getName()+"'s" + " own games");
        System.out.println("-----------------------------------");
        player.getOwnGames().forEach(Game-> System.out.println(Game.getName()));
        System.out.println("Account balance is $" + player.getOwnMoney());
    }


}
