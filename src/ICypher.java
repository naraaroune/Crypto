
public interface ICypher {

	String generatedKey();
	String encode(String message, String key);
    String decode(String crypted, String key);
}
