/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 geobit.io 
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package io.geobit.chain.providers.balance;

import io.geobit.chain.clients.BitEasyHTTPClient;
import io.geobit.chain.clients.BlockChainHTTPClient;
import io.geobit.chain.clients.BlockCypherHTTPClient;
import io.geobit.chain.clients.BlockExplorerHTTPClient;
import io.geobit.chain.clients.BlockrHTTPClient;
import io.geobit.chain.clients.ChainHTTPClient;
import io.geobit.chain.clients.HelloBlockHTTPClient;
import io.geobit.chain.clients.SoChainHTTPClient;
import io.geobit.chain.providers.Providers;
import io.geobit.common.providers.BalanceProvider;

public class BalanceProviders extends Providers<BalanceProvider> {


	public BalanceProviders() {
		super();

		BalanceProvider a=new BitEasyHTTPClient();
		add(a);
		BalanceProvider b=new BlockChainHTTPClient();  
		add(b);
		BalanceProvider c=new BlockExplorerHTTPClient();
		add(c);
		BalanceProvider d=new BlockrHTTPClient();
		add(d);
		BalanceProvider e=new HelloBlockHTTPClient();
		add(e);
		BalanceProvider f=new ChainHTTPClient();
		add(f);
		BalanceProvider g=new BlockCypherHTTPClient();
		add(g);
		BalanceProvider h=new SoChainHTTPClient();
		add(h);


	}





}
