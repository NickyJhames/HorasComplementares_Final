//criar na controller 
package Controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FixedLengthDocument extends PlainDocument {
    private final int iMaxLenght;
    public FixedLengthDocument(final int maxlen){
        super();
        this.iMaxLenght = maxlen;
    }
    @Override
    public void insertString(final int offset, final String str, final AttributeSet attr)
            throws BadLocationException {
                if(str == null){
                return;
                }
                if(this.iMaxLenght <= 0){
                    super.insertString(offset, str, attr);
                    return;
                } 
                final int ilen = this.getLength() + str.length();
                if (ilen <= this.iMaxLenght){
                    super.insertString(offset, str, attr);
                } else {
                    if(this.getLength() == this.iMaxLenght){
                        return;
                    }
                    final String newStr = str.substring(0,this.iMaxLenght - this.getLength());
                    super.insertString(offset, newStr, attr);
                }
    }
}
    