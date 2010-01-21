/*
epub2pdf, version 0.1 - Copyright 2010 Brendan C. LeFebvre

This file is part of epub2pdf.

epub2pdf is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

epub2pdf is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with epub2pdf.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.amphisoft.epub2pdf.metadata;

import javax.swing.tree.DefaultMutableTreeNode;

import com.amphisoft.epub.metadata.Ncx;
import com.lowagie.text.pdf.PdfDestination;
import com.lowagie.text.pdf.PdfOutline;

public class TocTreeNode extends DefaultMutableTreeNode {

	private static final long serialVersionUID = -8647760349844848298L;

	Payload payload = new Payload();
	
	public TocTreeNode() {
		super();
		this.setUserObject(payload);
	}
	
	public void setNcxNavPoint(Ncx.NavPoint nP) {
		payload.setNcxNavPoint(nP);
	}
	
	public void setPdfDestination(PdfDestination d) {
		payload.setDestination(d);
	}
	
	public String getDisplayedTitle() {
		return payload.ncxNavPoint.getNavLabelText();
	}
	
	public PdfDestination getPdfDestination() {
		return payload.pdfDestination;
	}
	
	public PdfOutline getPdfOutline() {
		return payload.pdfOutline;
	}

	public class Payload {
		Ncx.NavPoint ncxNavPoint = null;
		PdfDestination pdfDestination = null;
		PdfOutline pdfOutline = null;
		
		public void setNcxNavPoint(Ncx.NavPoint nP) {
			if(ncxNavPoint != null)
				throw new RuntimeException(new IllegalAccessException());
			ncxNavPoint = nP;
		}
		public void setDestination(PdfDestination d) {
			if(pdfDestination != null)
				throw new RuntimeException(new IllegalAccessException());
			pdfDestination = d;
		}
		
		public void setOutline(PdfOutline o) {
			if(pdfOutline != null)
				throw new RuntimeException(new IllegalAccessException());
			pdfOutline = o;
		}
	}

}
