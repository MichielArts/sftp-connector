// This file was generated by Mendix Modeler 7.11.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftp.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the SFTP module
	public static boolean bCo_Key(IContext context, sftp.proxies.Key _key)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Key", _key == null ? null : _key.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SFTP.BCo_Key", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static sftp.proxies.Configuration createConfiguration(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "SFTP.CreateConfiguration", params);
			return result == null ? null : sftp.proxies.Configuration.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<sftp.proxies.RemoteFile> dS_GetContents(IContext context, sftp.proxies.Explore _explore)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "SFTP.DS_GetContents", params);
			java.util.List<sftp.proxies.RemoteFile> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<sftp.proxies.RemoteFile>();
				for (IMendixObject obj : objs)
					result.add(sftp.proxies.RemoteFile.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static sftp.proxies.Key dS_GetGeneralKey(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "SFTP.DS_GetGeneralKey", params);
			return result == null ? null : sftp.proxies.Key.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ChangeKey(IContext context, sftp.proxies.Key _key)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Key", _key == null ? null : _key.getMendixObject());
			Core.execute(context, "SFTP.IVK_ChangeKey", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ConfirmHostkey(IContext context, sftp.proxies.HostKeyCheck _hostKeyCheck)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("HostKeyCheck", _hostKeyCheck == null ? null : _hostKeyCheck.getMendixObject());
			Core.execute(context, "SFTP.IVK_ConfirmHostkey", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CreateConfiguration(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "SFTP.IVK_CreateConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteConfiguration(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			Core.execute(context, "SFTP.IVK_DeleteConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GenerateKeyPair(IContext context, sftp.proxies.Key _key)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Key", _key == null ? null : _key.getMendixObject());
			Core.execute(context, "SFTP.IVK_GenerateKeyPair", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_MkDir(IContext context, sftp.proxies.MkDirRequest _mkDirRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MkDirRequest", _mkDirRequest == null ? null : _mkDirRequest.getMendixObject());
			Core.execute(context, "SFTP.IVK_MkDir", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ObtainHostkey(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			Core.execute(context, "SFTP.IVK_ObtainHostkey", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Open(IContext context, sftp.proxies.RemoteFile _remoteFile, sftp.proxies.Explore _explore)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RemoteFile", _remoteFile == null ? null : _remoteFile.getMendixObject());
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			Core.execute(context, "SFTP.IVK_Open", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenExplorer(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			Core.execute(context, "SFTP.IVK_OpenExplorer", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenMkDir(IContext context, sftp.proxies.Explore _explore)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			Core.execute(context, "SFTP.IVK_OpenMkDir", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenRename(IContext context, sftp.proxies.Explore _explore, sftp.proxies.RemoteFile _remoteFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			params.put("RemoteFile", _remoteFile == null ? null : _remoteFile.getMendixObject());
			Core.execute(context, "SFTP.IVK_OpenRename", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenUpload(IContext context, sftp.proxies.Explore _explore)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			Core.execute(context, "SFTP.IVK_OpenUpload", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Put(IContext context, sftp.proxies.Explore _explore, sftp.proxies.ExplorerFile _explorerFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			params.put("ExplorerFile", _explorerFile == null ? null : _explorerFile.getMendixObject());
			Core.execute(context, "SFTP.IVK_Put", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Remove(IContext context, sftp.proxies.RemoteFile _remoteFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RemoteFile", _remoteFile == null ? null : _remoteFile.getMendixObject());
			Core.execute(context, "SFTP.IVK_Remove", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Rename(IContext context, sftp.proxies.RenameRequest _renameRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RenameRequest", _renameRequest == null ? null : _renameRequest.getMendixObject());
			Core.execute(context, "SFTP.IVK_Rename", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveConfiguration(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			Core.execute(context, "SFTP.IVK_SaveConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_TestConfiguration(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			Core.execute(context, "SFTP.IVK_TestConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void pollRemoteDirectory(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "SFTP.PollRemoteDirectory", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean saveConfiguration(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SFTP.SaveConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static sftp.proxies.ExplorerFile sFTP_Get(IContext context, sftp.proxies.RemoteFile _remoteFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RemoteFile", _remoteFile == null ? null : _remoteFile.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "SFTP.SFTP_Get", params);
			return result == null ? null : sftp.proxies.ExplorerFile.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static sftp.proxies.HostKeyCheck sFTP_GetHostKey(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "SFTP.SFTP_GetHostKey", params);
			return result == null ? null : sftp.proxies.HostKeyCheck.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sFTP_MkDir(IContext context, sftp.proxies.MkDirRequest _mkDirRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MkDirRequest", _mkDirRequest == null ? null : _mkDirRequest.getMendixObject());
			Core.execute(context, "SFTP.SFTP_MkDir", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static sftp.proxies.Explore sFTP_Open(IContext context, sftp.proxies.Explore _explore)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "SFTP.SFTP_Open", params);
			return result == null ? null : sftp.proxies.Explore.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sFTP_PollRemoteDirectory(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "SFTP.SFTP_PollRemoteDirectory", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sFTP_Put(IContext context, sftp.proxies.Explore _explore)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Explore", _explore == null ? null : _explore.getMendixObject());
			Core.execute(context, "SFTP.SFTP_Put", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sFTP_Remove(IContext context, sftp.proxies.RemoteFile _remoteFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RemoteFile", _remoteFile == null ? null : _remoteFile.getMendixObject());
			Core.execute(context, "SFTP.SFTP_Remove", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sFTP_Rename(IContext context, sftp.proxies.RenameRequest _renameRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RenameRequest", _renameRequest == null ? null : _renameRequest.getMendixObject());
			Core.execute(context, "SFTP.SFTP_Rename", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static sftp.proxies.Configuration sFTP_TestConnection(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "SFTP.SFTP_TestConnection", params);
			return result == null ? null : sftp.proxies.Configuration.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validate_Configuration(IContext context, sftp.proxies.Configuration _configuration)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SFTP.Validate_Configuration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}