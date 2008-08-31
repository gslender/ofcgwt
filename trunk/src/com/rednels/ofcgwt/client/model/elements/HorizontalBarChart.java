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

import java.util.Arrays;
import java.util.List;

import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.rednels.ofcgwt.client.model.JSONizable;
/**
 * Class for an OFC horizontal bar chart that extends Element   
 * @see com.rednels.ofcgwt.client.model.elements.Element
 */
public class HorizontalBarChart extends Element implements JSONizable {

    /** The Constant TYPE. */
    private static final transient String TYPE = "hbar";
    
    /** The colour. */
    private String colour;
    
    /**
     * Creates a new horizontal bar chart.
     */
    public HorizontalBarChart() {
        super(TYPE);
    }
    
    /**
     * Gets the colour.
     * 
     * @return the colour
     */
    public String getColour() {
        return colour;
    }
    
    /**
     * Sets the colour in HTML hex format (#ffffff) 
     * 
     * @param colour the new colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    /**
     * Adds the bars.
     * 
     * @param values the values
     */
    public void addBars(Bar... values) {
        getValues().addAll(Arrays.asList(values));
    }
    
    /**
     * Adds the bars.
     * 
     * @param values the values
     */
    public void addBars(List<Bar> values) {
        getValues().addAll(values);
    }
        
    /**
     * Adds bars with right side values.
     * 
     * @param values the right side values
     */
    public void addValues(Number... values) {
        Bar[] v = new Bar[values.length];
        for (int i = 0; i < values.length; ++i) {
            v[i] = new Bar(values[i]);
        }
        addBars(v);
    }
    
    /**
     * Adds bars with right side values.
     * 
     * @param values the right side values
     */
    public void addValues(List<Number> values) {
        getValues().addAll(values);
    }
    
    /**
     * Adds the bar.
     * 
     * @param left the left
     * @param right the right
     */
    public void addBar(Number left, Number right) {
        addBars(new Bar(left, right));
    }

	/* (non-Javadoc)
	 * @see com.rednels.ofcgwt.client.model.elements.Element#buildJSONObject()
	 */
	public JSONObject buildJSONObject() {
    	JSONObject json = super.buildJSONObject();
    	if (colour != null) json.put("colour", new JSONString(colour)); 	
    	return json;
	}
    

    /**
     * Base class for OFC horizontal bar chart bars 
     */
    public static class Bar implements JSONizable {
    	
	    /** The left. */
	    private Number left;
    	
	    /** The right. */
	    private Number right;
    	
	    /** The colour. */
	    private String colour;
    	
	    /** The tooltip. */
	    private String tooltip;
    	
    	/**
	     * Creates a new bar.
	     * 
	     * @param left the left
	     * @param right the right
	     * @param colour the colour
	     */
	    public Bar(Number left, Number right, String colour) {
    	    setLeft(left);
    	    setRight(right);
    	    setColour(colour);
    	}
    	
    	/**
	     * Creates a new bar.
	     * 
	     * @param left the left
	     * @param right the right
	     */
	    public Bar(Number left, Number right) {
    		this(left, right, null);
    	}
    	
    	/**
	     * Creates a new bar.
	     * 
	     * @param right the right
	     * @param colour the colour
	     */
	    public Bar(Number right, String colour) {
    	    this(null, right, colour);
    	}
    	
    	/**
	     * Creates a new bar.
	     * 
	     * @param right the right
	     */
	    public Bar(Number right) {
    	    this(null, right, null);
    	}
    	
		/**
		 * Gets the left.
		 * 
		 * @return the left
		 */
		public Number getLeft() {
			return left;
		}
		
		/**
		 * Sets the left.
		 * 
		 * @param left the new left
		 */
		public void setLeft(Number left) {
			this.left = left;
		}
		
		/**
		 * Gets the right.
		 * 
		 * @return the right
		 */
		public Number getRight() {
			return right;
		}
		
		/**
		 * Sets the right.
		 * 
		 * @param right the new right
		 */
		public void setRight(Number right) {
			this.right = right;
		}
		
		/**
		 * Gets the colour.
		 * 
		 * @return the colour
		 */
		public String getColour() {
			return colour;
		}
		
		/**
		 * Sets the colour in HTML hex format (#ffffff) 
		 * 
		 * @param colour the new colour
		 */
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		/**
		 * Gets the tooltip.
		 * 
		 * @return the tooltip
		 */
		public String getTooltip() {
			return tooltip;
		}
		
		/**
		 * Sets the tooltip.
		 * 
		 * @param tooltip the new tooltip
		 */
		public void setTooltip(String tooltip) {
			this.tooltip = tooltip;
		}

    	/* (non-Javadoc)
	     * @see com.rednels.ofcgwt.client.model.JSONizable#buildJSONObject()
	     */
	    public JSONObject buildJSONObject() {
        	JSONObject json = new JSONObject();
        	if (left != null) json.put("left", new JSONNumber(left.doubleValue()));
        	if (right != null) json.put("right", new JSONNumber(right.doubleValue())); 	
        	if (colour != null) json.put("colour", new JSONString(colour));
        	if (tooltip != null) json.put("tip", new JSONString(tooltip));
        	return json;
    	}	
    }
}