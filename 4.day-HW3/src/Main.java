import Entity.Campaign;
import Entity.Game;
import Entity.Player;
import Service.*;

public class Main {
    public static void main(String[] args) {
        VerificationService verificationService = new EdevletVerification();
        CampaignService campaignService = new CampaignServiceImp();
        UserService userService = new UserServiceImpl();
        GameService gameService = new GameServiceImpl();
        SaleService saleService = new SaleServiceImpl(verificationService);

        Player player = new Player(1,1234567890,"Samet","Toylan",1999);

        userService.addPlayer(player);
        if (verificationService.verification(player))
            System.out.println("Succesfuly login system");
        userService.updatePlayer(player,400);

        Game valhalla = new Game(1,"Assassin Creed Valhalla", 2020,150);
        Game cyberpunk= new Game(2,"CyberPunk 2077",2020,140);
        Game csgo = new Game(3,"Cs Go",2012,30);

        gameService.addGame(valhalla);
        gameService.addGame(cyberpunk);
        gameService.addGame(csgo);
        gameService.updateGame(csgo,50);

        Campaign assassinCreedCampaign = new Campaign(1,"Assassin Creed Valhalla",30);
        campaignService.addCampaign(assassinCreedCampaign);
        campaignService.updateCampaign(assassinCreedCampaign,40);

        Campaign csGoCampaign = new Campaign(2,"Counter Strike Global Offensive",50);
        campaignService.addCampaign(csGoCampaign);

        saleService.saleWithCampaign(valhalla,player,assassinCreedCampaign);
        saleService.saleWithCampaign(csgo,player,csGoCampaign);
        saleService.saleWithOutCampaign(cyberpunk,player);

        System.out.println("-------------------------------------------------------------");
        userService.printOwnedGames(player);




    }
}
