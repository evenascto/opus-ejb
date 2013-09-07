package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;

import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.GameUser;
import com.futurevision.rpg.entity.Item;
import com.futurevision.rpg.entity.ResultCombat;
@Local
public interface GameBOI {

	public abstract boolean testLuck(Character c);

	public abstract int rollDice(int side, int qtd);

	public abstract ResultCombat combat(Character char1, Character char2);

	public abstract boolean testAttribute();

	public abstract void useItem(Item item);

	public abstract GameUser login(GameUser gu);

}