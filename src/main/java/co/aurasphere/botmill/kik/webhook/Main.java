/**
 * 
 * MIT License
 *
 * Copyright (c) 2017 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package co.aurasphere.botmill.kik.webhook;

import co.aurasphere.botmill.kik.KikBotMillContext;
import co.aurasphere.botmill.kik.builder.ConfigurationBuilder;
import co.aurasphere.botmill.kik.builder.TextMessageBuilder;
import co.aurasphere.botmill.kik.configuration.Configuration;
import co.aurasphere.botmill.kik.configuration.KeyboardType;
import co.aurasphere.botmill.kik.configuration.ResponseType;
import co.aurasphere.botmill.kik.factory.ConfigurationFactory;
import co.aurasphere.botmill.kik.json.JsonUtils;
import co.aurasphere.botmill.kik.outgoing.model.TextMessage;


public class Main {

	public Main() {
		
		
		KikBotMillContext.getInstance().setup("", "");
		Configuration config = ConfigurationBuilder.getInstance()
			.setWebhook("")
			.setManuallySendReadReceipts(true)
			.setReceiveDeliveryReceipts(true)
			.setReceiveReadReceipts(true)
			.setReceiveIsTyping(true)
				.addKeyboard()
					.setType(KeyboardType.SUGGESTED)
					.addResponse(ConfigurationFactory.createResponse("", ResponseType.TEXT))
					.addResponse(ConfigurationFactory.createResponse("", ResponseType.TEXT))
				.endKeyboard()
			.buildConfiguration();	// builder everything. return Configuration Object.
		
		
			
			
		System.out.println(JsonUtils.toJson(config));
		
		TextMessage textMessage = TextMessageBuilder.getInstance()
		.setBody("11")
		.setTo("11")
		.addKeyboard()
			.setType(KeyboardType.SUGGESTED)
			.addResponse(ConfigurationFactory.createResponse("", ResponseType.TEXT))
			.addResponse(ConfigurationFactory.createResponse("", ResponseType.TEXT))
		.endKeyboard()
		.build();
		
		System.out.println(JsonUtils.toJson(textMessage));
	}
	public static void main(String[] args) {
		new Main();
	}
}
