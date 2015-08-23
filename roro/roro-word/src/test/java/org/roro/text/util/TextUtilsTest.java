package org.roro.text.util;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class TextUtilsTest {

	/**
	 * 测试分词功能
	 */
	@Test
	public void testAnalysis() {
		String text = "基于java语言开发的轻量级的中文分词工具包";
		String result = StringUtils.join(TextUtils.analysis(text), "|");
		System.out.println(result);
		assertEquals("基于|java|语言|开发|的|轻量级|的|中文|分词|工具包", result);
	}
}
