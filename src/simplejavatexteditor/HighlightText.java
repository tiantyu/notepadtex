package simplejavatexteditor;

import javax.swing.text.*;
import java.awt.*;

public class HighlightText extends DefaultHighlighter.DefaultHighlightPainter{

    public HighlightText(Color color) {  //构造方法,设置高亮颜色
        super(new Color(255, 166,0, 255));
    }

    public void highLight(JTextComponent textComp, String[] pattern) {
        //移除已有高亮
        removeHighlights(textComp);

        try {
            Highlighter highlighter = textComp.getHighlighter(); //获得highlighter
            Document doc = textComp.getDocument();   //获得document
            String text = doc.getText(0, doc.getLength()); //获得文本内容
            for (int i = 0; i < pattern.length; i++) { //遍历模式字符串
                int pos = 0;

                while ((pos = text.indexOf(pattern[i], pos)) >= 0) {
                    //文本中找到模式字符串,添加高亮
                    highlighter.addHighlight(pos, pos + pattern[i].length(), this);
                    pos += pattern[i].length();   //移到下一位置
                }
            }
        } catch (BadLocationException e) {}

    }

    public void removeHighlights(JTextComponent textComp) {
        //移除HighlightText添加的高亮
        Highlighter highlighter = textComp.getHighlighter();
        Highlighter.Highlight[] hilites = highlighter.getHighlights();

        for (int i = 0; i < hilites.length; i++) {
            if (hilites[i].getPainter() instanceof HighlightText) {
                highlighter.removeHighlight(hilites[i]);
            }
        }
    }
}