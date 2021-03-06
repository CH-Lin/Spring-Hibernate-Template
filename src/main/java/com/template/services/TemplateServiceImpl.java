/**
Copyright (c) 2018 Che-Hung Lin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.template.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.template.dao.TemplateDAO;
import com.template.models.DataRecord;

/**
 * This class implements TemplateService interface.
 *
 * @author Che-Hung Lin
 */
@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired(required = true)
	private TemplateDAO dao;

	/**
	 * Service to add data into database
	 * 
	 * @param data
	 *            string data to be inserted
	 */
	public void add(String data) {
		dao.addDataRecord(new DataRecord(data));
	}

	/**
	 * Service to get data from database
	 * 
	 * @return list of string data
	 */
	public List<String> get() {
		List<String> list = new ArrayList<>();
		for (DataRecord dataRecord : dao.getDataRecord()) {
			list.add(dataRecord.getData());
		}
		return list;
	}
}
