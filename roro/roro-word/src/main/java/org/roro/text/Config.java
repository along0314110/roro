package org.roro.text;

public enum Config {
	SimplifiedChinese("chs", "���ļ���"), English("en", "Ӣ��");

	public String code;
	public String name;

	private Config(String code, String name) {
		this.code = code;
		this.name = name;
	}
}
