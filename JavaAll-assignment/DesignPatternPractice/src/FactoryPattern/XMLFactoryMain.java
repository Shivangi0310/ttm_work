package FactoryPattern;

interface XMLParser {
    String parseXMLMessage();
}

class ReceiveOrderXMLParser implements XMLParser {

    @Override
    public String parseXMLMessage() {
        return "Message for receive order";
    }
}

class ErrorXMLParser implements XMLParser {

    @Override
    public String parseXMLMessage() {
        return "Message for error in order";
    }
}

class FeedbackXMLParser implements XMLParser {

    @Override
    public String parseXMLMessage() {
        return "Message for feedback of order";
    }
}

class ResponsesXMLParser implements XMLParser {

    @Override
    public String parseXMLMessage() {
        return "Message for responses of order";
    }
}

abstract class ParsedMessageDisplay {
    void displayMessage() {
        XMLParser xmlParser = getParser();
        System.out.println(xmlParser.parseXMLMessage());
    }

    abstract XMLParser getParser();
}

class ReceivedOrderParsedMessageDisplay extends ParsedMessageDisplay {
    @Override
    XMLParser getParser() {
        return new ReceiveOrderXMLParser();
    }
}

class ErrorParsedMessageDisplay extends ParsedMessageDisplay {
    @Override
    XMLParser getParser() {
        return new ErrorXMLParser();
    }
}

class FeedbackParsedMessageDisplay extends ParsedMessageDisplay {
    @Override
    XMLParser getParser() {
        return new FeedbackXMLParser();
    }
}

class ResponseOrderParsedMessageDisplay extends ParsedMessageDisplay {
    @Override
    XMLParser getParser() {
        return new ResponsesXMLParser();
    }
}

public class XMLFactoryMain {
    public static void main(String[] args) {
        ParsedMessageDisplay parsedMessageDisplay = new ReceivedOrderParsedMessageDisplay();
        parsedMessageDisplay.displayMessage();
        ParsedMessageDisplay parsedMessageDisplay1 = new ErrorParsedMessageDisplay();
        parsedMessageDisplay1.displayMessage();
        ParsedMessageDisplay parsedMessageDisplay2 = new FeedbackParsedMessageDisplay();
        parsedMessageDisplay2.displayMessage();
        ParsedMessageDisplay parsedMessageDisplay3 = new ResponseOrderParsedMessageDisplay();
        parsedMessageDisplay3.displayMessage();
    }
}
