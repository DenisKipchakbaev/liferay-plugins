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
 * The base model interface for the JIRAIssue service. Represents a row in the &quot;jiraissue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialcoding.model.impl.JIRAIssueModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. All helper methods and application logic should be put in {@link com.liferay.socialcoding.model.impl.JIRAIssueImpl}.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a j i r a issue model instance should use the {@link JIRAIssue} interface instead.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAIssue
 * @see       com.liferay.socialcoding.model.impl.JIRAIssueImpl
 * @see       com.liferay.socialcoding.model.impl.JIRAIssueModelImpl
 * @generated
 */
public interface JIRAIssueModel extends BaseModel<JIRAIssue> {
	/**
	 * Gets the primary key of this j i r a issue.
	 *
	 * @return the primary key of this j i r a issue
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this j i r a issue
	 *
	 * @param pk the primary key of this j i r a issue
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the jira issue id of this j i r a issue.
	 *
	 * @return the jira issue id of this j i r a issue
	 */
	public long getJiraIssueId();

	/**
	 * Sets the jira issue id of this j i r a issue.
	 *
	 * @param jiraIssueId the jira issue id of this j i r a issue
	 */
	public void setJiraIssueId(long jiraIssueId);

	/**
	 * Gets the create date of this j i r a issue.
	 *
	 * @return the create date of this j i r a issue
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this j i r a issue.
	 *
	 * @param createDate the create date of this j i r a issue
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this j i r a issue.
	 *
	 * @return the modified date of this j i r a issue
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this j i r a issue.
	 *
	 * @param modifiedDate the modified date of this j i r a issue
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the project id of this j i r a issue.
	 *
	 * @return the project id of this j i r a issue
	 */
	public long getProjectId();

	/**
	 * Sets the project id of this j i r a issue.
	 *
	 * @param projectId the project id of this j i r a issue
	 */
	public void setProjectId(long projectId);

	/**
	 * Gets the key of this j i r a issue.
	 *
	 * @return the key of this j i r a issue
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this j i r a issue.
	 *
	 * @param key the key of this j i r a issue
	 */
	public void setKey(String key);

	/**
	 * Gets the summary of this j i r a issue.
	 *
	 * @return the summary of this j i r a issue
	 */
	@AutoEscape
	public String getSummary();

	/**
	 * Sets the summary of this j i r a issue.
	 *
	 * @param summary the summary of this j i r a issue
	 */
	public void setSummary(String summary);

	/**
	 * Gets the description of this j i r a issue.
	 *
	 * @return the description of this j i r a issue
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this j i r a issue.
	 *
	 * @param description the description of this j i r a issue
	 */
	public void setDescription(String description);

	/**
	 * Gets the reporter jira user id of this j i r a issue.
	 *
	 * @return the reporter jira user id of this j i r a issue
	 */
	@AutoEscape
	public String getReporterJiraUserId();

	/**
	 * Sets the reporter jira user id of this j i r a issue.
	 *
	 * @param reporterJiraUserId the reporter jira user id of this j i r a issue
	 */
	public void setReporterJiraUserId(String reporterJiraUserId);

	/**
	 * Gets the assignee jira user id of this j i r a issue.
	 *
	 * @return the assignee jira user id of this j i r a issue
	 */
	@AutoEscape
	public String getAssigneeJiraUserId();

	/**
	 * Sets the assignee jira user id of this j i r a issue.
	 *
	 * @param assigneeJiraUserId the assignee jira user id of this j i r a issue
	 */
	public void setAssigneeJiraUserId(String assigneeJiraUserId);

	/**
	 * Gets the resolution of this j i r a issue.
	 *
	 * @return the resolution of this j i r a issue
	 */
	@AutoEscape
	public String getResolution();

	/**
	 * Sets the resolution of this j i r a issue.
	 *
	 * @param resolution the resolution of this j i r a issue
	 */
	public void setResolution(String resolution);

	/**
	 * Gets the status of this j i r a issue.
	 *
	 * @return the status of this j i r a issue
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this j i r a issue.
	 *
	 * @param status the status of this j i r a issue
	 */
	public void setStatus(String status);

	/**
	 * Gets a copy of this j i r a issue as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public JIRAIssue toEscapedModel();

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

	public int compareTo(JIRAIssue jiraIssue);

	public int hashCode();

	public String toString();

	public String toXmlString();
}