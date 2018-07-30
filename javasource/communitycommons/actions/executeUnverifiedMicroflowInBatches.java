// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.Misc;

/**
 * Invokes a microflow in batches. The microflow is invoked for each individual item returned by the xpath query. 
 * 
 * The objects will be processed in small batches (based on the batchsize), which makes this function very useful to process large amounts of objects without using much memory. All defaut behavior such as commit events are applied as defined in your microflow. 
 * 
 * Parameters:
 * - xpath: Fully qualified xpath query that indicates the set of objects the microflow should be invoked on. For example:
 * '//System.User[Active = true()]'
 * - microflow: The microflow that should be invoked. Should accept one argument of the same type as the xpath. For example:
 * 'MyFirstModule.UpdateBirthday'
 * - batchsize: The amount of objects that should be processed in a single transaction. When in doubt, 1 is fine, but larger batches (for example; 100) will be faster due to less overhead.
 * - waitUntilFinished: Whether this call should block (wait) until all objects are
 *  processed.
 * 
 * Returns true if the batch has successfully started, or, if waitUntilFinished is true, returns true if the batch succeeded completely. 
 * 
 * Note, if new objects are added to the dataset while the batch is still running, those objects will be processed as well.
 */
public class executeUnverifiedMicroflowInBatches extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String xpath;
	private java.lang.String microflowName;
	private java.lang.Long batchsize;
	private java.lang.Boolean waitUntilFinished;
	private java.lang.Boolean ascending;

	public executeUnverifiedMicroflowInBatches(IContext context, java.lang.String xpath, java.lang.String microflowName, java.lang.Long batchsize, java.lang.Boolean waitUntilFinished, java.lang.Boolean ascending)
	{
		super(context);
		this.xpath = xpath;
		this.microflowName = microflowName;
		this.batchsize = batchsize;
		this.waitUntilFinished = waitUntilFinished;
		this.ascending = ascending;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Misc.executeMicroflowInBatches(xpath, microflowName, batchsize.intValue(), waitUntilFinished.booleanValue(), ascending);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "executeUnverifiedMicroflowInBatches";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
