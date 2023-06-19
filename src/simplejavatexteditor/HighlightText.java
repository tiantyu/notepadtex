package simplejavatexteditor;

import javax.swing.text.*;
import java.awt.*;

public class HighlightText extends DefaultHighlighter.DefaultHighlightPainter{

    //构造方法,设置高亮颜色
    public HighlightText(Color color) {
        super(new Color(255, 166,0, 255));
    }

    //方法,在文本组件中高亮给定的模式字符串
    public void highLight(JTextComponent textComp, String[] pattern) {
        //移除已有高亮,避免重复高亮
        removeHighlights(textComp);

        try {
            //获得highlighter,用于添加和移除高亮
            Highlighter highlighter = textComp.getHighlighter();
            //获得document,用于获得文本内容
            Document doc = textComp.getDocument();
            //获得文本内容
            String text = doc.getText(0, doc.getLength());
            //遍历模式字符串集合
            for (int i = 0; i < pattern.length; i++) {
                int pos = 0;
                //在文本中查找模式字符串
                while ((pos = text.indexOf(pattern[i], pos)) >= 0) {
                    //找到则添加高亮
                    highlighter.addHighlight(pos, pos + pattern[i].length(), this);
                    //移到下一位置继续查找
                    pos += pattern[i].length();
                }
            }
        } catch (BadLocationException e) {}

    }

    //方法,移除HighlightText添加的高亮
    public void removeHighlights(JTextComponent textComp) {
        //获得highlighter
        Highlighter highlighter = textComp.getHighlighter();
        //获得所有的highlighter
        Highlighter.Highlight[] hilites = highlighter.getHighlights();

        for (int i = 0; i < hilites.length; i++) {
            //判断是HighlightText添加的,然后移除
            if (hilites[i].getPainter() instanceof HighlightText) {
                highlighter.removeHighlight(hilites[i]);
            }
        }
    }
}