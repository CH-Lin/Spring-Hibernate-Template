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

package com.template.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.template.models.DataRecord;

/**
 * This class implements TemplateDAO interface.
 *
 * @author Che-Hung Lin
 */
@Repository
public class TempalteDAOImpl implements TemplateDAO {

	@PersistenceContext
	EntityManager em;

	/**
	 * Add a DataRecord
	 * 
	 * @param data
	 *            DataRecord data to be inserted
	 */
	@Transactional
	public void addDataRecord(DataRecord data) {
		em.persist(data);
	}

	/**
	 * Get DataRecords from table
	 * 
	 * @return list of DataRecord data
	 */
	@Transactional
	public List<DataRecord> getDataRecord() {
		TypedQuery<DataRecord> query = em.createQuery("SELECT l FROM DataRecord l", DataRecord.class);
		return query.getResultList();
	}

}
