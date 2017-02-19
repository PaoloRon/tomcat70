/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.tomcat.util.http.mapper;

import org.apache.tomcat.util.buf.MessageBytes;

/**
 * Mapping data.
 *
 * @author Remy Maucherat
 */
public class MappingData {

    protected Object host = null;
    protected Object context = null;
    protected Object wrapper = null;
    protected boolean jspWildCard = false;

    protected MessageBytes contextPath = MessageBytes.newInstance();
    protected MessageBytes requestPath = MessageBytes.newInstance();
    protected MessageBytes wrapperPath = MessageBytes.newInstance();
    protected MessageBytes pathInfo = MessageBytes.newInstance();

    protected MessageBytes redirectPath = MessageBytes.newInstance();

    public void setHost(Object host) {
		this.host = host;
	}

	public Object getContext() {
		return context;
	}

	public Object getWrapper() {
		return wrapper;
	}

	public MessageBytes getContextPath() {
		return contextPath;
	}

	public MessageBytes getRequestPath() {
		return requestPath;
	}

	public MessageBytes getWrapperPath() {
		return wrapperPath;
	}

	public MessageBytes getPathInfo() {
		return pathInfo;
	}

	public MessageBytes getRedirectPath() {
		return redirectPath;
	}

	public void recycle() {
        host = null;
        context = null;
        wrapper = null;
        jspWildCard = false;
        contextPath.recycle();
        requestPath.recycle();
        wrapperPath.recycle();
        pathInfo.recycle();
        redirectPath.recycle();
    }

}
