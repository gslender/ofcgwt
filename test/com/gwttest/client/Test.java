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
package com.gwttest.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Example Test using OFCGWT
 */
public class Test implements EntryPoint {

	public void onModuleLoad() {
//		new Demo().onModuleLoad();
		new MemoryLeakTest().onModuleLoad();
	}
}