/*
Copyright (C) 2008 Grant Slender

This file is part of OFCGWT.

OFCGWT is free software: you can redistribute it and/or modify
it under the terms of the Lesser GNU General Public License as
published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

OFCGWT is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

See <http://www.gnu.org/licenses/lgpl-3.0.txt>.
*/
package com.rednels.ofcgwt.client.model.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.rednels.ofcgwt.client.model.JSONizable;
/**
 * Base abstract class for OFC elements 
 */
public abstract class Element implements JSONizable {
    
    /** The type. */
    private final String type;
    
    /** The alpha. */
    private Float alpha;
    
    /** The text. */
    private String text;
    
    /** The font size. */
    private Integer fontSize; 
    
    /** The tooltip. */
    private String tooltip; 
    
    /** The values. */
    private List<Object> values = new ArrayList<Object>();
    
    /**
     * Creates a new element.
     * 
     * @param type the type
     */
    protected Element(String type) {
        this.type = type;
    }
    
    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the alpha.
     * 
     * @return the alpha
     */
    public Float getAlpha() {
        return alpha;
    }

    /**
     * Sets the alpha.
     * 
     * @param alpha the alpha
     */
    public void setAlpha(Float alpha) {
        this.alpha = alpha;
    }

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text.
     * 
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets the font size.
     * 
     * @return the font size
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Sets the font size.
     * 
     * @param fontSize the font size
     */
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }
    
    /**
     * Gets the values.
     * 
     * @return the values
     */
    public List<Object> getValues() {
        return values;
    }
    
    /**
     * Sets the values.
     * 
     * @param values the values
     */
    @SuppressWarnings("unchecked")
	public void setValues(Collection values) {
        this.values.clear();
        this.values.addAll(values);
    }
    
    /**
     * Sets the tooltip text (#val# is the default)
     * 
     * @param tooltip the tooltip
     */
    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
    
    /**
     * Gets the tooltip.
     * 
     * @return the tooltip
     */
    public String getTooltip() {
        return tooltip;
    }

	/* (non-Javadoc)
	 * @see com.rednels.ofcgwt.client.model.JSONizable#buildJSONObject()
	 */
	public JSONObject buildJSONObject() {
    	JSONObject json = new JSONObject();
    	if (type != null) json.put("type", new JSONString(type));
    	if (alpha != null) json.put("alpha", new JSONNumber(alpha)); //NumberFormat.getFormat("#.##").format(alpha)
    	if (text != null) json.put("text", new JSONString(text));
    	if (fontSize != null) json.put("font-size", new JSONNumber(fontSize));
    	if (tooltip != null) json.put("tip", new JSONString(tooltip));
    	if (values == null) return json;    	
    	JSONArray ary = new JSONArray();
    	int index = 0;
    	for (Object o : values) {
    		if (o instanceof Number) ary.set(index++, new JSONNumber(((Number)o).doubleValue()));
    		if (o instanceof String) ary.set(index++, new JSONString((String)o));
    		if (o instanceof JSONizable) ary.set(index++, ((JSONizable)o).buildJSONObject());
        }
    	if (index != 0) json.put("values",ary);
    	return json;
	}
}