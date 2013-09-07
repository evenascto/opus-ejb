package com.futurevision.rpg.bo.inter;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.futurevision.rpg.entity.Campaign;

@Local
public interface CampaignBOI {

	public List<Campaign> getListCampaign();

	public void insertCampaign(Campaign c);

	public Campaign searchCampaignById(Long id);

	public void removeCampaign(Campaign c);

	public void updateCampaign(Campaign c);

}
