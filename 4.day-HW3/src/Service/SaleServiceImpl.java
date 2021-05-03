package Service;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class SaleServiceImpl implements SaleService {
    private final VerificationService verificationService;
    private final UserService userService;
    //Dependency Injection
    public SaleServiceImpl(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }

    @Override
    public void saleWithCampaign(Game game, Player player, Campaign campaign) {
        boolean canBuy=true;
        boolean verification = verificationService.verification(player,userService.getPlayers());
        if (!verification){
            System.out.println("User couldn't login. Please login and try again.");
        }else {
            int playerMoney = player.getOwnMoney();
            int gamePrice = game.getPrice();
            int withDiscountGamePrice = gamePrice - gamePrice * (campaign.getDiscountRate() / 100);
            sale(game, player, canBuy, playerMoney, withDiscountGamePrice);
        }

    }

    @Override
    public void saleWithOutCampaign(Game game, Player player) {
        boolean canBuy=true;
        boolean verification = verificationService.verification(player,userService.getPlayers());
        if (!verification) {
            System.out.println("User couldn't login. Please login and try again.");
        }else {
            int playerMoney = player.getOwnMoney();
            int gamePrice = game.getPrice();
            sale(game, player, canBuy, playerMoney, gamePrice);
        }
    }

    private void sale(Game game, Player player, boolean canBuy, int playerMoney, int gamePrice) {
        int newPlayerMoney= playerMoney-gamePrice;
        if (newPlayerMoney <0){
            System.out.println(player.getName() + " doesn't have enough money to buy "+ game.getName());
            canBuy = false;
        }
        if (canBuy) {
            player.setOwnMoney(newPlayerMoney);
            player.setOwnMoney(newPlayerMoney);
            player.getOwnGames().add(game);
            System.out.println(player.getName() + " bought " + game.getName() + " with $"+gamePrice + " money left : $"+ player.getOwnMoney());
        }
    }
}
