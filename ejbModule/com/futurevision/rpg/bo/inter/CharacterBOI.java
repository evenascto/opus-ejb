package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;

import com.futurevision.rpg.entity.Item;

@Local
public interface CharacterBOI {

	public abstract void insertCharacter(Character c);

	public abstract Character searchCharacterById(Long id);

	public abstract void removeCharacter(Character c);

	public abstract void updateCharacter(Character c);

	public abstract void dressEquipment(Character c, Item i);

}