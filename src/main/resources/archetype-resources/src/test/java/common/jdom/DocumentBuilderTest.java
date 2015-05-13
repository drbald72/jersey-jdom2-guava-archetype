package ${groupId}.common.jdom;

import org.jdom2.Document;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DocumentBuilderTest {

    private static final String FAKE_XML = "<root><child1>text content</child1></root>";

    @Test
    public void testLoadFromString() throws Exception {
        DocumentBuilder testObject = new DocumentBuilder(new SAXBuilderFactory());
        Document document = testObject.loadFromString(FAKE_XML);
        assertNotNull(document);
        assertEquals("root", document.getRootElement().getName());
        assertEquals("child1", document.getRootElement().getChild("child1").getName());
        assertEquals("text content", document.getRootElement().getChild("child1").getText());
    }

    @Test
    public void testLoadFromStream() throws Exception {
        DocumentBuilder testObject = new DocumentBuilder(new SAXBuilderFactory());

        try(InputStream stringStream = new ByteArrayInputStream(FAKE_XML.getBytes())) {
            Document document = testObject.loadFromStream(stringStream);
            assertNotNull(document);
            assertEquals("root", document.getRootElement().getName());
            assertEquals("child1", document.getRootElement().getChild("child1").getName());
            assertEquals("text content", document.getRootElement().getChild("child1").getText());
        }
    }
}
