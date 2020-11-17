package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;


import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;
    private Credentials credentials;


    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setDefaultRecipients(List defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    public void setAdditionalHeaders(Map additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public List getDefaultRecipients() {
        return defaultRecipients;
    }

    public Map getAdditionalHeaders() {
        return additionalHeaders;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRecipients[0]=" + defaultRecipients.get(0) +
                ", defaultRecipients[1]=" + defaultRecipients.get(1) +
                ", additionalHeaders=" + additionalHeaders +
                ", credentials.getUsername=" + credentials.getUsername() +
                ", credentials.getPassword=" + credentials.getPassword() +
                ", credentials.getAuthMethod=" + credentials.getAuthMethod() +
                '}' ;
    }
}
