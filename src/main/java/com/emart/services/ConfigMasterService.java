package com.emart.services;

import java.util.List;

import com.emart.entities.ConfigMaster;

public interface ConfigMasterService {

	List<ConfigMaster> getAllConfigs();

	ConfigMaster getConfigById(int configId);

	ConfigMaster addConfig(ConfigMaster config);

	ConfigMaster updateConfig(int configId, ConfigMaster updatedConfig);

	void deleteConfig(int configId);

	

}
