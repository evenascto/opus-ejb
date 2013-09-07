package com.futurevision.rpg.dao.inter;

import java.util.List;

import com.futurevision.rpg.entity.Campaign;

public interface CampaignDAOI extends DAOI<Campaign, Integer> {
	
	public List<Campaign> listAll();

}
