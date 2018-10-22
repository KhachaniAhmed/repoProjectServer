/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    private User sender;
    private int port;
    private String message;
    private Conversation conversation;

    public Message() {
    }

    public Message(User sender, int reciever, String message, Conversation conversation) {
        this.sender = sender;
        this.port = reciever;
        this.message = message;
        this.conversation = conversation;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

}
