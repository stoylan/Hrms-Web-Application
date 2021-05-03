package Service;

import Entity.Player;

public class EdevletVerification implements VerificationService {
    @Override
    public boolean verification(Player player) {
        if (player.getName().equals("Samet") && player.getBirthDate() == 1999 && player.getSurname().equals("Toylan")&& player.getTcNo() == (1234567890)){
            return true;
        }else return false;
    }
}
