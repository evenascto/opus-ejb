package com.futurevision.rpg.bo;

import java.io.Serializable;

import com.futurevision.rpg.bo.inter.GameBOI;
import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.GameUser;
import com.futurevision.rpg.entity.Item;
import com.futurevision.rpg.entity.ResultCombat;

public class GameBO implements Serializable, GameBOI {

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameBOI#testLuck(com.futurevision.rpg.entity.Character)
	 */
	@Override
	public boolean testLuck(Character c) {
		// TODO implementar
		return false;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameBOI#rollDice(int, int)
	 */
	@Override
	public int rollDice(int side, int qtd) {
		// TODO implementar
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameBOI#combat(com.futurevision.rpg.entity.Character, com.futurevision.rpg.entity.Character)
	 */
	@Override
	public ResultCombat combat(Character char1, Character char2) {
		// TODO implementar
		return null;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameBOI#testAttribute()
	 */
	@Override
	public boolean testAttribute() {
		// TODO implementar
		return false;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameBOI#useItem(com.futurevision.rpg.entity.Item)
	 */
	@Override
	public void useItem(Item item) {
		// TODO implementar
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameBOI#login(com.futurevision.rpg.entity.GameUser)
	 */
	@Override
	public GameUser login(GameUser gu) {
		// TODO implementar
		return null;
	}
	
	

}
