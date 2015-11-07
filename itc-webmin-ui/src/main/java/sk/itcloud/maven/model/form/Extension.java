//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.05 at 12:17:15 PM CET
//

package sk.itcloud.maven.model.form;

import java.io.Serializable;
import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 5, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "Build Extentions")
public class Extension implements Serializable
{
	@FormField(title = "Group Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String groupId;

	@FormField(title = "Artifact Id", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String artifactId;

	@FormField(title = "Title", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter")
	protected String version;

	/**
	 * Gets the value of the groupId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroupId()
	{
		return groupId;
	}

	/**
	 * Sets the value of the groupId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGroupId(String value)
	{
		this.groupId = value;
	}

	/**
	 * Gets the value of the artifactId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtifactId()
	{
		return artifactId;
	}

	/**
	 * Sets the value of the artifactId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtifactId(String value)
	{
		this.artifactId = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value)
	{
		this.version = value;
	}

}
