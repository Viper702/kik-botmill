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
package co.aurasphere.botmill.kik.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * The Class JsonToActionFrame.
 * 
 * @author Alvin P. Reyes
 */
public class JsonToActionFrame {
	
	/** The json text action. */
	@SerializedName("jsonkikbotmill")
	private List<JsonTextAction> jsonTextAction;

	/**
	 * Gets the json text action.
	 *
	 * @return the json text action
	 */
	public List<JsonTextAction> getJsonTextAction() {
		return jsonTextAction;
	}

	/**
	 * Sets the json text action.
	 *
	 * @param jsonTextAction the new json text action
	 */
	public void setJsonTextAction(List<JsonTextAction> jsonTextAction) {
		this.jsonTextAction = jsonTextAction;
	}
	
	
}