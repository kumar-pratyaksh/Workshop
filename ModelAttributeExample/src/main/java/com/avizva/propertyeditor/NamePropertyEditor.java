package com.avizva.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if ((text.charAt(0) == 'M' || text.charAt(0) == 'm') && (text.charAt(1) == 'r' || text.charAt(1) == 's')
				&& text.charAt(3) == '.') {
			setValue(text);
		} else {
			setValue("Mr./Ms. " + text);
		}
	}

}
