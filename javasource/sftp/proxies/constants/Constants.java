// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftp.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the SFTP module

	/**
	* Enabling this will redirect logging of the library to the Mendix log. This will show more information about the SSH connection. Could be useful for troubleshooting.,
	*/
	public static boolean getLogLibraryLogging()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("SFTP.LogLibraryLogging");
	}
}