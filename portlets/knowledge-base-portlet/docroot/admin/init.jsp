<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
--%>

<%@ include file="/init.jsp" %>

<%@ page import="com.liferay.knowledgebase.admin.search.KBArticleDisplayTerms" %><%@
page import="com.liferay.knowledgebase.admin.search.KBArticleSearch" %><%@
page import="com.liferay.knowledgebase.admin.search.KBArticleSearchTerms" %><%@
page import="com.liferay.knowledgebase.admin.search.KBTemplateDisplayTerms" %><%@
page import="com.liferay.knowledgebase.admin.search.KBTemplateSearch" %><%@
page import="com.liferay.knowledgebase.admin.search.KBTemplateSearchTerms" %><%@
page import="com.liferay.knowledgebase.admin.util.AdminUtil" %><%@
page import="com.liferay.knowledgebase.admin.util.KBArticleAssetEntriesUtil" %>

<%
PortletPreferences preferences = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}

String kbArticlesOrderByCol = preferences.getValue("kbArticlesOrderByCol", StringPool.BLANK);
String kbArticlesOrderByType = preferences.getValue("kbArticlesOrderByType", StringPool.BLANK);

boolean enableKBArticleDescription = GetterUtil.getBoolean(preferences.getValue("enableKBArticleDescription", null));
boolean enableKBArticleRatings = GetterUtil.getBoolean(preferences.getValue("enableKBArticleRatings", null));
boolean showKBArticleAssetEntries = GetterUtil.getBoolean(preferences.getValue("showKBArticleAssetEntries", null));
boolean enableKBArticleKBComments = GetterUtil.getBoolean(preferences.getValue("enableKBArticleKBComments", null));
boolean showKBArticleKBComments = GetterUtil.getBoolean(preferences.getValue("showKBArticleKBComments", null));
boolean enableKBArticleViewCountIncrement = GetterUtil.getBoolean(preferences.getValue("enableKBArticleViewCountIncrement", null));

boolean enableKBTemplateKBComments = GetterUtil.getBoolean(preferences.getValue("enableKBTemplateKBComments", null));
boolean showKBTemplateKBComments = GetterUtil.getBoolean(preferences.getValue("showKBTemplateKBComments", null));

boolean enableRSS = !PortalUtil.isRSSFeedsEnabled() ? false : GetterUtil.getBoolean(preferences.getValue("enableRss", null), true);
int rssDelta = GetterUtil.getInteger(preferences.getValue("rssDelta", StringPool.BLANK), SearchContainer.DEFAULT_DELTA);
String rssDisplayStyle = preferences.getValue("rssDisplayStyle", RSSUtil.DISPLAY_STYLE_DEFAULT);
String rssFeedType = preferences.getValue("rssFeedType", RSSUtil.FEED_TYPE_DEFAULT);
%>