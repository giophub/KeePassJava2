//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.08 at 09:19:23 PM BST 
//


package org.linguafranca.pwdb.kdbx.jaxb.binding;

import java.util.UUID;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, UUID>
{


    public UUID unmarshal(String value) {
        return (org.linguafranca.pwdb.kdbx.Helpers.uuidFromBase64(value));
    }

    public String marshal(UUID value) {
        return (org.linguafranca.pwdb.kdbx.Helpers.base64FromUuid(value));
    }

}
