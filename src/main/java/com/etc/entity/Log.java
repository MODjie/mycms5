package com.etc.entity;

public class Log {
    private Integer logId;

    private String logContent;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", logContent=" + logContent + "]";
	}

	public Log(Integer logId, String logContent) {
		super();
		this.logId = logId;
		this.logContent = logContent;
	}
    
    public Log() {
		// TODO Auto-generated constructor stub
	}
}