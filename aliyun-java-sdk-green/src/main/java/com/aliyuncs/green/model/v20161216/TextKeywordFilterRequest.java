/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.green.model.v20161216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TextKeywordFilterRequest extends RpcAcsRequest<TextKeywordFilterResponse> {
	
	public TextKeywordFilterRequest() {
		super("Green", "2016-12-16", "TextKeywordFilter", "green");
		setMethod(MethodType.POST);
	}

	private List<String> customDicts;

	private String text;

	private Boolean useSysDic;

	public List<String> getCustomDicts() {
		return this.customDicts;
	}

	public void setCustomDicts(List<String> customDicts) {
		this.customDicts = customDicts;	
		for (int i = 0; i < customDicts.size(); i++) {
			putQueryParameter("CustomDict." + (i + 1) , customDicts.get(i));
		}	
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		putQueryParameter("Text", text);
	}

	public Boolean getUseSysDic() {
		return this.useSysDic;
	}

	public void setUseSysDic(Boolean useSysDic) {
		this.useSysDic = useSysDic;
		putQueryParameter("UseSysDic", useSysDic);
	}

	@Override
	public Class<TextKeywordFilterResponse> getResponseClass() {
		return TextKeywordFilterResponse.class;
	}

}
