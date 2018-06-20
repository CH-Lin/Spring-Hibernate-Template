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

package com.template.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * This class defines the DataRecord bean.
 *
 * @author Che-Hung Lin
 */
@Table(name = "DataRecord", indexes = { @Index(name = "data_record_id_index", columnList = "datarecordid") })
@Entity
public class DataRecord {

	@Id
	@Column(name = "DATARECORDID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "datarecord_datarecordid_seq")
	@SequenceGenerator(name = "datarecord_datarecordid_seq", sequenceName = "datarecord_datarecordid_seq", allocationSize = 1)
	private long spotId;

	private String data;

	public DataRecord() {
	}

	public DataRecord(String data) {
		this.data = data;
	}

	public long getSpotId() {
		return spotId;
	}

	public void setSpotId(long spotId) {
		this.spotId = spotId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
