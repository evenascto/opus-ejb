package com.futurevision.rpg.bo;

import java.io.Serializable;

import com.futurevision.rpg.bo.inter.CharacterBOI;
import com.futurevision.rpg.dao.impl.CharacterDAO;
import com.futurevision.rpg.dao.inter.CharacterDAOI;
import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.Item;

public class CharacterBO implements Serializable, CharacterBOI {
	private CharacterDAOI characterDao;

	public CharacterBO() {
		characterDao = new CharacterDAO();
	}

	@Override
	public void insertCharacter(Character c) {
		characterDao.insert(c);
	}

	@Override
	public Character searchCharacterById(int id) {
		return characterDao.findById(id);
	}

	@Override
	public void removeCharacter(Character c) {
		if (c == null)
			return;
		characterDao.remove(c);
	}

	@Override
	public void updateCharacter(Character c) {
		if (c == null)
			return;
		characterDao.update(c);
	}

	@Override
	public void dressEquipment(Character c, Item i) {
		if (c == null || i == null) {
			return;
		}
	}

}
