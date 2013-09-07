package com.futurevision.rpg.bo;

import java.io.Serializable;

import com.futurevision.rpg.bo.inter.CharacterBOI;
import com.futurevision.rpg.entity.Item;

public class CharacterBO implements Serializable, CharacterBOI {

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.CharacterBOI#insertCharacter(java.lang.Character)
	 */
	@Override
	public void insertCharacter(Character c) {
		// TODO implementar
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.CharacterBOI#searchCharacterById(java.lang.Long)
	 */
	@Override
	public Character searchCharacterById(Long id) {
		// TODO implementar
		return null;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.CharacterBOI#removeCharacter(java.lang.Character)
	 */
	@Override
	public void removeCharacter(Character c) {
		// TODO implementar
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.CharacterBOI#updateCharacter(java.lang.Character)
	 */
	@Override
	public void updateCharacter(Character c) {
		// TODO implementar
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.CharacterBOI#dressEquipment(java.lang.Character, com.futurevision.rpg.entity.Item)
	 */
	@Override
	public void dressEquipment(Character c, Item i) {
		// TODO Implementar
	}

}
