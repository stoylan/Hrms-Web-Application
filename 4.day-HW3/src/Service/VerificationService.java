package Service;

import Entity.Player;

import java.util.Set;

public interface VerificationService {
    public boolean verification(Player player, Set<Player> playerSet);
}
