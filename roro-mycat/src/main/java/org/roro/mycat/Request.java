package org.roro.mycat;

import java.io.InputStream;

public class Request {
	private InputStream input;
	private String uri;

	public Request(InputStream input) {
		this.input = input;
	}

	public void parse() {
		// TODO YEBIN 待开发
	}

	private String parseUri(String requestString) {
		// TODO YEBIN 待开发
		return null;
	}

	public String getUri() {
		return uri;
	}

}
