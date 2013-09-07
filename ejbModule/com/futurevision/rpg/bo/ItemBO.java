package com.futurevision.rpg.bo;

import java.io.Serializable;

import com.futurevision.rpg.bo.inter.ItemBOI;
import com.futurevision.rpg.dao.EntityManagerFactorySingleton;
import com.futurevision.rpg.dao.impl.ItemDAO;
import com.futurevision.rpg.dao.inter.ItemDAOI;
import com.futurevision.rpg.entity.Item;

public class ItemBO implements Serializable, ItemBOI {

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ItemBOI#insertItem(com.futurevision.rpg.entity.Item)
	 */
	@Override
	public void insertItem(Item i) {
		ItemDAOI dao = new ItemDAO();
		dao.insert(i);
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ItemBOI#searchItemById(java.lang.Integer)
	 */
	@Override
	public Item searchItemById(Integer id) {
		ItemDAOI dao = new ItemDAO();
		return dao.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ItemBOI#removeItem(com.futurevision.rpg.entity.Item)
	 */
	@Override
	public void removeItem(Item i) {
		ItemDAOI dao = new ItemDAO();
		dao.remove(i);
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ItemBOI#updateItem(com.futurevision.rpg.entity.Item)
	 */
	@Override
	public void updateItem(Item i) {
		ItemDAOI dao = new ItemDAO();
		dao.update(i);
	}

}
