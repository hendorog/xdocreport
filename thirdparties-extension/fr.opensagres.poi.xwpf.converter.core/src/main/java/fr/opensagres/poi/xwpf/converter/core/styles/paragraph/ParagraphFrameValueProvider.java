package fr.opensagres.poi.xwpf.converter.core.styles.paragraph;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr;

public class ParagraphFrameValueProvider extends AbstractParagraphFrameValueProvider {
	
    public static final ParagraphFrameValueProvider INSTANCE = new ParagraphFrameValueProvider();

    protected CTFramePr getFrame( CTFramePr frame )
    {
        return frame;
    }
}
