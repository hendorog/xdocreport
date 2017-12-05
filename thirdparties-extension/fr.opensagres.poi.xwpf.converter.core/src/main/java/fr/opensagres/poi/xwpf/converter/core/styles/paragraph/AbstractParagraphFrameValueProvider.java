package fr.opensagres.poi.xwpf.converter.core.styles.paragraph;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;

public abstract class AbstractParagraphFrameValueProvider
	extends AbstractParagraphValueProvider<CTFramePr>	{

    @Override
    public CTFramePr getValue( CTPPr ppr )
    {
        if ( ppr == null )
        {
            return null;
        }
        CTFramePr frame = ppr.getFramePr();
        if ( frame != null )
        {
            return getFrame( frame );
        }
        return null;
    }

    protected abstract CTFramePr getFrame( CTFramePr frame );
}

