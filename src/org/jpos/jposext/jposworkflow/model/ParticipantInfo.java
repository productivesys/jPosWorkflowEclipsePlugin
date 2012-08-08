package org.jpos.jposext.jposworkflow.model;

import java.util.Map;

/**
 * @author dgrandemange
 *
 */
public class ParticipantInfo {

	public static final String UNDEFINED_CLAZZ = "<undefined>";

	public static final String DYNAGROUP_PREFIXE = "DYNAGROUP";

	private String clazz;

	private String groupName;

	private Map<String, SelectCriterion> selectCriteria;
	
	/**
	 * Updated context attributes by transition id 
	 */
	private Map<String, String[]> updCtxAttrByTransId;

	public ParticipantInfo() {
		super();
	}

	public ParticipantInfo(String clazz, String groupName,
			Map<String, SelectCriterion> selectCriteria) {
		super();
		this.groupName = groupName;
		this.clazz = clazz;
		this.selectCriteria = selectCriteria;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public boolean isGroup() {
		if (null == selectCriteria) {
			return false;
		}
		return (selectCriteria.size() > 0);
	}

	public Map<String, SelectCriterion> getSelectCriteria() {
		return selectCriteria;
	}

	public void setSelectCriteria(Map<String, SelectCriterion> selectCriteria) {
		this.selectCriteria = selectCriteria;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return the updCtxAttrByTransId
	 */
	public Map<String, String[]> getUpdCtxAttrByTransId() {
		return updCtxAttrByTransId;
	}

	/**
	 * @param updCtxAttrByTransId the updCtxAttrByTransId to set
	 */
	public void setUpdCtxAttrByTransId(Map<String, String[]> updCtxAttrByTransId) {
		this.updCtxAttrByTransId = updCtxAttrByTransId;
	}

}
