package com.futurevision.rpg.bo;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.CampaignBOI;
import com.futurevision.rpg.dao.impl.CampaignDAO;
import com.futurevision.rpg.dao.inter.CampaignDAOI;
import com.futurevision.rpg.entity.Campaign;

@Stateless
public class CampaignBO implements Serializable, CampaignBOI {

	private CampaignDAOI campaignDao;

	public CampaignBO() {
		campaignDao = new CampaignDAO();
	}

	public List<Campaign> getListCampaign() {
		return campaignDao.listAll();
	}

	public void insertCampaign(Campaign c) {
		if (c == null) return;
		campaignDao.insert(c);
	}

	public Campaign searchCampaignById(int id) {
		return campaignDao.findById(id);
	}

	public void removeCampaign(Campaign c) {
		campaignDao.remove(c);
	}

	public void updateCampaign(Campaign c) {
		campaignDao.update(c);
	}

}
