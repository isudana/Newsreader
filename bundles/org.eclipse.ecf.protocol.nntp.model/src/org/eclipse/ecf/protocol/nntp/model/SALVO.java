/*******************************************************************************
 *  Copyright (c) 2010 Weltevree Beheer BV, Remain Software & Industrial-TSI
 *                                                                      
 * All rights reserved. This program and the accompanying materials     
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at             
 * http://www.eclipse.org/legal/epl-v10.html                            
 *                                                                      
 * Contributors:                                                        
 *    Wim Jongman - initial API and implementation
 *******************************************************************************/
package org.eclipse.ecf.protocol.nntp.model;

public class SALVO {

	public static final String NAMESPACE = "org.eclipse.ecf.salvo";

	/**
	 * IStoreEvent event constants
	 */
	public static final int EVENT_ADD_SERVER = 1 << 1;

	public static final int EVENT_ADD_GROUP = 1 << 2;

	public static final int EVENT_ADD = EVENT_ADD_GROUP | EVENT_ADD_SERVER;

	public static final int EVENT_REMOVE_SERVER = 1 << 3;

	public static final int EVENT_REMOVE_GROUP = 1 << 4;

	public static final int EVENT_REMOVE_ARTICLE = 1 << 5;

	public static final int EVENT_REMOVE = EVENT_REMOVE_ARTICLE
			| EVENT_REMOVE_GROUP | EVENT_REMOVE_SERVER;

	public static final int EVENT_CHANGE_SERVER = 1 << 6;

	public static final int EVENT_CHANGE_GROUP = 1 << 7;

	public static final int EVENT_RELOAD = 1 << 8;

	public static final int EVENT_UNSUBSCRIBE_GROUP = 1 << 9;

	public static final int EVENT_UNSUBSCRIBE_SERVER = 1 << 10;

	public static final int EVENT_UNSUBSCRIBE = EVENT_UNSUBSCRIBE_GROUP
			| EVENT_UNSUBSCRIBE_SERVER;

	public static final int EVENT_SUBSCRIBE_GROUP = 1 << 11;

	public static final int EVENT_SUBSCRIBE_SERVER = 1 << 12;

	public static final int EVENT_SUBSCRIBE = EVENT_SUBSCRIBE_GROUP
			| EVENT_SUBSCRIBE_SERVER;

	public static final int EVENT_REGISTER_STORE = 1 << 13;

	public static final int EVENT_UNREGISTER_STORE = 1 << 14;

	public static final int EVENT_STORE = EVENT_REGISTER_STORE
			| EVENT_UNREGISTER_STORE;

	public static final int EVENT_CHANGE = EVENT_CHANGE_GROUP
			| EVENT_CHANGE_SERVER;

	public static final int EVENT_ALL_EVENTS = EVENT_CHANGE | EVENT_REMOVE
			| EVENT_ADD | EVENT_RELOAD | EVENT_UNSUBSCRIBE | EVENT_SUBSCRIBE
			| EVENT_REGISTER_STORE | EVENT_UNREGISTER_STORE;
	
	public static final int EVENT_SUBSCRIBE_UNSUBSCRIBE = EVENT_SUBSCRIBE | EVENT_UNSUBSCRIBE | EVENT_REMOVE_GROUP;

	/**
	 * The home of Salvo. Could be used by IStore objects to save stuff.
	 */
	public static String SALVO_HOME = System.getProperty("salvo.home") == null ? System
			.getProperty("user.home")
			+ System.getProperty("file.separator")
			+ ".salvo" : System.getProperty("salvo.home");

	/**
	 * Defines the default batch of articles to fetch.
	 */
	public static int DEFAULT_BATCH = 50;

	/**
	 * Fetches the oldest
	 */
	public static final int FETCH_OLDEST = 1;

	/**
	 * Fetches the newest
	 */
	public static final int FETCH_NEWEST = 2;

	/**
	 * Fetch the next newer
	 */
	public static final int FETCH_NEXT_NEWER = 4;

	/**
	 * Fetches the next older
	 */
	public static final int FETCH_NEXT_OLDER = 8;

	/**
	 * Fetches the indicated
	 */
	public static final int FETCH_THIS = 16;

	/**
	 * Platform independent CRLF
	 */
	public static final String CRLF = System.getProperty("line.separator");

	/**
	 * Number of articles to fetch from the server
	 */
	public static final int BATCH_SIZE = 500;

	/**
	 * Place holder locations
	 */
	public static final String APPLICATION_LEFT = "org.eclipse.ecf.salvo.application.left";

	public static final String APPLICATION_BOTTOMLEFT = "org.eclipse.ecf.salvo.application.bottomleft";

	public static final String APPLICATION_BOTTOMRIGHT = "org.eclipse.ecf.salvo.application.bottomright";

	public static final String APPLICATION_RIGHT = "org.eclipse.ecf.salvo.application.right";

	public static final int LINE_LENGTH = 78;

	/**
	 * A single space for clarity.
	 */
	public static final String SPACE = " ";

	public static final String TAB = "\t";

	public static String SALVO_ORGANIZATION = "IndustrialTSI.com";

	/**
	 * The system <code>file.separator</code> property.
	 */
	public static final String SEPARATOR = System.getProperty("file.separator");

	public static final String SECURE_PREFS_NODE = "/org/eclipse/ecf/salvo";

	/**
	 * Sets the home variable
	 * 
	 * @param newHome
	 */
	public final static void setHome(String newHome) {
		SALVO_HOME = newHome + "";
	}

}
