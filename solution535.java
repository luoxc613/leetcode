public class Codec {
    Map<Integer,String> m=new HashMap<>();
    int i=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        m.put(i,longUrl);
        return "http://tinyurl.com"+i++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String s=shortUrl.replace("http://tinyurl.com","");
        return m.get(Integer.parseInt(s));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
