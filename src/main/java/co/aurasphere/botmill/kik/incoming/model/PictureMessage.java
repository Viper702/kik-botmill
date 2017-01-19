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
package co.aurasphere.botmill.kik.incoming.model;

import co.aurasphere.botmill.kik.model.Attribution;

/**
 * The Class PictureMessage.
 * 
 * @author Alvin P. Reyes
 */
public class PictureMessage extends IncomingMessage {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The pic url. */
	private String picUrl;
	
	/** The attribution. */
	private Attribution attribution;
	
	/**
	 * Gets the pic url.
	 *
	 * @return the pic url
	 */
	public String getPicUrl() {
		return picUrl;
	}
	
	/**
	 * Sets the pic url.
	 *
	 * @param picUrl the new pic url
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	/**
	 * Gets the attribution.
	 *
	 * @return the attribution
	 */
	public Attribution getAttribution() {
		return attribution;
	}
	
	/**
	 * Sets the attribution.
	 *
	 * @param attribution the new attribution
	 */
	public void setAttribution(Attribution attribution) {
		this.attribution = attribution;
	}
	
}
