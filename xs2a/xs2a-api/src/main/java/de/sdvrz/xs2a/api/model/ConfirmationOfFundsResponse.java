/*
 * Copyright 2018 SDV-IT, Sparda Datenverarbeitung eG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.sdvrz.xs2a.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 */
@JsonInclude(Include.NON_NULL)
@ApiModel(value = "ConfirmationOfFundsResponse")
public class ConfirmationOfFundsResponse {
	
	@ApiModelProperty(value = "Message to the PSU", required = false)
	TppMessage tpp_message;

	public TppMessage getTpp_message() {
		return tpp_message;
	}

	public void setTpp_message(TppMessage tpp_message) {
		this.tpp_message = tpp_message;
	}		
	
}