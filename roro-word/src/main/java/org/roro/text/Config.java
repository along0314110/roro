package org.roro.text;

public enum Config {
	SimplifiedChinese("chs", "中文简体"), English("en", "英文");

	public String code;
	public String name;

	private Config(String code, String name) {
		this.code = code;
		this.name = name;
	}
}
