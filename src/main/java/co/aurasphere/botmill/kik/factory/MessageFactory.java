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
package co.aurasphere.botmill.kik.factory;

import co.aurasphere.botmill.kik.model.Attribution;
import co.aurasphere.botmill.kik.model.KeyValuePair;

/**
 * A factory for creating Message objects.
 */
public class MessageFactory {

	/**
	 * Creates a new Message object.
	 *
	 * @param name the name
	 * @param iconUrl the icon url
	 * @return the attribution
	 */
	public static Attribution createAttribution(String name,String iconUrl) {
		return new Attribution(name,iconUrl);
	}
	
	/**
	 * Creates a new Message object.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the key value pair
	 */
	public static KeyValuePair createKeyValuePair(String key, String value) {
		return new KeyValuePair(key,value);
	}
}
