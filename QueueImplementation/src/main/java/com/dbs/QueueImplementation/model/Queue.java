package com.dbs.QueueImplementation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Queue {
	@Id
	private int id;
	private String queueName;
	private int size;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
