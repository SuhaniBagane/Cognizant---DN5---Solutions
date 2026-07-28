import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileServiceTest {

    @Test
    void testFileIO() {

        FileReader reader = mock(FileReader.class);

        FileWriter writer = mock(FileWriter.class);

        when(reader.read())

                .thenReturn("Mock File Content");

        FileService service =
                new FileService(reader, writer);

        assertEquals("Processed Mock File Content",
                service.processFile());

    }

}