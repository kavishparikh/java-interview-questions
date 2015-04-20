// The following is not an coding solution, but it explains how the JSON data can be represneted in Java.

// JSON Data
{
	"BookAuthor" : {
		"id":1,
		"firstName":"sample",
		"lastName":"person",
		"Books": [{
				"bookName":"gone with the wind",
				"isbn":  12345
		}]	
	}	
}


// Use Jackson : it is a high performance JSON processor Java library
// The JSON data can be represented as Java objects

// As per the above example, the data can be represented in Java as following
class Books {
	private String bookName;
	private int isbn;

	// Add getter setters
	// NOTE : if fields were public, we wouldn't need getter setter

}

class BookAuthor {
	private int id;
	private String firstName;
	private String lastName;
	private Books[] books;

	// Add getter setters
	// NOTE : if fields were public, we wouldn't need getter setter

}

public class RepresentJSONinJava {

	public static void main(String[] args) {
		try {
			// Converting JSON to java object 
			ObjectMapper mapper = new ObjectMapper();
			
			// Reading from file, converting it to BookWrite class
			BookWriter writer = (BookWriter)mapper.readValue(new File("json.data"), BookWriter.class);
			
			for (Books book; writer.getBooks()) {
				System.out.println(book.getBookName() + "," + book.getISBN()); 	
			}

			// Displaying on console
			System.out.println(BookWriter);	


			// Writing to file, convert user object to JSON string and saving it to file
			BookWriter writer = (BookWriter)mapper.writeValue(new File("bookwriter.json"), BookWriter);
			
			// Java object to JSON, the  writeWithDefaultPrettyPrinter() prints JSON in pretty format
			System.out.println(mapper.writeWithDefaultPrettyPrinter().writeValueAsString(BookWriter));

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}