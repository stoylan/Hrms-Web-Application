package Service;

import Entity.Campaign;

public interface CampaignService {
    void addCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign,int newDiscountRate);
}
