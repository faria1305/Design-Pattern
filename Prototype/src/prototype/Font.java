package prototype;

public class Font {
	
	public String fontName;
	public int fontSize;
	
	
	public Font() {
		
	}
	
	public Font(String fontName, int fontSize) {
        this.fontName = fontName;
        this.fontSize = fontSize;
    }
	
	public Font clone() {
        return new Font(this.fontName, this.fontSize);
    }

	@Override
	public String toString() {
		return "Font [fontName=" + fontName + ", fontSize=" + fontSize + "]";
	}
	

}
