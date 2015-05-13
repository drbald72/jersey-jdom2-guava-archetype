package ${groupId}.common.jdom;

import org.jdom2.input.SAXBuilder;

public class SAXBuilderFactory {

    public SAXBuilder create() {
        // TODO: add namespace support
        return new SAXBuilder();
    }
}

