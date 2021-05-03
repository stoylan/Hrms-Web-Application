package Service;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public interface SaleService {
    void saleWithCampaign(Game game, Player player, Campaign campaign);
    void saleWithOutCampaign(Game game, Player player);
}
