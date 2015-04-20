// The Map.Entry interface enables you to work with a map entry

// The entrySet() method declared by the Map interface returns a Set containing the map entries. 
// Each of these element is a Map.Entry object

// Thus, to display the content of the Map, we can use the following method :-

for(Map.Entry<String, String> entry : hmap.entrySet()) {
	String key = entry.getKey();
	String value = entry.getValue();
	// add code
}


// Asymptotic Complexity
// We try to estimate program time and space as a function of the input size.

