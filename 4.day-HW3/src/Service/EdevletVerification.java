package Service;

import Entity.Player;

import java.util.ArrayList;
import java.util.Set;

public class EdevletVerification implements VerificationService {
    @Override
    public boolean verification(Player player, Set<Player> playerSet) {
        Player[] playerArrayList= playerSet.toArray(Player[]::new);
        for (int i=0;i<playerArrayList.length;i++){
            Player searchedPlayer = playerArrayList[i];
            if (player.getName().equals(searchedPlayer.getName())&&player.getBirthDate()==searchedPlayer.getBirthDate() &&
            player.getSurname().equals(searchedPlayer.getSurname())&&player.getTcNo() ==searchedPlayer.getTcNo()){
                return true;
            }
        }
        return false;


    }
}
