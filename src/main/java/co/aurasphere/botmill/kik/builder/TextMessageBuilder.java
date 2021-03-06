/*
 * 
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
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
package co.aurasphere.botmill.kik.builder;

import co.aurasphere.botmill.kik.model.BaseBuilder;
import co.aurasphere.botmill.kik.model.Buildable;
import co.aurasphere.botmill.kik.model.Keyboard;
import co.aurasphere.botmill.kik.model.MessageType;
import co.aurasphere.botmill.kik.outgoing.model.TextMessage;

/**
 * The Class TextMessageBuilder.
 * 
 * @author Alvin P. Reyes
 */
public class TextMessageBuilder extends BaseBuilder
		implements Buildable<TextMessage> {
	
	/** The text message. */
	private static TextMessage textMessage;

	/** The instance. */
	private static TextMessageBuilder instance;
	
	/**
	 * Gets the single instance of TextMessageBuilder.
	 *
	 * @return single instance of TextMessageBuilder
	 */
	public static TextMessageBuilder getInstance() {
		if (instance == null) {
			instance = new TextMessageBuilder();
		}
		textMessage = new TextMessage();
		textMessage.setType(MessageType.TEXT);
		return instance;
	}
	
	/**
	 * Instantiates a new text message builder.
	 */
	public TextMessageBuilder() {
		textMessage = new TextMessage();
		textMessage.setType(MessageType.TEXT);
	}
	
	/**
	 * Sets the to.
	 *
	 * @param to the to
	 * @return the text message builder
	 */
	public TextMessageBuilder setTo(String to) {
		textMessage.setTo(to);
		return this;
	}
	
	/**
	 * Sets the body.
	 *
	 * @param body the body
	 * @return the text message builder
	 */
	public TextMessageBuilder setBody(String body) {
		textMessage.setBody(body);
		return this;
	}
	
	/**
	 * Sets the delay.
	 *
	 * @param delay the delay before this message is process. This is in milliseconds.
	 * @return the text message builder
	 */
	public TextMessageBuilder setDelay(Integer delay) {
		textMessage.setDelay(delay);
		return this;
	}
	
	/**
	 * Sets the time type.
	 *
	 * @param typeTime the type time
	 * @return the text message builder
	 */
	public TextMessageBuilder setTimeType(Integer typeTime) {
		textMessage.setTypeTime(String.valueOf(typeTime));
		return this;
	}
	
	/**
	 * Adds the keyboard.
	 *
	 * @param keyboard the keyboard
	 * @return the text message builder
	 */
	public TextMessageBuilder addKeyboard(Keyboard keyboard) {
		textMessage.addKeyboard(keyboard);
		return this;
	}


	/* (non-Javadoc)
	 * @see co.aurasphere.botmill.kik.intf.Buildable#build()
	 */
	@Override
	public TextMessage build() {
		return textMessage;
	}
}
