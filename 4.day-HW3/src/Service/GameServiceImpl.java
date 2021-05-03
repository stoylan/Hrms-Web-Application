package Service;

import Entity.Game;

public class GameServiceImpl implements GameService {

    @Override
    public void addGame(Game game) {
        System.out.println(game.getName() + "has added to sale with "+ game.getPrice() + "$ price");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getName() + "has deleted.");


    }

    @Override
    public void updateGame(Game game,int price) {
        System.out.println(game.getName() + " price updated $" + price + " to " + game.getPrice());
        game.setPrice(price);
    }
}
