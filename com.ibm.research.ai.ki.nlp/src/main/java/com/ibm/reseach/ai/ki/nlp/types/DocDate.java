/**
 * cc-dbp-dataset
 *
 * Copyright (c) 2017 IBM
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.reseach.ai.ki.nlp.types;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.ibm.reseach.ai.ki.nlp.*;

/**
 * Date the document was written or created
 * @author mrglass
 *
 */
public class DocDate implements DocumentStructure {
	private static final long serialVersionUID = 1L;
	public Date date;
	@JsonCreator
	public DocDate(@JsonProperty("date") Date date) {
		this.date = date;
	}
}