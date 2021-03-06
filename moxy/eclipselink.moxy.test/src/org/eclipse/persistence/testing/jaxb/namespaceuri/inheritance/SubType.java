/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - December 2011
package org.eclipse.persistence.testing.jaxb.namespaceuri.inheritance;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "someNamespace")
public class SubType extends BaseType{

    @XmlElement(namespace="uri1")
    public int subTypeProp;

    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }

        if(!(obj instanceof SubType)){
            return false;
        }

        if(subTypeProp != ((SubType)obj).subTypeProp){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubType [subTypeProp=" + subTypeProp + "]";
    }
}
