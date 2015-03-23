package com.uet.beman.object;

/**
 * Created by thanhpd on 3/12/2015.
 */
public class SentenceNode extends Node{
    private String sendTime;
    private String sendTimeEpoch;
    private String label;
    private String language;

    public SentenceNode() {
    }

    public SentenceNode(String message, String sendTime) {
        super(message);
        setSendTime(sendTime);
        // setSendTimeEpoch(sendTimeEpoch);
    }

    public String getSendTime() { return sendTime; }

    public void setSendTime(String sendTime) { this.sendTime = sendTime; }

    public String getSendTimeEpoch() { return sendTimeEpoch; }

    public void setSendTimeEpoch(String sendTimeEpoch) { this.sendTimeEpoch = sendTimeEpoch; }

    public String getLabel() { return label; }

    public void setLabel(String label) { this.label = label; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public boolean isSentenceNode() { return true; }
}