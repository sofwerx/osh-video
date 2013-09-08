/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are Copyright (C) 2013 Sensia Software LLC.
 All Rights Reserved.
 
 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.api.persistence;

import org.sensorhub.api.common.SensorHubException;


/**
 * <p><b>Title:</b>
 * StorageException
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Exception type generated by persistence API
 * </p>
 *
 * <p>Copyright (c) 2013</p>
 * @author Alexandre Robin <alex.robin@sensiasoftware.com>
 * @date Sep 7, 2013
 */
public class StorageException extends SensorHubException
{
    private static final long serialVersionUID = 1459216941261990459L;


    public StorageException(String message)
    {
        super(message);
    }
    
    
    public StorageException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    
    public StorageException(String message, int code, Throwable cause)
    {
        super(message, code, cause);
    }
}
