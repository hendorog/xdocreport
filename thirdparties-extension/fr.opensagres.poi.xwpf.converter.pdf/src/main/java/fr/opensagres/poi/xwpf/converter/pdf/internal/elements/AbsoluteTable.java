package fr.opensagres.poi.xwpf.converter.pdf.internal.elements;

import com.lowagie.text.Element;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

import fr.opensagres.xdocreport.itext.extension.ExtendedPdfPTable;
import fr.opensagres.xdocreport.itext.extension.IITextContainer;

/**
 * Single Cell table which is used as a frame.
 * @author Roger Hendersn
 *
 */
public class AbsoluteTable extends PdfPTable implements IITextContainer {
	protected float absX;
	protected float absY;
	
	public AbsoluteTable(float x, float y, int columns) {
		super(columns);

		this.absX = x;
		this.absY = y;
	}
	
    public AbsoluteTable(int numColumns ) {
        super( numColumns );
    }

	@Override
    public void addElement( Element element ) {
		System.out.println("Adding element to cell 0,0");
//		this.getRow(0).getCells()[0].addElement(element);
		getSingleCell().addElement(element);
    }		
    
	public float getAbsX() {
		return absX;
	}

	public void setAbsX(float absX) {
		this.absX = absX;
	}

	public float getAbsY() {
		return absY;
	}

	public void setAbsY(float absY) {
		this.absY = absY;
	}

	public PdfPCell getSingleCell() {
		return this.getRow(0).getCells()[0];
	}
	
	@Override
	public IITextContainer getITextContainer() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setITextContainer(IITextContainer container) {
		// TODO Auto-generated method stub
		
	}
}