package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;

import com.futurevision.rpg.entity.Scenario;
import com.futurevision.rpg.entity.ScenarioSelection;

@Local
public interface ScenarioBOI {

	public abstract Scenario flee();

	public abstract Scenario getScenarioById(Integer id);

	public abstract Scenario getScenarioByScenarioSelection(
			ScenarioSelection scenarioSelection);

}