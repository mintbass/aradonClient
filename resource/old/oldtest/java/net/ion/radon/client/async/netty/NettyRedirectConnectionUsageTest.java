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
import net.ion.radon.client.AsyncHttpProviderConfig;
import net.ion.radon.client.async.ProviderUtil;
import net.ion.radon.client.async.RedirectConnectionUsageTest;
import net.ion.radon.client.providers.netty.NettyAsyncHttpProviderConfig;


public class NettyRedirectConnectionUsageTest extends RedirectConnectionUsageTest {
	@Override
	public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
		return ProviderUtil.nettyProvider(config);
	}

	@Override
	protected AsyncHttpProviderConfig getProviderConfig() {
		final NettyAsyncHttpProviderConfig config = new NettyAsyncHttpProviderConfig();
		if (System.getProperty("blockingio") != null) {
			config.addProperty(NettyAsyncHttpProviderConfig.USE_BLOCKING_IO, "true");
		}
		return config;
	}
}
