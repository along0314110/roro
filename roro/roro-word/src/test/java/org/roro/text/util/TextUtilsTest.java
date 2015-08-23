package org.roro.text.util;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class TextUtilsTest {

	/**
	 * ���Էִʹ���
	 */
	@Test
	public void testAnalysis() {
		String text = "����java���Կ����������������ķִʹ��߰�";
		String result = StringUtils.join(TextUtils.analysis(text), "|");
		System.out.println(result);
		assertEquals("����|java|����|����|��|������|��|����|�ִ�|���߰�", result);
	}
}
