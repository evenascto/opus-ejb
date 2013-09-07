package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;

import com.futurevision.rpg.entity.GameUser;
@Local
public interface GameUserBOI {

	public abstract void insertGameUser(GameUser gu);

	public abstract GameUser searchGameUserById(Long id);

	public abstract void removeGameUser(GameUser gu);

	public abstract void updateGameUser(GameUser gu);

}