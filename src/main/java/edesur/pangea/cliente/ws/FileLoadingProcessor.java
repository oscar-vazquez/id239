package edesur.pangea.cliente.ws;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLoadingProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String home = System.getProperty("karaf.home");
        String filename = exchange.getIn().getBody(String.class);

        Path path = FileSystems.getDefault().getPath(home).resolve("work").resolve("contratacion");

        if (filename != null) {
            File file = new File(path.toFile(), filename + ".json");

            if (!file.exists()) {
                throw new FileNotFoundException(String.format("File %s not found", filename));
            }

            String content = new String(Files.readAllBytes(file.toPath()));
            exchange.getIn().setBody(content);
        }
    }
}
