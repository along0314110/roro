package org.roro.text.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

/**
 * 文本处理
 * 
 * @author yebin
 *
 */
public class TextUtils {
	/**
	 * 智能分词
	 * 
	 * @param text
	 * @return
	 */
	public static List<String> analysis(String text) {
		List<String> result = new ArrayList<String>();
		StringReader sr = new StringReader(text);
		IKSegmenter ik = new IKSegmenter(sr, false);
		Lexeme lex = null;
		try {
			while ((lex = ik.next()) != null) {
				result.add(lex.getLexemeText());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sr.close();
		}
		return result;
	}
}
