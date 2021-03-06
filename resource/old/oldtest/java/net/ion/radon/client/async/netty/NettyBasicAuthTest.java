/*
 * Copyright (c) 2010-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package net.ion.radon.client.async.netty;


import net.ion.radon.client.AsyncHttpClient;
import net.ion.radon.client.AsyncHttpClientConfig;
import net.ion.radon.client.async.BasicAuthTest;
import net.ion.radon.client.async.ProviderUtil;

import org.testng.annotations.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class NettyBasicAuthTest extends BasicAuthTest {

	@Override
	public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
		return ProviderUtil.nettyProvider(config);
	}

	@Override
	@Test
	public void redirectAndBasicAuthTest() throws Exception, ExecutionException, TimeoutException, InterruptedException {
		super.redirectAndBasicAuthTest(); // To change body of overridden methods use File | Settings | File Templates.
	}
}
