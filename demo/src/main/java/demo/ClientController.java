package demo;

import java.io.IOException;
import java.io.StringWriter;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	
	public String formatXML()
	{
		
		String xml = "<note><to>Tove</to><from>Jani</from><heading><heading>Reminder</heading></heading><body>Don't forget me this weekend!</body></note>";
		final StringWriter sw  = new StringWriter();
	    try {
			final OutputFormat format = OutputFormat.createPrettyPrint();
			final org.dom4j.Document document = DocumentHelper.parseText(xml);
	        final XMLWriter writer = new XMLWriter(sw, format);
	        writer.write(document);
		} catch (DocumentException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sw.toString();
	}
	

}