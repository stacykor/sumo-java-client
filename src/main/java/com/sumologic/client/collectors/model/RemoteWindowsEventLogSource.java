package com.sumologic.client.collectors.model;

import java.util.List;

/**
 * A source that reads from remote Windows event logs.
 *
 * @author Jeffrey Wang
 * @version 1.1
 */
public class RemoteWindowsEventLogSource extends WindowsEventLogSource {

    private static String DOMAIN = "domain";
    private static String USERNAME = "username";
    private static String PASSWORD = "password";
    private static String HOSTS = "hosts";

    /**
     * Returns the Windows domain.
     *
     * @return The Windows domain.
     */
    public String getDomain() {
        return getProperty(DOMAIN);
    }

    /**
     * Sets the Windows domain.
     */
    public void setDomain(String domain) {
        setProperty(DOMAIN, domain);
    }

    /**
     * Returns the username.
     *
     * @return The username.
     */
    public String getUsername() {
        return getProperty(USERNAME);
    }

    /**
     * Sets the username.
     */
    public void setUsername(String username) {
        setProperty(USERNAME, username);
    }

    /**
     * Sets the password.
     */
    public void setPassword(String password) {
        setProperty(PASSWORD, password);
    }

    /**
     * Returns the list of remote Windows hosts.

     * @return The list of remote Windows hosts.
     */
    public List<String> getHosts() {
        return getProperty(HOSTS);
    }

    /**
     * Sets the list of remote Windows hosts.
     */
    public void setHosts(List<String> hosts) {
        setProperty(HOSTS, hosts);
    }
}