// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftp.proxies;

public class ExplorerFile extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SFTP.ExplorerFile";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ContentsAsString("ContentsAsString"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ExplorerFile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SFTP.ExplorerFile"));
	}

	protected ExplorerFile(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject explorerFileMendixObject)
	{
		super(context, explorerFileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SFTP.ExplorerFile", explorerFileMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SFTP.ExplorerFile");
	}

	/**
	 * @deprecated Use 'ExplorerFile.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sftp.proxies.ExplorerFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sftp.proxies.ExplorerFile.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sftp.proxies.ExplorerFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sftp.proxies.ExplorerFile(context, mendixObject);
	}

	public static sftp.proxies.ExplorerFile load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sftp.proxies.ExplorerFile.initialize(context, mendixObject);
	}

	public static java.util.List<sftp.proxies.ExplorerFile> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sftp.proxies.ExplorerFile> result = new java.util.ArrayList<sftp.proxies.ExplorerFile>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SFTP.ExplorerFile" + xpathConstraint))
			result.add(sftp.proxies.ExplorerFile.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ContentsAsString
	 */
	public final java.lang.String getContentsAsString()
	{
		return getContentsAsString(getContext());
	}

	/**
	 * @param context
	 * @return value of ContentsAsString
	 */
	public final java.lang.String getContentsAsString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ContentsAsString.toString());
	}

	/**
	 * Set value of ContentsAsString
	 * @param contentsasstring
	 */
	public final void setContentsAsString(java.lang.String contentsasstring)
	{
		setContentsAsString(getContext(), contentsasstring);
	}

	/**
	 * Set value of ContentsAsString
	 * @param context
	 * @param contentsasstring
	 */
	public final void setContentsAsString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String contentsasstring)
	{
		getMendixObject().setValue(context, MemberNames.ContentsAsString.toString(), contentsasstring);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sftp.proxies.ExplorerFile that = (sftp.proxies.ExplorerFile) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SFTP.ExplorerFile";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
