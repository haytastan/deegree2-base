//$HeadURL$
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
   Department of Geography, University of Bonn
 and
   lat/lon GmbH

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
----------------------------------------------------------------------------*/
package org.deegree.enterprise;

import java.util.Properties;

/**
 * encapsulates proxy informations and offers a method for setting and unsetting the proxy
 *
 * @version $Revision$
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 */
public class Proxy {
    private String proxyHost = null;

    private String proxyPort = null;

    /** Creates a new instance of Proxy_Impl
     *
     * @param proxyHost
     * @param proxyPort
     */
    public Proxy( String proxyHost, String proxyPort ) {
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    /**
     * retuns the proxy host definition
     *
     * @return the proxy host definition
     *
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * returns the proxy port definition
     *
     * @return the proxy port definition
     */
    public String getProxyPort() {
        return proxyPort;
    }

    /**
     * sets or unsets the proxy by writing the proxyHost and the proxyPort to the system properties.
     *
     * @param proxySet
     */
    public void setProxy( boolean proxySet ) {
        Properties sysProperties = System.getProperties();

        // Specify proxy settings
        sysProperties.put( "proxyHost", proxyHost );
        sysProperties.put( "proxyPort", proxyPort );
        sysProperties.put( "proxySet", "" + proxySet );
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String ret = "proxyHost: " + proxyHost + "\n";
        ret += "proxyPort: " + proxyPort;
        return ret;
    }
}
