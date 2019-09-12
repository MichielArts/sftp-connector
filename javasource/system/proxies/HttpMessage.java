// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class HttpMessage
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject httpMessageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.HttpMessage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HttpVersion("HttpVersion"),
		Content("Content");

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

	public HttpMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.HttpMessage"));
	}

	protected HttpMessage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject httpMessageMendixObject)
	{
		if (httpMessageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.HttpMessage", httpMessageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.HttpMessage");

		this.httpMessageMendixObject = httpMessageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'HttpMessage.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.HttpMessage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.HttpMessage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.HttpMessage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("System.HttpRequest", mendixObject.getType()))
			return system.proxies.HttpRequest.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("System.HttpResponse", mendixObject.getType()))
			return system.proxies.HttpResponse.initialize(context, mendixObject);

		return new system.proxies.HttpMessage(context, mendixObject);
	}

	public static system.proxies.HttpMessage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.HttpMessage.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of HttpVersion
	 */
	public final java.lang.String getHttpVersion()
	{
		return getHttpVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of HttpVersion
	 */
	public final java.lang.String getHttpVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HttpVersion.toString());
	}

	/**
	 * Set value of HttpVersion
	 * @param httpversion
	 */
	public final void setHttpVersion(java.lang.String httpversion)
	{
		setHttpVersion(getContext(), httpversion);
	}

	/**
	 * Set value of HttpVersion
	 * @param context
	 * @param httpversion
	 */
	public final void setHttpVersion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String httpversion)
	{
		getMendixObject().setValue(context, MemberNames.HttpVersion.toString(), httpversion);
	}

	/**
	 * @return value of Content
	 */
	public final java.lang.String getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final java.lang.String getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Content.toString());
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(java.lang.String content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String content)
	{
		getMendixObject().setValue(context, MemberNames.Content.toString(), content);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return httpMessageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.HttpMessage that = (system.proxies.HttpMessage) obj;
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
		return "System.HttpMessage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
