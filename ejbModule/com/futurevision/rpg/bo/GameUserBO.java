package com.futurevision.rpg.bo;

import java.io.Serializable;

import com.futurevision.rpg.bo.inter.GameUserBOI;
import com.futurevision.rpg.entity.GameUser;

public class GameUserBO implements Serializable, GameUserBOI {

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameUserBOI#insertGameUser(com.futurevision.rpg.entity.GameUser)
	 */
	@Override
	public void insertGameUser(GameUser gu) {
		// TODO implementar
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameUserBOI#searchGameUserById(java.lang.Long)
	 */
	@Override
	public GameUser searchGameUserById(Long id) {
		// TODO implementar
		return null;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameUserBOI#removeGameUser(com.futurevision.rpg.entity.GameUser)
	 */
	@Override
	public void removeGameUser(GameUser gu) {
		// TODO implementar
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.GameUserBOI#updateGameUser(com.futurevision.rpg.entity.GameUser)
	 */
	@Override
	public void updateGameUser(GameUser gu) {
		// TODO implementar
	}

}
