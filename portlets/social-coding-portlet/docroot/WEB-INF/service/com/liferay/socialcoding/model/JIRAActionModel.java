/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.socialcoding.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JIRAAction service. Represents a row in the &quot;jiraaction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialcoding.model.impl.JIRAActionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. All helper methods and application logic should be put in {@link com.liferay.socialcoding.model.impl.JIRAActionImpl}.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a j i r a action model instance should use the {@link JIRAAction} interface instead.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAAction
 * @see       com.liferay.socialcoding.model.impl.JIRAActionImpl
 * @see       com.liferay.socialcoding.model.impl.JIRAActionModelImpl
 * @generated
 */
public interface JIRAActionModel extends BaseModel<JIRAAction> {
	/**
	 * Gets the primary key of this j i r a action.
	 *
	 * @return the primary key of this j i r a action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this j i r a action
	 *
	 * @param pk the primary key of this j i r a action
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the jira action id of this j i r a action.
	 *
	 * @return the jira action id of this j i r a action
	 */
	public long getJiraActionId();

	/**
	 * Sets the jira action id of this j i r a action.
	 *
	 * @param jiraActionId the jira action id of this j i r a action
	 */
	public void setJiraActionId(long jiraActionId);

	/**
	 * Gets the jira user id of this j i r a action.
	 *
	 * @return the jira user id of this j i r a action
	 */
	@AutoEscape
	public String getJiraUserId();

	/**
	 * Sets the jira user id of this j i r a action.
	 *
	 * @param jiraUserId the jira user id of this j i r a action
	 */
	public void setJiraUserId(String jiraUserId);

	/**
	 * Gets the create date of this j i r a action.
	 *
	 * @return the create date of this j i r a action
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this j i r a action.
	 *
	 * @param createDate the create date of this j i r a action
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this j i r a action.
	 *
	 * @return the modified date of this j i r a action
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this j i r a action.
	 *
	 * @param modifiedDate the modified date of this j i r a action
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the jira issue id of this j i r a action.
	 *
	 * @return the jira issue id of this j i r a action
	 */
	public long getJiraIssueId();

	/**
	 * Sets the jira issue id of this j i r a action.
	 *
	 * @param jiraIssueId the jira issue id of this j i r a action
	 */
	public void setJiraIssueId(long jiraIssueId);

	/**
	 * Gets the type of this j i r a action.
	 *
	 * @return the type of this j i r a action
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this j i r a action.
	 *
	 * @param type the type of this j i r a action
	 */
	public void setType(String type);

	/**
	 * Gets the body of this j i r a action.
	 *
	 * @return the body of this j i r a action
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this j i r a action.
	 *
	 * @param body the body of this j i r a action
	 */
	public void setBody(String body);

	/**
	 * Gets the jira group name of this j i r a action.
	 *
	 * @return the jira group name of this j i r a action
	 */
	@AutoEscape
	public String getJiraGroupName();

	/**
	 * Sets the jira group name of this j i r a action.
	 *
	 * @param jiraGroupName the jira group name of this j i r a action
	 */
	public void setJiraGroupName(String jiraGroupName);

	/**
	 * Gets a copy of this j i r a action as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public JIRAAction toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(JIRAAction jiraAction);

	public int hashCode();

	public String toString();

	public String toXmlString();
}