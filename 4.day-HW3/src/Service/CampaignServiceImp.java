package Service;

import Entity.Campaign;

public class CampaignServiceImp implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("New campaign added. "+ campaign.getContent() + " with %"+ campaign.getDiscountRate() + " discount.");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("The "+ campaign.getContent() + " has been deleted.");
    }

    @Override
    public void updateCampaign(Campaign campaign,int newDiscountRate) {
        campaign.setDiscountRate(newDiscountRate);
        System.out.println("The" + campaign.getContent() + " has been updated"+ " new discount rate is %"+campaign.getDiscountRate());
    }
}
