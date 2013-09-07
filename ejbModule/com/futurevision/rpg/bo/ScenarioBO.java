package com.futurevision.rpg.bo;

import java.io.Serializable;

import com.futurevision.rpg.bo.inter.ScenarioBOI;
import com.futurevision.rpg.dao.EntityManagerFactorySingleton;
import com.futurevision.rpg.dao.impl.ScenarioDAO;
import com.futurevision.rpg.dao.inter.ScenarioDAOI;
import com.futurevision.rpg.entity.Scenario;
import com.futurevision.rpg.entity.ScenarioSelection;

public class ScenarioBO implements Serializable, ScenarioBOI {

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ScenarioBOI#flee()
	 */
	@Override
	public Scenario flee() {

		return null;
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ScenarioBOI#getScenarioById(java.lang.Integer)
	 */
	@Override
	public Scenario getScenarioById(Integer id) {
		ScenarioDAOI dao = new ScenarioDAO();
		return dao.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.futurevision.rpg.bo.ScenarioBOI#getScenarioByScenarioSelection(com.futurevision.rpg.entity.ScenarioSelection)
	 */
	@Override
	public Scenario getScenarioByScenarioSelection(
			ScenarioSelection scenarioSelection) {

		return null;
	}

}
