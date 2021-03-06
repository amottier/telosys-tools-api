/**
 *  Copyright (C) 2008-2017  Telosys project org. ( http://www.telosys.org/ )
 *
 *  Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.gnu.org/licenses/lgpl.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.telosys.tools.stats.services;

import java.io.File;
import java.util.Date;

/**
 * A manager class for a date which is stored in a file <br>
 * e.g. "generation.date", "creation.date", ...
 *  
 */
public class DateFileManager {

	private final File file ;
	
	public DateFileManager(File file) {
		super();
		this.file = file;
	}

	public File getFile() {
		return file ;
	}
	
	public void writeDate(Date date) {
		// write (no lock ?)
	}

	public void writeDate() {
		writeDate(new Date());
	}

	public Date readDate() {
		return null ;
	}
	
}
