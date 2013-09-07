package com.futurevision.rpg.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.CampaignBOI;
import com.futurevision.rpg.entity.Campaign;

@Stateless
public class CampaignBO implements Serializable, CampaignBOI {

	public List<Campaign> getListCampaign() {
		// TODO implementar

		// Para Testes
		
		List<Campaign> campaigns  = new ArrayList<Campaign>();
		
		for(int i = 0; i< 10; i++ ){
			Campaign c = new Campaign();
			c.setDescription("Description " + i);
			campaigns.add(c);
		}

		return campaigns;
	}

	public void insertCampaign(Campaign c) {
		// TODO implementar
	}

	public Campaign searchCampaignById(Long id) {
		// TODO implementar
		return null;
	}

	public void removeCampaign(Campaign c) {
		// TODO implementar
	}

	public void updateCampaign(Campaign c) {
		// TODO implementar
	}

}
