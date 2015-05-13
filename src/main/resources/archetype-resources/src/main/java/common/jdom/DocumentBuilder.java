package ${groupId}.common.jdom;

import org.jdom2.Document;
import org.jdom2.JDOMException;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

public class DocumentBuilder {

    private final SAXBuilderFactory saxBuilderFactory;

    @Inject
    DocumentBuilder(SAXBuilderFactory saxBuilderFactory) {
        this.saxBuilderFactory = saxBuilderFactory;
    }
    
    public Document loadFromString(String xmlContent) throws JDOMException, IOException {
        return saxBuilderFactory.create().build(new StringReader(xmlContent));
    }

    public Document loadFromStream(InputStream inputStream) throws JDOMException, IOException {
        return saxBuilderFactory.create().build(inputStream);
    }
}
