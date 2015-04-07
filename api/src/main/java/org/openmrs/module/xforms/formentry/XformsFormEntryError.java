/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.xforms.formentry;

import java.util.Date;

import org.openmrs.BaseOpenmrsObject;
import org.openmrs.User;

public class XformsFormEntryError  extends BaseOpenmrsObject {

	private Integer formEntryErrorId;
	private String formData;
	private String error;
	private String errorDetails;
	private User creator;
	private Date dateCreated;

	/**
	 * @return Returns the creator.
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator
	 *            The creator to set.
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return Returns the dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            The dateCreated to set.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return Returns the error.
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *            The error to set.
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return Returns the errorDetails.
	 */
	public String getErrorDetails() {
		return errorDetails;
	}

	/**
	 * @param errorDetails
	 *            The errorDetails to set.
	 */
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * @return Returns the formData.
	 */
	public String getFormData() {
		return formData;
	}

	/**
	 * @param formData
	 *            The formData to set.
	 */
	public void setFormData(String formData) {
		this.formData = formData;
	}

	/**
	 * @return Returns the formEntryErrorId.
	 */
	public Integer getFormEntryErrorId() {
		return formEntryErrorId;
	}

	/**
	 * @param formEntryErrorId
	 *            The formEntryErrorId to set.
	 */
	public void setFormEntryErrorId(Integer formEntryErrorId) {
		this.formEntryErrorId = formEntryErrorId;
	}

	@Override
	public Integer getId() {
		return getFormEntryErrorId();
	}

	@Override
	public void setId(Integer id) {
		setFormEntryErrorId(id);
	}
}
